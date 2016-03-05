package br.edu.ifrn.sgcopias.interfaces;


import javax.ejb.Remote;

import br.edu.ifrn.sgcopias.entidades.UsuarioSolicitante;

@Remote
public interface UsuarioSolicitanteDAORemote {
	public void persistir (UsuarioSolicitante usuarioSolicitante);
	public UsuarioSolicitante buscar (int idUsuarioSolicitante);
}
