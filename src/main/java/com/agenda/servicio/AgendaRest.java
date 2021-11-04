package com.agenda.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.agenda.dao.AgendaDAO;
import com.agenda.modelo.Agenda;

@RestController
@RequestMapping("Agenda")
public class AgendaRest {
	
	@Autowired
	private AgendaDAO AgendaDAO;
	
	@PostMapping("/insertar")
	private void insertar(@RequestBody Agenda agenda) {
		AgendaDAO.save(agenda);
	}
	
	@GetMapping("/mostrar")
	private List<Agenda> mostrar(){
		return AgendaDAO.findAll();
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		AgendaDAO.deleteById(id);
	}
	
	@PutMapping("/actualizar/{id}")
	public void actualizar(@RequestBody Agenda agenda) {
		AgendaDAO.save(agenda);
	}
	
}
