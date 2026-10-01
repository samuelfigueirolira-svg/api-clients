package com.lira.api.clients.service;

import com.lira.api.clients.model.Client;
import com.lira.api.clients.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }

    public Client saveClient(Client client){
        return clientRepository.save(client);
    }

    public List<Client> findClients(){
        return clientRepository.findAll();
    }

    public Client findClientById(Long id){
        Optional<Client> client = clientRepository.findById(id);
        if(client.isPresent()){
            return client.get();
        }
        return null;
    }

    public void deleteClient(Long id){
        Optional<Client> client = clientRepository.findById(id);
        if(client.isPresent()){
            clientRepository.deleteById(id);
        }
    }
}
