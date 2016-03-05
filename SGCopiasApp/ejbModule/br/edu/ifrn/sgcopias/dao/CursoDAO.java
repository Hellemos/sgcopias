package br.edu.ifrn.sgcopias.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.edu.ifrn.sgcopias.entidades.Curso;
import br.edu.ifrn.sgcopias.interfaces.CursoDAORemote;

@Stateless
public class CursoDAO implements CursoDAORemote{

	public CursoDAO(){
		
	}
	@PersistenceContext (unitName = "SGCopiasAppPU")
	EntityManager entityManager;
	
	@Override
	public void persistir(Curso curso) {
		entityManager.persist(curso);
		
	}

	@Override
	public Curso buscar(int idCurso) {
		Curso curso = entityManager.find(Curso.class, idCurso);
		return curso;
	}

	@Override
	public List<Curso> listarCurso() {
		Query q = entityManager.createQuery("select cs from Curso cs");
		List<Curso> cs = q.getResultList();
		return cs;
	}

	@Override
	public List<Curso> listarCursoPorDep(int idDep) {
		Query q = entityManager.createQuery("select cs from Curso cs where cs.departamento.idDepartamento = idDep");
		List<Curso> cs = q.getResultList();
		return cs;
	}

}
