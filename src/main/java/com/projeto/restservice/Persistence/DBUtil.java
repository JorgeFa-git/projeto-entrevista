package com.projeto.restservice.Persistence;

import com.projeto.restservice.Model.Processo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DBUtil extends JpaRepository<Processo, Long> {

    Processo findProcessoByNumero(@Param("numero") Long numero);

}
