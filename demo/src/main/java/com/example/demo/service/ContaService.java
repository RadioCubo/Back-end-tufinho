package com.example.demo.service;


import com.example.demo.DTO.ContaRequest;
import com.example.demo.entity.Conta;
import com.example.demo.exception.ContaNaoEncontradaException;
import com.example.demo.mapper.ContaMapper;
import com.example.demo.repository.ContaRepository;
import org.springframework.stereotype.Service;
@Service
public class ContaService {

    private final ContaRepository repository;


    public ContaService(ContaRepository repository) {
        this.repository = repository;
    }


    public Conta buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ContaNaoEncontradaException(id));
    }

    public Conta criar(ContaRequest r){
        Conta nova = ContaMapper.paraEntity(r);
        return repository.save(nova);
    }

}
