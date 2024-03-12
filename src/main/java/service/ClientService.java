package service;

import ch.qos.logback.core.net.server.Client;
import controller.ClientController;
import entity.ClientEntity;
import entity.ClientRepository;
import org.aspectj.weaver.ast.Var;
import org.springframework.boot.autoconfigure.integration.IntegrationProperties;
import org.springframework.boot.autoconfigure.pulsar.PulsarProperties;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.events.Event;

import javax.swing.text.html.parser.Entity;
import java.util.List;
import java.util.UUID;

@Service
public class ClientService {
    private final ClientRepository repository;

    public ClientService(ClientRepository ClientRepository) {
        this.repository = ClientRepository;
    }

    public ClientEntity getEmployeeById (UUID id) {
        var ClientEntity = repository.findById(id).get();


        return ClientEntity;


public ClientEntity createClient(ClientEntity Client){
        return repository.save(Client);
}

public void deleteClient(long id) {
    ClientRepository.deleteById(id);
}
}









}
