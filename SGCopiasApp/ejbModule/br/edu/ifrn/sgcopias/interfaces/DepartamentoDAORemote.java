package br.edu.ifrn.sgcopias.interfaces;

import java.util.List;

import javax.ejb.Remote;

import br.edu.ifrn.sgcopias.entidades.Departamento;

@Remote
public interface DepartamentoDAORemote {
	public void persistir (Departamento departamento);
	public Departamento buscar (int idDepartamento);
	public List<Departamento> listarDepartamento();
}
