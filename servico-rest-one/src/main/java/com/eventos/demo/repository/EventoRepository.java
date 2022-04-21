package com.eventos.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.eventos.demo.model.Evento;

public interface EventoRepository extends JpaRepository<Evento, String>{
   Evento findByCODIGO (long codigo);
}
