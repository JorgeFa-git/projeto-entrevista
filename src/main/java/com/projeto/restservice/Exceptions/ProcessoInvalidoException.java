package com.projeto.restservice.Exceptions;

public class ProcessoInvalidoException extends RuntimeException{
    public ProcessoInvalidoException() {
        super("Processo não encontrado");
    }
}
