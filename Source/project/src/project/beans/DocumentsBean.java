package project.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import project.entities.documents.Document;
import project.util.BeanManager;
import project.util.ContentController;

@ManagedBean(name = "documentsBean")
@ViewScoped
public class DocumentsBean implements Serializable {
	//Это бин для неподписанных документов

	private static final long serialVersionUID = 1L;
	
	//Неподписанные собственно документы
	private List<Document> documents;
	
	//Выбранный документ
	private Document selected = new Document();
	
	public DocumentsBean() {
		//Тут из дао должна грузиться реальная инфа
		documents = new ArrayList<Document>();
		Document d1 = new Document();
		d1.setNumber("doc1");
		documents.add(d1);
	}

	public String getDocumentName(Document document) {
		return document.getNumber();
	}
	
	public void setSelected(Document selected) {
		//тут что-то происходит в логике когда выбирается документ
		if (selected.equals(this.selected)) {
			this.selected = null;
			ContentController contentController = (ContentController) BeanManager
					.findManagedBean("contentController");
			contentController.changePage("/ui/main.xhtml");

		} else {
			this.selected = selected;
			ContentController contentController = (ContentController) BeanManager
					.findManagedBean("contentController");
			contentController.changePage("/ui/documentssignaturepage.xhtml");
		}
	}

	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}

	public List<Document> getDocuments() {
		return documents;
	}
}
