package com.lira.api.clients.controller;

import com.lira.api.clients.model.Client;
import com.lira.api.clients.service.ClientService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;

@RestController
@RequestMapping("/clients")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class ClientController {
    private ClientService clientService;

    public ClientController(ClientService clientService){
        this.clientService = clientService;
    }

    @PostMapping
    public Client saveClient(@RequestBody Client client){
        return clientService.saveClient(client);
    }

    @GetMapping
    public List<Client> findClients(){
        return clientService.findClients();
    }

    @GetMapping("/{id}")
    public Client findClientById(@PathVariable Long id){
        return clientService.findClientById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable Long id){
        clientService.deleteClient(id);
    }
}
