package br.edu.ifrn.ManagedBean;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.edu.ifrn.sgcopias.entidades.Departamento;
import br.edu.ifrn.sgcopias.interfaces.DepartamentoDAORemote;

@ManagedBean
@RequestScoped
public class DepartamentoBEAN {

	@EJB
	private DepartamentoDAORemote departamentoBean;
	private Departamento departamento;
	
	public List<Departamento> getListaDepartamento(){
		
		return departamentoBean.listarDepartamento();
	}
	
	public Departamento getDepartamento() {
		return departamento;
	}


	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
}
