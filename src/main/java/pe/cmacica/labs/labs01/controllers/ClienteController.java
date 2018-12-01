package pe.cmacica.labs.labs01.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import pe.cmacica.labs.labs01.services.ClienteService;
import pe.cmacica.labs.labs01.services.CustomerService;

public class ClienteController {


    private ClienteService clienteService = new ClienteService();

    @Autowired
    private CustomerService customerService;


    public void grabar(){
        clienteService.guardar();
    }


}
