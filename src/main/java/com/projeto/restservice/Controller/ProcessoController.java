package com.projeto.restservice.Controller;

import com.projeto.restservice.Model.Processo;
import com.projeto.restservice.Negocio.ProcessoNegocio;
import com.projeto.restservice.Persistence.DBUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Consumes;
import java.util.List;

@RestController
public class ProcessoController {

    @Autowired
    DBUtil dbUtil;

    @Autowired
    ProcessoNegocio processoNegocio;

    @PostMapping("/api/processo")
    @Consumes("application/json")
    public ResponseEntity<String> salvaProcesso(@RequestBody List<Processo> processos) {
        try {
            if (processos.isEmpty()) {
                return new ResponseEntity<>("Lista vazia", HttpStatus.NO_CONTENT);
            }

            for (Processo proc : processos) {
                processoNegocio.salvaProcesso(proc);
            }

            return new ResponseEntity<>("Processos incluídos com sucesso!", HttpStatus.OK);

        } catch(Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/api/processo")
    public ResponseEntity<String> pegaProcesso() {
        try {
            List<Processo> processos = processoNegocio.buscaProcesso();

            return new ResponseEntity<>("Processos cadastrados:" + processos.toString(), HttpStatus.OK);

        } catch(Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/api/processo")
    public ResponseEntity<String> atualizaProcesso(@RequestBody Processo processo) {
        try {
            processoNegocio.atualizaProcesso(processo);

            return new ResponseEntity<>(String.format("Processo %s atualizado com sucesso!\n", processo.getNumero()), HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_MODIFIED);
        }
    }

    @DeleteMapping("/api/processo")
    public ResponseEntity<String> deletaProcesso(@RequestBody List<Processo> processos) {
        try {
            if (processos.isEmpty()) {
                return new ResponseEntity<>("Lista vazia", HttpStatus.NO_CONTENT);
            }

            for (Processo proc : processos) {
                processoNegocio.deletaProcesso(proc);
            }

            return new ResponseEntity<>("Processos removidos com sucesso!", HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

}
