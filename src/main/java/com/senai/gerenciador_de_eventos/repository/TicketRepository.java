package com.senai.gerenciador_de_eventos.repository;

import com.senai.gerenciador_de_eventos.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
