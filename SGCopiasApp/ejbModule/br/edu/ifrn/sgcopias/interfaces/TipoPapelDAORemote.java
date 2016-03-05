package br.edu.ifrn.sgcopias.interfaces;

import java.util.List;

import javax.ejb.Remote;

import br.edu.ifrn.sgcopias.entidades.TipoPapel;

@Remote
public interface TipoPapelDAORemote {
	public void persistir (TipoPapel tipoPapel);
	public TipoPapel buscar (int idTipoPapel);
	public List<TipoPapel> listarTipoPapel();
}
