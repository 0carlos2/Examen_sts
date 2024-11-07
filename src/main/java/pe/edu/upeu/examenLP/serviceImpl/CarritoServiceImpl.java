package pe.edu.upeu.examenLP.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.examenLP.dao.CarritoDao;
import pe.edu.upeu.examenLP.entity.Carrito;
import pe.edu.upeu.examenLP.service.CarritoService;

@Service
public class CarritoServiceImpl implements CarritoService{
	@Autowired
	private CarritoDao carritoDao;

	@Override
	public Carrito create(Carrito a) {
		// TODO Auto-generated method stub
		return carritoDao.create(a);
	}

	@Override
	public Carrito update(Carrito a) {
		// TODO Auto-generated method stub
		return carritoDao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		carritoDao.delete(id);
	}

	@Override
	public Optional<Carrito> read(Long id) {
		// TODO Auto-generated method stub
		return carritoDao.read(id);
	}

	@Override
	public List<Carrito> readAll() {
		// TODO Auto-generated method stub
		return carritoDao.readAll();
	}
}
