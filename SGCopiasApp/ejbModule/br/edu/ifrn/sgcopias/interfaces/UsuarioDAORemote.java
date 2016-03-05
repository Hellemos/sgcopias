package br.edu.ifrn.sgcopias.interfaces;

import javax.ejb.Remote;

import br.edu.ifrn.sgcopias.entidades.Usuario;

@Remote
public interface UsuarioDAORemote {
	public void persistir (Usuario usuario);
	public Usuario buscar (int idUsuario);
	//public void login(String matricula, String senha);
}
