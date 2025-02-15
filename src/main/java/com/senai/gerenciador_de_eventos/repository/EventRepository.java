package com.senai.gerenciador_de_eventos.repository;

import com.senai.gerenciador_de_eventos.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
