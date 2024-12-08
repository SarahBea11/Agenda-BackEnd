package com.projeto.agenda.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.agenda.entities.Agenda;
import com.projeto.agenda.services.AgendaService;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("agenda")
public class AgendaController {
   
    @Autowired
    private AgendaService service; 

    @GetMapping
    public List<Agenda> getAgenda(){
        return service.getAllAgenda();
    }
    
}

