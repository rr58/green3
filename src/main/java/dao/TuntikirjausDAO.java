package dao;

import java.util.List;
import bean.Tuntikirjaus;

public interface TuntikirjausDAO {

	public abstract void talleta(Tuntikirjaus tuntikirjaus);
	
//	int numero..... numeroa ei ole ollenkaan k�yt�ss�.
//	public abstract Tuntikirjaus etsi(int numero);

	public abstract List<Tuntikirjaus> haeKaikki();
	

}
