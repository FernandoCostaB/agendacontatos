package com.fernando.agendacontato;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fernando.agendacontato.domain.Contato;
import com.fernando.agendacontato.repositories.ContatoRepository;

@SpringBootApplication
public class AgendacontatosApplication implements CommandLineRunner{
	
	@Autowired
	private ContatoRepository categoriaRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(AgendacontatosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Contato cont1 = new Contato(null, "fernando", "masculino", "3237-2451", "costa.fb@hotmail.com");
		Contato cont2 = new Contato(null, "maria", "feminino", "3237-2451", "maria.fb@hotmail.com");
		
		categoriaRepository.saveAll(Arrays.asList(cont1,cont2));
	}
	

	
}
