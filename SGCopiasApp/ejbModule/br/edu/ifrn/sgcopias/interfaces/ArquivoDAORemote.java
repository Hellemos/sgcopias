package br.edu.ifrn.sgcopias.interfaces;

import javax.ejb.Remote;

import br.edu.ifrn.sgcopias.entidades.Arquivo;

@Remote
public interface ArquivoDAORemote {
	public void persistir (Arquivo arquivo);
	public Arquivo buscar (int id);
	
}
