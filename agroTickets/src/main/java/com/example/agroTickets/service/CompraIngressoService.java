package com.example.agroTickets.service;

import com.example.agroTickets.client.EventoClient;
import com.example.agroTickets.client.response.EventoResponse;
import com.example.agroTickets.controller.dto.CompraIngressoDTO;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompraIngressoService {

    @Autowired
    private EventoClient eventoClient;

    @CircuitBreaker(name = "buscaEvento", fallbackMethod = "processaCompraFallBack")
    public EventoResponse processaCompra(CompraIngressoDTO compraIngressoDTO){
        EventoResponse eventoResponse = eventoClient.buscaEvento(compraIngressoDTO.getEvento());
        if(eventoResponse.getQuantidadeIngressos()  > compraIngressoDTO.getQuantidadeIngressos()){
            return  eventoClient.atualizaEvento(compraIngressoDTO);
        }
        return null;
    }

    private EventoResponse processaCompraFallBack(CompraIngressoDTO compraIngressoDTO, Throwable e){
        return new EventoResponse();
    }

}
