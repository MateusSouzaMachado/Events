package com.senai.gerenciador_de_eventos.repository;

import com.senai.gerenciador_de_eventos.entities.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
