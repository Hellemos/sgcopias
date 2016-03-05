package br.edu.ifrn.sgcopias.entidades;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class UsuarioOperador extends Usuario{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@OneToMany (mappedBy = "usuarioOperador")
	private List<Solicitacao> solicitacoesManipuladas;
	
	public UsuarioOperador(){
		
	}

	public List<Solicitacao> getSolicitacoesManipuladas() {
		return solicitacoesManipuladas;
	}

	public void setSolicitacoesManipuladas(List<Solicitacao> solicitacoesManipuladas) {
		this.solicitacoesManipuladas = solicitacoesManipuladas;
	}
	
	

}
