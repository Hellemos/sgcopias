package br.edu.ifrn.ManagedBean;


import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import br.edu.ifrn.sgcopias.entidades.CategoriaDocumento;
import br.edu.ifrn.sgcopias.interfaces.CategoriaDocumentoDAORemote;

@ManagedBean
@RequestScoped
public class CategoriaDocumentoBEAN {
	
	@EJB
	private CategoriaDocumentoDAORemote ctgDocumentoBean;
	private CategoriaDocumento ctgDocumento;
	
	public List<CategoriaDocumento> getlistarCategoria() {
    
        return ctgDocumentoBean.listarCtgDocumento();
	}
	

	public CategoriaDocumento getCtgDocumento() {
		return ctgDocumento;
	}

	public void setCtgDocumento(CategoriaDocumento ctgDocumento) {
		this.ctgDocumento = ctgDocumento;
	}

}
