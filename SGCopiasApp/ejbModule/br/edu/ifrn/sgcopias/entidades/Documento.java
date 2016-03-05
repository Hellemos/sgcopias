package br.edu.ifrn.sgcopias.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Documento implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idDocumento;
	private Date dataCriacao;
	private String titulo;
	private int qtdCopias;
	private boolean isColorido;
	private boolean isRetrato;
	
	@OneToOne
	private Arquivo anexo;
	
	@ManyToOne
	private TipoPapel tipoPapel;
	
	@ManyToOne
	private CategoriaDocumento ctgDocumento;
	
	public Documento() {
	}

	public int getIdDocumento() {
		return idDocumento;
	}

	public void setIdDocumento(int idDocumento) {
		this.idDocumento = idDocumento;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getQtdCopias() {
		return qtdCopias;
	}

	public void setQtdCopias(int qtdCopias) {
		this.qtdCopias = qtdCopias;
	}

	public boolean isColorido() {
		return isColorido;
	}

	public void setColorido(boolean isColorido) {
		this.isColorido = isColorido;
	}

	public boolean isRetrato() {
		return isRetrato;
	}

	public void setRetrato(boolean isRetrato) {
		this.isRetrato = isRetrato;
	}

	public Arquivo getAnexo() {
		return anexo;
	}

	public void setAnexo(Arquivo anexo) {
		this.anexo = anexo;
	}

	public TipoPapel getTipoPapel() {
		return tipoPapel;
	}

	public void setTipoPapel(TipoPapel tipoPapel) {
		this.tipoPapel = tipoPapel;
	}

	public CategoriaDocumento getCtgDocumento() {
		return ctgDocumento;
	}

	public void setCtgDocumento(CategoriaDocumento ctgDocumento) {
		this.ctgDocumento = ctgDocumento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anexo == null) ? 0 : anexo.hashCode());
		result = prime * result
				+ ((ctgDocumento == null) ? 0 : ctgDocumento.hashCode());
		result = prime * result
				+ ((dataCriacao == null) ? 0 : dataCriacao.hashCode());
		result = prime * result + idDocumento;
		result = prime * result + (isColorido ? 1231 : 1237);
		result = prime * result + (isRetrato ? 1231 : 1237);
		result = prime * result + qtdCopias;
		result = prime * result
				+ ((tipoPapel == null) ? 0 : tipoPapel.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
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
		Documento other = (Documento) obj;
		if (anexo == null) {
			if (other.anexo != null)
				return false;
		} else if (!anexo.equals(other.anexo))
			return false;
		if (ctgDocumento == null) {
			if (other.ctgDocumento != null)
				return false;
		} else if (!ctgDocumento.equals(other.ctgDocumento))
			return false;
		if (dataCriacao == null) {
			if (other.dataCriacao != null)
				return false;
		} else if (!dataCriacao.equals(other.dataCriacao))
			return false;
		if (idDocumento != other.idDocumento)
			return false;
		if (isColorido != other.isColorido)
			return false;
		if (isRetrato != other.isRetrato)
			return false;
		if (qtdCopias != other.qtdCopias)
			return false;
		if (tipoPapel == null) {
			if (other.tipoPapel != null)
				return false;
		} else if (!tipoPapel.equals(other.tipoPapel))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

}
