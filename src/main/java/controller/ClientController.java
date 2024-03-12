package controller;

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
        public EmEntity createEmployee(@RequestBody EmployeeEntity employee){
            return service.createEmployee(employee);
        }

        @PutMapping("/update/{id}")
        public void updateEmployeeAge(@PathVariable UUID id,
                                      @RequestParam Integer age ){
            service.updateEmployeeAge(id,age);
        }
    }












}
