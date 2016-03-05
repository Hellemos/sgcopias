package br.edu.ifrn.sgcopias.interfaces;

import javax.ejb.Remote;

import br.edu.ifrn.sgcopias.entidades.Documento;

@Remote
public interface DocumentoDAORemote {
	public void persistir (Documento documento);
	public Documento buscar (int idDocumento);
}
