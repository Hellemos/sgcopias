package br.edu.ifrn.sgcopias.dao;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.edu.ifrn.sgcopias.entidades.Solicitacao;
import br.edu.ifrn.sgcopias.interfaces.SolicitacaoDAORemote;

@Stateless
public class SolicitacaoDAO implements SolicitacaoDAORemote {
	
	public SolicitacaoDAO(){
		
	}
	@PersistenceContext (unitName = "SGCopiasAppPU")
	EntityManager entityManager;
	
	@Override
	public void persistir(Solicitacao solicitacao) {
		entityManager.persist(solicitacao.getDocumento().getAnexo());
		entityManager.persist(solicitacao.getDocumento());
		entityManager.persist(solicitacao);
		
	}

	@Override
	public Solicitacao buscar(int idSolicitacao) {
		Solicitacao solicitacao = entityManager.find(Solicitacao.class, idSolicitacao);
		return solicitacao;
	}


	@Override
	public List<Solicitacao> buscarPorDepartamento(String departamento) {
		Query query = entityManager.createQuery("select s from Solicitacao s " +
				"where s.departamento = :departamento");
		query.setParameter("departamento", departamento);
		return query.getResultList();
	}

	@Override
	public List<Solicitacao> buscarPorCurso(String curso) {
		Query query = entityManager.createQuery("select s from Solicitacao s " +
				"where s.curso = :curso");
		query.setParameter("curso", curso);
		return query.getResultList();
		
	}

	@Override
	public List<Solicitacao> buscarPorData(Date dateInc, Date dateFin) {
		Query query = entityManager.createQuery("SELECT s FROM Solicitacao s WHERE s.dataCriacao >= " +
				":dateInc AND s.dataFinalizacao <= :dateFin ");
		query.setParameter("dateInc", dateInc);
		query.setParameter("dateFin", dateFin);
		return query.getResultList();
	}

	@Override
	public void atualizar(Solicitacao solicitacao, int idSolicitacao) {
		Solicitacao solicitacaoBusca = entityManager.find(Solicitacao.class, idSolicitacao);
		entityManager.merge(solicitacaoBusca);
		solicitacaoBusca.setDataUltimaAtualizacao(solicitacao.getDataUltimaAtualizacao());
		
	}

	@Override
	public List<Solicitacao> buscarPorSolicitante(String nome) {
		Query query = entityManager.createQuery("select s from Solicitacao s " +
				"where s.nomeSolicitante = :nome");
		query.setParameter("nome", nome);
		return query.getResultList();
	}

}
