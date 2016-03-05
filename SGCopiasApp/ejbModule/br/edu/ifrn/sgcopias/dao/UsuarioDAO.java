package br.edu.ifrn.sgcopias.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.edu.ifrn.sgcopias.entidades.Usuario;
import br.edu.ifrn.sgcopias.interfaces.UsuarioDAORemote;

@Stateless
public class UsuarioDAO implements UsuarioDAORemote{

	public UsuarioDAO(){
		
	}
	@PersistenceContext (unitName = "SGCopiasAppPU")
	EntityManager entityManager;
	
	@Override
	public void persistir(Usuario usuario) {
		entityManager.persist(usuario);
		
	}

	@Override
	public Usuario buscar(int idUsuario) {
		Usuario usuario = entityManager.find(Usuario.class, idUsuario);
		return usuario;
	}

	/*@Override
	public void login(String matricula, String senha) {
		Query q = entityManager.createQuery("select user from Usuario user where user.matricula = :matricula");
		q.setParameter("matricula", matricula);
		
		if (q.getSingleResult() != null){
				Usuario user = (Usuario) q.getSingleResult();
				if ( matricula = user.getMatricula() ){
					
				}
				
			}
		}*/
		

}
