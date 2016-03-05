package br.edu.ifrn.sgcopias.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.edu.ifrn.sgcopias.entidades.UsuarioOperador;
import br.edu.ifrn.sgcopias.interfaces.UsuarioOperadorDAORemote;

@Stateless
public class UsuarioOperadorDAO implements UsuarioOperadorDAORemote{

	public UsuarioOperadorDAO(){
		
	}
	@PersistenceContext (unitName = "SGCopiasAppPU")
	EntityManager entityManager;
	
	@Override
	public void persistir(UsuarioOperador usuarioOperador) {
		entityManager.persist(usuarioOperador);
		
	}

	@Override
	public UsuarioOperador buscar(int idUsuarioOperador) {
		UsuarioOperador usuarioOperador = entityManager.find(UsuarioOperador.class, idUsuarioOperador);
		return usuarioOperador;
	}

	

}