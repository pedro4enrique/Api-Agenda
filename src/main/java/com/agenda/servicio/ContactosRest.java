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

import com.agenda.dao.ContactosDAO;
import com.agenda.modelo.Contactos;

@RestController
@RequestMapping("Contactos")
public class ContactosRest {
	
	@Autowired
	private ContactosDAO ContactosDAO;
	

	@PostMapping("/insertar")
	private void insertar(@RequestBody Contactos contacto) {
		ContactosDAO.save(contacto);
	}
	
	@GetMapping("/mostrar")
	private List<Contactos> mostrar(){
		return ContactosDAO.findAll();
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		ContactosDAO.deleteById(id);
	}
	
	@PutMapping("/actualizar/{id}")
	public void actualizar(@RequestBody Contactos contacto) {
		ContactosDAO.save(contacto);
		
	}
}
