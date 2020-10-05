package com.fernando.agendacontato.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fernando.agendacontato.domain.Contato;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Integer> {
	
}
