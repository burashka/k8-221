package project.util;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ManagedBean(name = "fileUploadController")
@SessionScoped
public class FileUploadController {

	public void handleFileUpload(FileUploadEvent event) {
		System.out.println("chechUpload");
		System.out.println("Uploaded: {}" + event.getFile().getFileName());

		try {
			UploadedFile file = event.getFile();
			System.out.println(file.getContents().toString());
			byte[] source = file.getContents();
			for (int i = 0; i < source.length; i++)
				System.out.print((char) i);

			FacesMessage msg = new FacesMessage("Succesful", event.getFile()
					.getFileName() + " is uploaded.");
			FacesContext.getCurrentInstance().addMessage(null, msg);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}