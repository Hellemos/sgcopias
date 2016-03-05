package br.edu.ifrn.sgcopias.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.edu.ifrn.sgcopias.entidades.Documento;
import br.edu.ifrn.sgcopias.interfaces.DocumentoDAORemote;

@Stateless
public class DocumentoDAO implements DocumentoDAORemote{

	public DocumentoDAO(){
		
	}
	@PersistenceContext (unitName = "SGCopiasAppPU")
	EntityManager entityManager;
	
	@Override
	public void persistir(Documento documento) {
		entityManager.persist(documento);
		
	}

	@Override
	public Documento buscar(int idDocumento) {
		Documento documento = entityManager.find(Documento.class, idDocumento);
		return documento;
	}


}
