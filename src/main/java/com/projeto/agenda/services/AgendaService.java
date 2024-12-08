package com.projeto.agenda.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.agenda.entities.Agenda;
import com.projeto.agenda.repositories.AgendaRepository;


@Service
public class AgendaService {
    
    @Autowired 
    private AgendaRepository repository;

    public List<Agenda> getAllAgenda(){
        return repository.findAll();
    }

    
}
