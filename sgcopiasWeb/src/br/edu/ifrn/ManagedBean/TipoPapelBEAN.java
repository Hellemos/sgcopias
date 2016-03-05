package br.edu.ifrn.ManagedBean;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.edu.ifrn.sgcopias.entidades.TipoPapel;
import br.edu.ifrn.sgcopias.interfaces.TipoPapelDAORemote;

@ManagedBean
@RequestScoped
public class TipoPapelBEAN {
	
	@EJB
	private TipoPapelDAORemote tipoPapelBean;
	private TipoPapel tipoPapel;
	
	public List<TipoPapel> getListarTipoPapel(){
		
		return tipoPapelBean.listarTipoPapel();
	}
	public TipoPapel getTipoPapel() {
		return tipoPapel;
	}
	public void setTipoPapel(TipoPapel tipoPapel) {
		this.tipoPapel = tipoPapel;
	}

}
