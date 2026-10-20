package com.example.demo.exception;

public class ContaNaoEncontradaException
        extends RuntimeException {
    public ContaNaoEncontradaException(Long id) {
        super("Conta " + id + " não encontrada");
    }
}

