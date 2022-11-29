package com.example.agroTickets.controller.dto;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.UUID;

@Getter
public class CompraIngressoDTO {
    private UUID evento;
    private int quantidadeIngressos;
}
