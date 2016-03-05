package br.edu.ifrn.sgcopias.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.edu.ifrn.sgcopias.entidades.Mensagem;
import br.edu.ifrn.sgcopias.interfaces.MensagemDAORemote;

@Stateless
public class MensagemDAO implements MensagemDAORemote{

	public MensagemDAO() {
		
	}
	
	@PersistenceContext (unitName = "SGCopiasAppPU")
	EntityManager entityManager;
	
	@Override
	public void persistir(Mensagem mensagem) {
		entityManager.persist(mensagem);
		
	}

	@Override
	public Mensagem buscar(int idMensagem) {
		Mensagem mensagem = entityManager.find(Mensagem.class, idMensagem);
		return mensagem;
	}

	@Override
	public List<Mensagem> buscarPorSolicitacao(int idSolicitacao) {
		Query query = entityManager.createQuery("select m from Mensagem m " +
				"where m.idSolicitacao = :idSolicitacao");
		query.setParameter("idSolicitacao", idSolicitacao);
		return query.getResultList(); // Provavelmente está errado, deve precisar de um join.
	}

	@Override
	public void atualizar(Mensagem mensagem, int idMensagem) {
		Mensagem mensagemBusca = entityManager.find(Mensagem.class, idMensagem);
		entityManager.merge(mensagemBusca);
		mensagemBusca.setTexto(mensagem.getTexto());
	}


}
