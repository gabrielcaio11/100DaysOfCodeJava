package br.com.gabrielcaio.ConsultasPersonalizadas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gabrielcaio.ConsultasPersonalizadas.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
