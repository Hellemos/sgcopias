package br.edu.ifrn.ManagedBean;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.edu.ifrn.sgcopias.entidades.Curso;
import br.edu.ifrn.sgcopias.interfaces.CursoDAORemote;

@ManagedBean
@RequestScoped
public class CursoBEAN {
	
	@EJB
	private CursoDAORemote cursoBean;
	private Curso curso;
	
	public List<Curso> getListarCurso(){
		
		return cursoBean.listarCurso();
	}
	public List<Curso> getListarCursoPorDep(int idDep){
		
		return cursoBean.listarCursoPorDep(idDep);
	}


	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

}
