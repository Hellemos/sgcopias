package br.edu.ifrn.sgcopias.entidades;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class UsuarioSolicitante extends Usuario{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@OneToMany (mappedBy = "usuarioSolicitante")
	private List<Solicitacao> solicitacoesCriadas;
	
	public UsuarioSolicitante(){
		
	}

	public List<Solicitacao> getSolicitacoesCriadas() {
		return solicitacoesCriadas;
	}

	public void setSolicitacoesCriadas(List<Solicitacao> solicitacoesCriadas) {
		this.solicitacoesCriadas = solicitacoesCriadas;
	}
	

	
	

}
