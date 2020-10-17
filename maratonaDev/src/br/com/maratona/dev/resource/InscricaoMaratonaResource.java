package br.com.maratona.dev.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path(value = "/inscricao")
public class InscricaoMaratonaResource {

	@GET
	public String matricula() {
		return "matricula realizada com sucesso!";
	}
}
