package br.edu.ifrn.sgcopias.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.edu.ifrn.sgcopias.entidades.CategoriaDocumento;
import br.edu.ifrn.sgcopias.entidades.Departamento;
import br.edu.ifrn.sgcopias.interfaces.DepartamentoDAORemote;

@Stateless
public class DepartamentoDAO implements DepartamentoDAORemote{
	
	public DepartamentoDAO(){
		
	}
	@PersistenceContext (unitName = "SGCopiasAppPU")
	EntityManager entityManager;
	
	@Override
	public void persistir(Departamento departamento) {
		entityManager.persist(departamento);
		
	}
	@Override
	public Departamento buscar(int idDepartamento) {
		Departamento departamento = entityManager.find(Departamento.class, idDepartamento);
		return departamento;
	}
	@Override
	public List<Departamento> listarDepartamento() {
		Query q = entityManager.createQuery("select dep from Departamento dep");
		List<Departamento> dep = q.getResultList();
		return dep;
	}
	

}
