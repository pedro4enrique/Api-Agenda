package com.agenda.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agenda.modelo.Agenda;

public interface  AgendaDAO extends JpaRepository<Agenda,Integer> {

}
