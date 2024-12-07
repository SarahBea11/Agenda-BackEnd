package com.projeto.agenda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.agenda.entities.Agenda;

public interface AgendaRepository extends JpaRepository <Agenda, Long>{
    
    
}
