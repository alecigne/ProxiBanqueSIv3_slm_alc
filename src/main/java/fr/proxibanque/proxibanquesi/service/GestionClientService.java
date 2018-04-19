package fr.proxibanque.proxibanquesi.service;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import fr.proxibanque.proxibanquesi.model.Client;

/**
 * Gestion Client : CRUD 
 * @author Sandrine Le Mentec, Anthony Le Cigne
 *
 */

public interface GestionClientService {

	/**
	 * creer un client en appelant l'interface DAO
	 * @param client
	 */
	@POST
	@Path("/client/")
	public void creerClient(Client client);
	
	/**
	 * @return le client recherch� avec son id
	 */
	@GET
	@Path("/client/{idClient}")
	public Client obtenirClient(@PathParam("idClient") long idClient);
	
	/**
	 * @param clientmodif
	 * @return
	 */
	public Client modifierClient(Client clientModif);
	
	/**
	 * 
	 */
	public void supprimerClient();

}
