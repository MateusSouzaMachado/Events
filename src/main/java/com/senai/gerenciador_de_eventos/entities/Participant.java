package com.senai.gerenciador_de_eventos.entities;

import jakarta.persistence.*;
import lombok.Data;


import java.util.List;


@Data
@Entity
@Table(name = "tb_participant")
public class Participant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    @ManyToMany(mappedBy = "participants")
    private List<Event> events;

    @OneToMany(mappedBy = "participant")
    private List<Ticket> tickets;
}
