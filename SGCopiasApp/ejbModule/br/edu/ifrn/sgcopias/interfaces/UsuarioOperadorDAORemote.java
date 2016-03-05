package br.edu.ifrn.sgcopias.interfaces;

import javax.ejb.Remote;

import br.edu.ifrn.sgcopias.entidades.UsuarioOperador;

@Remote
public interface UsuarioOperadorDAORemote {
	public void persistir (UsuarioOperador usuarioOperador);
	public UsuarioOperador buscar (int idUsuarioOperador);
}
