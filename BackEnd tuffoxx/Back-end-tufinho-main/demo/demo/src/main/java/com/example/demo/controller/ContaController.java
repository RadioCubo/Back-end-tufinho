package com.example.demo.controller;


import com.example.demo.DTO.ContaDTO;
import com.example.demo.DTO.ContaRequest;
import com.example.demo.entity.Conta;
import com.example.demo.mapper.ContaMapper;
import com.example.demo.service.ContaService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contas")
public class ContaController {
    private final ContaService service;

    public ContaController(ContaService service) {
        this.service = service;
    }
    //@GetMapping("/{id}")
    //public Conta buscar(@PathVariable Long id) {
    //return service.buscarPorId(id);}

    @GetMapping("/{id}")
    public ContaDTO buscarPorId(@PathVariable Long id) {
        Conta conta = service.buscarPorId(id);
        return ContaMapper.paraDTO(conta);

    }
        @PostMapping
        @ResponseStatus (HttpStatus.CREATED)
        public ContaDTO criar(
                @Valid @RequestBody ContaRequest r){
            Conta conta = service.criar(r);
            return ContaMapper.paraDTO(conta);
        }
    }


