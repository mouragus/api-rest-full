package br.com.fiap.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/dados")
public class PessoaResources {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String [][] listar(){
		
		String[][] nomes = new String [5][3];
		nomes[0][0] = "Gustavo";
		nomes[0][1] = "459.184.608.37";
		nomes[0][2] = "gumora18@hotmail.com";
		
		
		nomes[1][0] = "Gustavo Balero";
		nomes[1][1] = "12345678910";
		nomes[1][2] = "gubalero@hotmail.com";
		
		
		nomes[2][0] = "Vidal";
		nomes[2][1] = "12345678910";
		nomes[2][2] = "pvidal@hotmail.com";
		
		
		nomes[3][0] = "Breno";
		nomes[3][1] = "12345678910";
		nomes[3][2] = "massamartins@hotmail.com";
		
		
		nomes[4][0] = "Marcelo";
		nomes[4][1] = "12345678910";
		nomes[4][2] = "gimenesmarcelo@hotmail.com";
		
		
		return nomes;
	}
	
	
}
