package com.projeto.restservice.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
public class Processo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private Long numero;

    @Nullable
    private String reu;

    public long getId() {
        return id;
    }

    public Long getNumero() {
        return numero;
    }

    @Nullable
    public String getReu() {return reu;}

    public void setId(Long id) {this.id = id;}

    @NotNull
    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public void setReu(@Nullable String reu) {this.reu = reu;}

    @Override
    public String toString() {
        return  " { id=" + id +
                " | numero='" + numero + "' " +
                "| reu='" + reu + "' } ";
    }
}
