package br.edu.ifrn.sgcopias.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.edu.ifrn.sgcopias.entidades.Arquivo;
import br.edu.ifrn.sgcopias.interfaces.ArquivoDAORemote;

@Stateless
public class ArquivoDAO implements ArquivoDAORemote{

	@PersistenceContext (unitName = "SGCopiasAppPU")
	EntityManager entityManager;
	
	public ArquivoDAO(){
		
	}

	@Override
	public void persistir(Arquivo arquivo) {
		entityManager.persist(arquivo);
		
	}

	@Override
	public Arquivo buscar(int id) {
		Arquivo arquivo = entityManager.find(Arquivo.class, id);
		return arquivo;
	}
	
}
