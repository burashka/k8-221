package project.util;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.FacesException;
import javax.faces.FactoryFinder;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.lifecycle.Lifecycle;
import javax.faces.lifecycle.LifecycleFactory;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.atmosphere.cpr.AtmosphereHandler;
import org.atmosphere.cpr.AtmosphereResource;
import org.atmosphere.cpr.AtmosphereResourceEvent;
import org.primefaces.application.PrimeFacesPhaseListener;
import org.primefaces.comet.CometContext;
import org.primefaces.json.JSONException;
import org.primefaces.json.JSONObject;

@SuppressWarnings("rawtypes")
public class CometHandler implements AtmosphereHandler {
	private final static Logger logger = Logger.getLogger(CometHandler.class
			.getName());

	public void onRequest(AtmosphereResource event) throws IOException {
		if (logger.isLoggable(Level.FINE)) {
			logger.fine("Handling comet event");
		}

		HttpServletRequest request = (HttpServletRequest) event.getRequest();
		HttpServletResponse response = (HttpServletResponse) event
				.getResponse();

		if (request.getMethod().equals("GET")) {
			response.setContentType("text/html;charset=UTF-8");
			response.addHeader("Cache-Control", "private");
			response.addHeader("Pragma", "no-cache");
			event.suspend();

			if (logger.isLoggable(Level.FINE))
				logger.log(Level.FINE, "Client:\"{0}\" has subscribed",
						request.getRemoteAddr());

		} else if (request.getMethod().equals("POST")) {
			if (logger.isLoggable(Level.FINE)) {
				logger.fine("Handling publish event request");
			}
			request.setCharacterEncoding("UTF-8");
			response.setCharacterEncoding("UTF-8");
			Set<AtmosphereResource> channelSubscribers = new HashSet<AtmosphereResource>();

			for (AtmosphereResource resource : event.getBroadcaster()
					.getAtmosphereResources()) {
				HttpServletRequest suspendedRequest = (HttpServletRequest) resource
						.getRequest();
				String subscribedChannel = suspendedRequest.getPathInfo()
						.substring(1);
				String channelToBroadcast = (String) request
						.getAttribute(CometContext.CHANNEL_NAME);

				if (subscribedChannel.equalsIgnoreCase(channelToBroadcast)) {
					channelSubscribers.add(resource);
				}
			}

			event.getBroadcaster().broadcast(
					request.getAttribute(CometContext.PUBLISH_DATA));

			// Complete forwarded PrimeFaces ajax request
			LifecycleFactory factory = (LifecycleFactory) FactoryFinder
					.getFactory(FactoryFinder.LIFECYCLE_FACTORY);
			Lifecycle lifecycle = factory
					.getLifecycle(LifecycleFactory.DEFAULT_LIFECYCLE);
			new PrimeFacesPhaseListener().beforePhase(new PhaseEvent(
					FacesContext.getCurrentInstance(), PhaseId.RENDER_RESPONSE,
					lifecycle));
		}
	}

	public void onStateChange(AtmosphereResourceEvent event) throws IOException {
		if (event.getMessage() == null)
			return;

		if (event.isCancelled()) {
			if (logger.isLoggable(Level.FINE))
				logger.fine("Ignoring publishing cancelled event");

			return;
		}

		if (logger.isLoggable(Level.FINE))
			logger.fine("Publishing to subsciber.");

		HttpServletRequest request = (HttpServletRequest) event.getResource()
				.getRequest();
		HttpServletResponse response = ((HttpServletResponse) event
				.getResource().getResponse());

		Object msg = event.getMessage();
		String jsonData = null;
		try {
			jsonData = isBean(msg) ? "{\"data\":"
					+ new JSONObject(msg).toString() + "}" : new JSONObject()
					.put("data", msg.toString()).toString();
		} catch (JSONException e) {
			throw new FacesException(e.getMessage());
		}

		String widget = request.getParameter("widget");
		String script = "<script type=\"text/javascript\">window.parent."
				+ widget + ".handlePublish(" + jsonData + ");</script>";

		PrintWriter writer = response.getWriter();
		writer.write(convert(script));
		writer.flush();

		if (logger.isLoggable(Level.FINE))
			logger.log(Level.FINE, "Publishing to \"{0}\" has completed",
					request.getRemoteAddr());
	}

	private String convert(String script) {
		return script;
	}

	private boolean isBean(Object value) {
		if (value == null)
			return false;

		if (value instanceof Boolean || value instanceof String
				|| value instanceof Number) {
			return false;
		}

		return true;
	}
}
