package com.example.demo.controller;


import com.example.demo.entity.Conta;
import com.example.demo.service.ContaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/contas")
public class ContaController {
    private final ContaService service;
    public ContaController(ContaService service) {
        this.service = service;
    }
    @GetMapping("/{id}")
    public Conta buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }
}
