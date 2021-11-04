package com.agenda.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agenda.modelo.Contactos;

public interface ContactosDAO extends JpaRepository<Contactos,Integer> {

}
