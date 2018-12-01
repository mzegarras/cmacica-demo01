package pe.cmacica.labs.labs01.services;

import pe.cmacica.labs.labs01.repository.ClienteRepostory;

public class ClienteService {


    private ClienteRepostory clienteRepostory;

    public ClienteService(){
        this.clienteRepostory = new ClienteRepostory();
    }


    public void guardar(){
        this.clienteRepostory.guardar();
    }

}
