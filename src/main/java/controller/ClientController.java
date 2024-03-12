package controller;

import entity.ClientEntity;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.boot.autoconfigure.security.oauth2.server.servlet.OAuth2AuthorizationServerProperties;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

public class ClientController {

import java.util.UUID;

    @RestController
    @Tag(name = "Assoul endpoints")
    public class EmployeeController {

        private final ClientController service;

        public EmployeeController(OAuth2AuthorizationServerProperties.ClientService service) {
            this.service = service;
        }

        @GetMapping("/users/{id}")
        public ClientEntity getEmployee(@PathVariable("id") UUID employeeId){
            return service.getEmployeeById(employeeId);
        }

        @GetMapping("/all")
        public List<ClientEntity> getAllUsers(){
            return service.getAllClient();
        }

        @PostMapping("/createUser")
        public ClientEntity createEmployee(@RequestBody ClientEntity employee){
            return service.CreateClient(employee);
        }

        @PutMapping("/update/{id}")
        public void updateEmployeeAge(@PathVariable UUID id,
                                      @RequestParam Integer age ){
            service.updateClientAge(id,age);
        }
    }












}
