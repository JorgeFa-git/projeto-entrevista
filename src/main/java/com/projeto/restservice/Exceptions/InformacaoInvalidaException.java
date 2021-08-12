package com.projeto.restservice.Exceptions;

public class InformacaoInvalidaException extends RuntimeException{
    public InformacaoInvalidaException() {
        super("O processo não foi atualizado");
    }
}
