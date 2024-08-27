package br.com.gabrielcaio.ConsultasPersonalizadas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.gabrielcaio.ConsultasPersonalizadas.entities.Client;
import br.com.gabrielcaio.ConsultasPersonalizadas.repository.ClientRepository;

@Service
public class ClientService {

	private ClientRepository clientRepository;

	public ClientService(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}

	public Client findById(Long id) {
		return clientRepository.findById(id).get();
	}

	public List<Client> findAll() {
		return clientRepository.findAll();
	}

	public Client create(Client client) {
		return clientRepository.save(client);
	}

	public Client update(Client client) {
		return clientRepository.save(client);
	}

	public void delete(Long id) {
		clientRepository.deleteById(id);
	}
}
