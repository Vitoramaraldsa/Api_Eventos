package com.eventos.demo.resources;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.eventos.demo.model.Evento;
import com.eventos.demo.repository.EventoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;






@Api(value = "API REST Eventos")
@RestController
@RequestMapping("/evento")
public class EventoResource {

	@Autowired
	private EventoRepository repository;
	
	@ApiOperation(value = "Retorna uma lista de Eventos")
	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<Evento> listaEventos() {
		Iterable<Evento> listaEventos = repository.findAll();
		return listaEventos;
	}
	
	@ApiOperation(value = "Retorna um evento específico")
	@GetMapping(value = "/{codigo}" , produces="application/json")
	public @ResponseBody Evento evento(@PathVariable(value = "codigo") long codigo) {
	    Evento e = repository.findByCODIGO(codigo);
		return e;
	}
	
	@ApiOperation(value = "Cadastra um novo Evento")
	@PostMapping()
	public Evento CadastraEvento(@RequestBody @Valid Evento evento) {
		repository.save(evento);
		return evento;
	}
	
	@ApiOperation(value = "Deleta um Evento")
	@DeleteMapping()
	public Evento DeletaEvento(@RequestBody Evento evento) {
		repository.delete(evento);
		return evento;
	}
	
	
}
