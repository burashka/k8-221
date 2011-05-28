package project.util;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

@ManagedBean(name = "fileDownloadController")
@ViewScoped
public class FileDownloadController {

	private StreamedContent file;

	public FileDownloadController() {
		try {
			InputStream stream = new ByteArrayInputStream("aaaaa".getBytes());
			file = new DefaultStreamedContent(stream, "text", "ekey.prj");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public StreamedContent getFile() {
		return file;
	}

	public void setFile(StreamedContent file) {
		this.file = file;
	}
}
