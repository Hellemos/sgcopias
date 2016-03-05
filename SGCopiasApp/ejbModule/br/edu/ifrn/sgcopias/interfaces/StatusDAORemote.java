package br.edu.ifrn.sgcopias.interfaces;

import javax.ejb.Remote;

import br.edu.ifrn.sgcopias.entidades.Status;

@Remote
public interface StatusDAORemote {
	public void persistir (Status status);
	public Status buscar (int idStatus);
	public void atualizar (Status status, int idStatus);
}
