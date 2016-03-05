package br.edu.ifrn.sgcopias.entidades;

import java.io.Serializable;
import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.Id;

//Inserção do entity, getters e setters, hashCode
@Entity
public class Arquivo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	private byte[] arquivo; //arrumar isso aqui
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public byte[] getArquivo() {
		return arquivo;
	}
	public void setArquivo(byte[] arquivo) {
		this.arquivo = arquivo;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(arquivo);
		result = prime * result + id;
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
		Arquivo other = (Arquivo) obj;
		if (!Arrays.equals(arquivo, other.arquivo))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	
	
}
