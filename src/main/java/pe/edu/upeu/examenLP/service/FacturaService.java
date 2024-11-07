package pe.edu.upeu.examenLP.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.examenLP.entity.Factura;

public interface FacturaService {
	Factura create(Factura a);
	Factura update(Factura a);
	void delete(Long id);
	Optional<Factura> read(Long id);
	List<Factura> readAll();
}
