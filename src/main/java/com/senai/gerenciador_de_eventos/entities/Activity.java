package com.senai.gerenciador_de_eventos.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_activity")
public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

    @ManyToOne
    @JoinColumn(name = "Speaker_id")
    private Speaker speaker;

    @ManyToOne
    @JoinColumn(name = "Event_id")
    private Event event;
}
