package com.fernando.agendacontato.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fernando.agendacontato.domain.Contato;
import com.fernando.agendacontato.services.ContatoService;

@RestController
@RequestMapping(value="/contatos")
public class ContatoResource {
	
	@Autowired
	private ContatoService service;
	
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Contato> listar() {
		Contato cont1 = new Contato(1, "fernando", "masculino", "3237-2451", "costa.fb@hotmail.com");
		Contato cont2 = new Contato(2, "maria", "feminino", "3237-2451", "maria.fb@hotmail.com");
		
		List<Contato> lista = new ArrayList<>();
		lista.add(cont1);
		lista.add(cont2);
		
		return lista;
	}
	
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> findById(@PathVariable Integer id) {
		Contato obj = service.findById(id);
		
		return ResponseEntity.ok().body(obj);
	}
}
