package managedbean;

import javax.faces.event.ActionEvent;
import persisitance.entities.Client;
import persistance.dao.ClientDaoImpl;
import persistance.dao.IClientDao;

/**
 *
 * @author <a href="mailto:sabrinee.ayachi@gmail.com">Sabrine AYACHI</a>
 */
public class ClientManagedBean {
	
	IClientDao dao = new ClientDaoImpl();
	Client clt = new Client();
	
	public void ajouter(ActionEvent e)
	{ dao.ajouterClient(clt);
	}

	public Client getClt() {
		return clt;
	}

	public void setClt(Client clt) {
		this.clt = clt;
	}

}
