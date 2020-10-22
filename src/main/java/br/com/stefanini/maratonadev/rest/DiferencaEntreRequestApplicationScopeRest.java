package br.com.stefanini.maratonadev.rest;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import br.com.stefanini.maratonadev.service.DiferencaEntreRequestApplicationScopeService;

@Path("teste")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class DiferencaEntreRequestApplicationScopeRest {

	
  @Inject DiferencaEntreRequestApplicationScopeService service; //CHAMANDO A SERVICE
	
	
	@GET
	@Path("/{nome}")
	public Response adicionarLista(@PathParam("nome")String nome) {
		
		service.adicionar(nome); //ADICIONAR NA LISTA
		return Response.status(Status.ACCEPTED) //MOSTRA  O RESULTADO DA LISTA
				.entity(service.listar())
				.build();
				
	}
	
	
	@GET
	@Path("/")
	public Response obterLista() {
		
		return Response
				.status(Status.OK)
				.entity(service.listar())
				.build();
		
	}
}
