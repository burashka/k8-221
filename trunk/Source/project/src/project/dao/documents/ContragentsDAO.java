package project.dao.documents;

import java.sql.Timestamp;

import project.entities.documents.Contragents;

public interface ContragentsDAO {
	public Contragents createDocument(Timestamp dateOfSigning, int document,
			Timestamp endDateOfSigning, int person);

	public Contragents createContragents(Contragents contragents);

	public void removeContragents(Contragents contragents);

	public void updateContragents(Contragents contragents);

	public Contragents findContragents(int document, int person);
}
