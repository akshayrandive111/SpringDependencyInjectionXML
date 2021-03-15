package com.spring.basic.controller;

import com.spring.basic.service.ClientService;

public class ClientController {
    ClientService clientService;

    public ClientController() {
    }

    //    public ClientController(ClientService clientService) {
//        this.clientService = clientService;
//    }

    public String getClientData() {
        return clientService.getClientInformation();
    }

    public void setClientService(ClientService clientService) {
        this.clientService = clientService;
    }

}
