package com.projeto.restservice.Exceptions;

public class SemProcessoCadastradosException extends RuntimeException {
    public SemProcessoCadastradosException() {
        super("Nao foram encontrados processos cadastrados");
    }
}
