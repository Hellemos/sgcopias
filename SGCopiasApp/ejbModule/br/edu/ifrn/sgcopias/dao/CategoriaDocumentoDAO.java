package br.edu.ifrn.sgcopias.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.edu.ifrn.sgcopias.entidades.CategoriaDocumento;
import br.edu.ifrn.sgcopias.interfaces.CategoriaDocumentoDAORemote;

@Stateless
public class CategoriaDocumentoDAO implements CategoriaDocumentoDAORemote {

	public CategoriaDocumentoDAO(){
	
	}
	
	@PersistenceContext (unitName = "SGCopiasAppPU")
	EntityManager entityManager;
	
	@Override
	public void persistir(CategoriaDocumento ctgDocumento) {
		entityManager.persist(ctgDocumento);
		
	}

	@Override
	public CategoriaDocumento buscar(int idCtgDocumento) {
		CategoriaDocumento ctgDocumento = entityManager.find(CategoriaDocumento.class, idCtgDocumento);
		return ctgDocumento;
	}
	
	public List<CategoriaDocumento> listarCtgDocumento(){
		Query q = entityManager.createQuery("select ctgDoc from CategoriaDocumento ctgDoc");
		List<CategoriaDocumento> ctgDoc = q.getResultList();
		return ctgDoc;
		/*return entityManager.createQuery("SELECT c FROM CategoriaDocumento c").getResultList();*/
	}

}
