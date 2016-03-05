package br.edu.ifrn.sgcopias.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.edu.ifrn.sgcopias.entidades.TipoPapel;
import br.edu.ifrn.sgcopias.interfaces.TipoPapelDAORemote;

@Stateless
public class TipoPapelDAO implements TipoPapelDAORemote{

	public TipoPapelDAO(){
		
	}
	
	@PersistenceContext (unitName = "SGCopiasAppPU")
	EntityManager entityManager;
	
	
	@Override
	public void persistir(TipoPapel tipoPapel) {
		entityManager.persist(tipoPapel);
		
	}

	@Override
	public TipoPapel buscar(int idTipoPapel) {
		TipoPapel tipoPapel = entityManager.find(TipoPapel.class, idTipoPapel);
		return tipoPapel;
	}

	@Override
	public List<TipoPapel> listarTipoPapel() {
		Query q = entityManager.createQuery("select tipPapel from TipoPapel tipPapel");
		List<TipoPapel> tipPapel = q.getResultList();
		return tipPapel;
	}
}
