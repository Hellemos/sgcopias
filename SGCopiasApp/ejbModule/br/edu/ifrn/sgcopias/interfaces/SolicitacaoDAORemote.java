package br.edu.ifrn.sgcopias.interfaces;

import java.util.Date;
import java.util.List;

import javax.ejb.Remote;
import br.edu.ifrn.sgcopias.entidades.Solicitacao;

@Remote
public interface SolicitacaoDAORemote {

	public void persistir (Solicitacao solicitacao);
	public Solicitacao buscar (int idSolicitacao);
	public List<Solicitacao> buscarPorSolicitante (String nome);
	public List<Solicitacao> buscarPorDepartamento (String departamento);
	public List<Solicitacao> buscarPorCurso (String curso);
	public List<Solicitacao> buscarPorData (Date dateInc, Date dateFin);
	public void atualizar (Solicitacao solicitacao, int idSolicitacao);
	//public void excluir (int id);
}
