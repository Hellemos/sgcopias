package br.edu.ifrn.sgcopias.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.edu.ifrn.sgcopias.entidades.Status;
import br.edu.ifrn.sgcopias.interfaces.StatusDAORemote;

@Stateless
public class StatusDAO implements StatusDAORemote{

	public StatusDAO(){
		
	}
	
	
	@PersistenceContext (unitName = "SGCopiasAppPU")
	EntityManager entityManager;
	@Override
	public void persistir(Status status) {
		entityManager.persist(status);
		
	}

	@Override
	public Status buscar(int idStatus) {
		Status status = entityManager.find(Status.class, idStatus);
		return status;
	}

	@Override
	public void atualizar(Status status, int idStatus) {
		Status statusBusca = entityManager.find(Status.class, idStatus);
		entityManager.merge(statusBusca);
	/*
	 * O dataChange foi retirado
	 * 	statusBusca.setDataChange(status.getDataChange());
*/
	}

}
