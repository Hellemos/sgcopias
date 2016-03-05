package br.edu.ifrn.sgcopias.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.edu.ifrn.sgcopias.entidades.UsuarioSolicitante;
import br.edu.ifrn.sgcopias.interfaces.UsuarioSolicitanteDAORemote;

@Stateless
public class UsuarioSolicitanteDAO implements UsuarioSolicitanteDAORemote{

	public UsuarioSolicitanteDAO(){
		
	}
	@PersistenceContext (unitName = "SGCopiasAppPU")
	EntityManager entityManager;
	
	@Override
	public void persistir(UsuarioSolicitante usuarioSolicitante) {
		entityManager.persist(usuarioSolicitante);
		
	}

	@Override
	public UsuarioSolicitante buscar(int idUsuarioSolicitante) {
		UsuarioSolicitante usuarioSolicitante = entityManager.find(UsuarioSolicitante.class, idUsuarioSolicitante);
		return usuarioSolicitante;
	}

}
