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

import com.agenda.modelo.Citas;
import com.agenda.dao.CitasDAO;

@RestController
@RequestMapping("Citas")
public class CitasRest {

	@Autowired
	private CitasDAO CitasDAO;

	@PostMapping("/insertar")
	private void insertar(@RequestBody Citas citas) {
		CitasDAO.save(citas);
	}

	@GetMapping("/mostrar")
	private List<Citas> mostrar() {
		return CitasDAO.findAll();
	}

	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		CitasDAO.deleteById(id);
	}

	@PutMapping("/actualizar/{id}")
	public void actualizar(@RequestBody Citas citas) {
		CitasDAO.save(citas);

	}
}
