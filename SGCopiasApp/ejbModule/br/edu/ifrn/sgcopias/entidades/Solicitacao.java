package br.edu.ifrn.sgcopias.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
//import javax.persistence.ManyToOne;

@Entity
public class Solicitacao implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idSolicitacao;
	private Date dataCriacao;
	private Date dataUltimaAtualizacao;
	private Date dataFinalizacao;
	
	@ManyToOne
	private UsuarioOperador usuarioOperador;
	
	@ManyToOne
	private UsuarioSolicitante usuarioSolicitante;
	
	@OneToMany (mappedBy = "solicitacao")
	private List<Mensagem> mensagens;
	
	@OneToOne
	private Documento documento;
	
	@ManyToOne
	private Status status;

	public Solicitacao() {
	}

	public int getIdSolicitacao() {
		return idSolicitacao;
	}

	public void setIdSolicitacao(int idSolicitacao) {
		this.idSolicitacao = idSolicitacao;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Date getDataUltimaAtualizacao() {
		return dataUltimaAtualizacao;
	}

	public void setDataUltimaAtualizacao(Date dataUltimaAtualizacao) {
		this.dataUltimaAtualizacao = dataUltimaAtualizacao;
	}

	public Date getDataFinalizacao() {
		return dataFinalizacao;
	}

	public void setDataFinalizacao(Date dataFinalizacao) {
		this.dataFinalizacao = dataFinalizacao;
	}

	public Usuario getUsuarioOperador() {
		return usuarioOperador;
	}

	public void setUsuarioOperador(UsuarioOperador usuarioOperador) {
		this.usuarioOperador = usuarioOperador;
	}

	public Usuario getUsuarioSolicitante() {
		return usuarioSolicitante;
	}

	public void setUsuarioSolicitante(UsuarioSolicitante usuarioSolicitante) {
		this.usuarioSolicitante = usuarioSolicitante;
	}

	public List<Mensagem> getMensagens() {
		return mensagens;
	}

	public void setMensagens(List<Mensagem> mensagens) {
		this.mensagens = mensagens;
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dataCriacao == null) ? 0 : dataCriacao.hashCode());
		result = prime * result
				+ ((dataFinalizacao == null) ? 0 : dataFinalizacao.hashCode());
		result = prime
				* result
				+ ((dataUltimaAtualizacao == null) ? 0 : dataUltimaAtualizacao
						.hashCode());
		result = prime * result
				+ ((documento == null) ? 0 : documento.hashCode());
		result = prime * result + idSolicitacao;
		result = prime * result
				+ ((mensagens == null) ? 0 : mensagens.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result
				+ ((usuarioOperador == null) ? 0 : usuarioOperador.hashCode());
		result = prime
				* result
				+ ((usuarioSolicitante == null) ? 0 : usuarioSolicitante
						.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Solicitacao other = (Solicitacao) obj;
		if (dataCriacao == null) {
			if (other.dataCriacao != null)
				return false;
		} else if (!dataCriacao.equals(other.dataCriacao))
			return false;
		if (dataFinalizacao == null) {
			if (other.dataFinalizacao != null)
				return false;
		} else if (!dataFinalizacao.equals(other.dataFinalizacao))
			return false;
		if (dataUltimaAtualizacao == null) {
			if (other.dataUltimaAtualizacao != null)
				return false;
		} else if (!dataUltimaAtualizacao.equals(other.dataUltimaAtualizacao))
			return false;
		if (documento == null) {
			if (other.documento != null)
				return false;
		} else if (!documento.equals(other.documento))
			return false;
		if (idSolicitacao != other.idSolicitacao)
			return false;
		if (mensagens == null) {
			if (other.mensagens != null)
				return false;
		} else if (!mensagens.equals(other.mensagens))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (usuarioOperador == null) {
			if (other.usuarioOperador != null)
				return false;
		} else if (!usuarioOperador.equals(other.usuarioOperador))
			return false;
		if (usuarioSolicitante == null) {
			if (other.usuarioSolicitante != null)
				return false;
		} else if (!usuarioSolicitante.equals(other.usuarioSolicitante))
			return false;
		return true;
	}
	
	
}
