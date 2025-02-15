package com.senai.gerenciador_de_eventos.repository;

import com.senai.gerenciador_de_eventos.entities.Organizer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.net.InterfaceAddress;

public interface OrganizerRepository extends JpaRepository<Organizer, Long> {
}
