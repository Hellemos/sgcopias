package br.edu.ifrn.ManagedBean;

import java.util.GregorianCalendar;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.primefaces.model.UploadedFile;

import br.edu.ifrn.sgcopias.entidades.Arquivo;
import br.edu.ifrn.sgcopias.entidades.Documento;
import br.edu.ifrn.sgcopias.entidades.Solicitacao;
import br.edu.ifrn.sgcopias.interfaces.SolicitacaoDAORemote;

@ManagedBean
@RequestScoped
public class SolicitacaoBEAN {
	
	@EJB
	private SolicitacaoDAORemote solicitacaoBean;
	private Solicitacao solicitacao;
	private UploadedFile arquivo;
	public UploadedFile getArquivo() {
		return arquivo;
	}
	public void setArquivo(UploadedFile arquivo) {
		this.arquivo = arquivo;
	}
	
	public SolicitacaoBEAN(){
		solicitacao=new Solicitacao();
		solicitacao.setDocumento(new Documento());
	}
	
	public Solicitacao getSolicitacao() {
		return solicitacao;
	}
	public void setSolicitacao(Solicitacao solicitacao) {
		this.solicitacao = solicitacao;
	}
	
	GregorianCalendar calendar = new GregorianCalendar();
	
	public void salvar(){
		Arquivo arquivoBD = new Arquivo();
		arquivoBD.setArquivo(arquivo.getContents());
		solicitacao.getDocumento().setAnexo(arquivoBD);
		solicitacao.setDataCriacao(calendar.getTime());
		solicitacaoBean.persistir(solicitacao);
		
	}

}
