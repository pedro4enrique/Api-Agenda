package com.agenda.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agenda.modelo.Citas;

public interface CitasDAO extends JpaRepository<Citas,Integer> {

}
