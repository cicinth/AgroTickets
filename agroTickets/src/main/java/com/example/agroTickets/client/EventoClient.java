package com.example.agroTickets.client;

import com.example.agroTickets.client.response.EventoResponse;
import com.example.agroTickets.controller.dto.CompraIngressoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;


import java.util.UUID;

@FeignClient("eventos")
public interface EventoClient {

    @GetMapping("/eventos/{id}")
    EventoResponse buscaEvento(@PathVariable UUID id);

    @PutMapping("/eventos")
    EventoResponse atualizaEvento(CompraIngressoDTO compraIngressoDTO);

}
