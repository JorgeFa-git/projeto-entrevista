package com.projeto.restservice.Negocio;

import com.projeto.restservice.Exceptions.ProcessoInvalidoException;
import com.projeto.restservice.Exceptions.ProcessoJaExisteException;
import com.projeto.restservice.Exceptions.SemProcessoCadastradosException;
import com.projeto.restservice.Model.Processo;
import com.projeto.restservice.Persistence.DBUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProcessoNegocio {

    @Autowired
    DBUtil dbUtil;

    public void salvaProcesso(Processo processo) throws RuntimeException {
        if (dbUtil.findProcessoByNumero(processo.getNumero()) == null) {
            if (processo.getReu() == null) {
                processo.setReu("Réu não informado");
            }

            dbUtil.save(processo);

        } else {
            throw new ProcessoJaExisteException();
        }
    }

    public List<Processo> buscaProcesso() throws RuntimeException {

        List<Processo> processos = dbUtil.findAll();

        if(processos.isEmpty()) {
            throw new SemProcessoCadastradosException();
        }
        return processos;
    }

    public void atualizaProcesso(Processo processo) throws RuntimeException {
        Processo proc = dbUtil.findProcessoByNumero(processo.getNumero());

        if (proc == null) {
            throw new ProcessoInvalidoException();
        }

        proc.setReu(processo.getReu());
        proc.setNumero(processo.getNumero());

        dbUtil.save(proc);
    }

    public void deletaProcesso(Processo processo) throws RuntimeException {
        if (processo.getNumero() == null) {
            throw new ProcessoInvalidoException();
        }else {
            Processo proc = dbUtil.findProcessoByNumero(processo.getNumero());
            dbUtil.deleteById(proc.getId());
        }
    }
}
