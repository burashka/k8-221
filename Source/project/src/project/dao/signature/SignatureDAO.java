package project.dao.signature;

import project.entities.signature.Signature;

public interface SignatureDAO {
	public Signature createSignature(String hash, String key, int person);
	
	public Signature createSignature(Signature signature);
	
	public void removeSignature(Signature signature);
	
	public void update(Signature signature);
	
	public Signature findSignature(int person);
}
