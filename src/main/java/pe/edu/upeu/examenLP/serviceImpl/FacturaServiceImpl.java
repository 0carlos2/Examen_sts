package pe.edu.upeu.examenLP.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.examenLP.dao.FacturaDao;
import pe.edu.upeu.examenLP.entity.Factura;
import pe.edu.upeu.examenLP.service.FacturaService;

@Service
public class FacturaServiceImpl implements FacturaService{
	
	@Autowired
	private FacturaDao facturaDao;

	@Override
	public Factura create(Factura a) {
		// TODO Auto-generated method stub
		return facturaDao.create(a);
	}

	@Override
	public Factura update(Factura a) {
		// TODO Auto-generated method stub
		return facturaDao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		facturaDao.delete(id);
	}

	@Override
	public Optional<Factura> read(Long id) {
		// TODO Auto-generated method stub
		return facturaDao.read(id);
	}

	@Override
	public List<Factura> readAll() {
		// TODO Auto-generated method stub
		return facturaDao.readAll();
	}
	

}