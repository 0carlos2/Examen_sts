package pe.edu.upeu.examenLP.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.examenLP.dao.FacturaDao;
import pe.edu.upeu.examenLP.entity.Factura;
import pe.edu.upeu.examenLP.repository.FacturaRepository;

@Component
public class FacturaDaoImpl implements FacturaDao{
	@Autowired
	private FacturaRepository facturaRepository;

	@Override
	public Factura create(Factura a) {
		// TODO Auto-generated method stub
		return facturaRepository.save(a);
	}

	@Override
	public Factura update(Factura a) {
		// TODO Auto-generated method stub
		return facturaRepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		facturaRepository.deleteById(id);
	}

	@Override
	public Optional<Factura> read(Long id) {
		// TODO Auto-generated method stub
		return facturaRepository.findById(id);
	}

	@Override
	public List<Factura> readAll() {
		// TODO Auto-generated method stub
		return facturaRepository.findAll();
	}
}