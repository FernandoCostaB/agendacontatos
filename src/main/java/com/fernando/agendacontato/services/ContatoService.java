package com.fernando.agendacontato.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fernando.agendacontato.domain.Contato;
import com.fernando.agendacontato.repositories.ContatoRepository;
import com.fernando.agendacontato.services.exceptions.ObjectNotFoundException;



@Service
public class ContatoService {
	
	@Autowired
	private ContatoRepository repo;

	public Contato findById(Integer id) {
		Optional<Contato> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado!"));
	}
	
	
	public Contato insert(Contato obj) {
		obj.setId(null);
		return repo.save(obj);
	}
	
	public Contato update(Contato obj) {
		findById(obj.getId());
		return repo.save(obj);
	}
}
