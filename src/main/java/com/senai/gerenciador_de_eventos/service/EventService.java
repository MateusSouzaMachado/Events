package com.senai.gerenciador_de_eventos.service;

import com.senai.gerenciador_de_eventos.entities.Event;
import com.senai.gerenciador_de_eventos.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public List<Event> listAllEvents(){
        return eventRepository.findAll();
    }

    public Event getEventById(Long id){
        return eventRepository.findById(id).orElseThrow(() -> new RuntimeException("Event not fond"));
    }
}
