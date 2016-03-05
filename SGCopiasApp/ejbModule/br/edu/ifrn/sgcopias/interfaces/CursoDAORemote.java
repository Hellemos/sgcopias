package br.edu.ifrn.sgcopias.interfaces;

import java.util.List;

import javax.ejb.Remote;

import br.edu.ifrn.sgcopias.entidades.Curso;

@Remote
public interface CursoDAORemote {
	public void persistir (Curso curso);
	public Curso buscar (int idCurso);
	public List<Curso> listarCurso();
	public List<Curso> listarCursoPorDep(int idDep);
}
