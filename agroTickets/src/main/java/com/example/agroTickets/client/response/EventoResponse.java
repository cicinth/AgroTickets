package com.example.agroTickets.client.response;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class EventoResponse {
    private UUID id;
    private String nome;
    private Long quantidadeIngressos;
    private LocalDateTime dataEvento;
}
