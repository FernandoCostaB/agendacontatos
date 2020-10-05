package com.fernando.agendacontato.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fernando.agendacontato.domain.Contato;
import com.fernando.agendacontato.repositories.ContatoRepository;

@Service
public class ContatoService {
	
	@Autowired
	private ContatoRepository repo;

	public Contato findById(Integer id) {
		Optional<Contato> obj = repo.findById(id);
		return obj.orElse(null);
	}
	
}
