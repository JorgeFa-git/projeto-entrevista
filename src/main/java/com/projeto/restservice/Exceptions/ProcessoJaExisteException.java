package com.projeto.restservice.Exceptions;

public class ProcessoJaExisteException extends RuntimeException{
    public ProcessoJaExisteException() {
        super("Processo ja cadastrado!");
    }
}
