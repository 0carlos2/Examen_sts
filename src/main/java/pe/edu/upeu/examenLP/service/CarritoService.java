package pe.edu.upeu.examenLP.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.examenLP.entity.Carrito;

public interface CarritoService {
	Carrito create(Carrito a);
	Carrito update(Carrito a);
	void delete(Long id);
	Optional<Carrito> read(Long id);
	List<Carrito> readAll();
}
