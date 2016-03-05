package br.edu.ifrn.sgcopias.interfaces;

import java.util.List;

import javax.ejb.Remote;

import br.edu.ifrn.sgcopias.entidades.Mensagem;

@Remote
public interface MensagemDAORemote {
	public void persistir (Mensagem mensagem);
	public Mensagem buscar (int idMensagem);
	public List<Mensagem> buscarPorSolicitacao (int idSolicitacao);
	public void atualizar (Mensagem mensagem, int idMensagem);

	
}
