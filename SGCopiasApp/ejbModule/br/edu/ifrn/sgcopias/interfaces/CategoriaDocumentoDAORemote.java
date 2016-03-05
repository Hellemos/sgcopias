package br.edu.ifrn.sgcopias.interfaces;

import java.util.List;

import javax.ejb.Remote;

import br.edu.ifrn.sgcopias.entidades.CategoriaDocumento;

@Remote
public interface CategoriaDocumentoDAORemote {
	public void persistir (CategoriaDocumento ctgDocumento);
	public CategoriaDocumento buscar (int idCtgDocumento);
	public List<CategoriaDocumento> listarCtgDocumento();

}
