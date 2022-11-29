package com.example.agroTickets.controller;

import com.example.agroTickets.client.EventoClient;
import com.example.agroTickets.client.response.EventoResponse;
import com.example.agroTickets.controller.dto.CompraIngressoDTO;
import com.example.agroTickets.service.CompraIngressoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/compra")
public class CompraIngressoController {

    @Autowired
    private CompraIngressoService compraIngressoService;

    @PostMapping
    public EventoResponse compraIngresso(@RequestBody CompraIngressoDTO compraIngressoDTO){
       return compraIngressoService.processaCompra(compraIngressoDTO);
    }
}
