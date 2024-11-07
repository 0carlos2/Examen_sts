package pe.edu.upeu.examenLP.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import pe.edu.upeu.examenLP.entity.Carrito;
import pe.edu.upeu.examenLP.service.CarritoService;

@RestController
@RequestMapping("api/carrito")
@CrossOrigin(origins = "http://localhost:4200/")
public class CarritoController {
	@Autowired
	private CarritoService carritoService;
	
	@GetMapping
	public ResponseEntity<List<Carrito>> readAll(){
		try {
			List<Carrito> Carrito = carritoService.readAll();
			if(Carrito.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(Carrito, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@PostMapping
	public ResponseEntity<Carrito> crearCarrito(@Valid @RequestBody Carrito cat){
		try {
			Carrito a = carritoService.create(cat);
			return new ResponseEntity<>(a, HttpStatus.CREATED);			
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
}
	@GetMapping("/{id}")
	public ResponseEntity<Carrito> getCarritoId(@PathVariable("id") Long id){
		try {
			Carrito a = carritoService.read(id).get();
			return new ResponseEntity<>(a, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Carrito> delCarrito(@PathVariable("id") Long id){
		try {
			carritoService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PutMapping("/{id}")
	public ResponseEntity<?> updateCarrito(@PathVariable("id") Long id, @Valid @RequestBody Carrito cat){

			Optional<Carrito> a = carritoService.read(id);
			if(a.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			
			}else {
				return new ResponseEntity<>(carritoService.update(cat), HttpStatus.OK);
				
			}		
		
	}
}
