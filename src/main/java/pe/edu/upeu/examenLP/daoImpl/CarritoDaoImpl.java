package pe.edu.upeu.examenLP.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.examenLP.dao.CarritoDao;
import pe.edu.upeu.examenLP.entity.Carrito;
import pe.edu.upeu.examenLP.repository.CarritoRepository;

@Component
public class CarritoDaoImpl implements CarritoDao{
	@Autowired
	private CarritoRepository carritoRepository;

	@Override
	public Carrito create(Carrito a) {
		// TODO Auto-generated method stub
		return carritoRepository.save(a);
	}

	@Override
	public Carrito update(Carrito a) {
		// TODO Auto-generated method stub
		return carritoRepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		carritoRepository.deleteById(id);
	}

	@Override
	public Optional<Carrito> read(Long id) {
		// TODO Auto-generated method stub
		return carritoRepository.findById(id);
	}

	@Override
	public List<Carrito> readAll() {
		// TODO Auto-generated method stub
		return carritoRepository.findAll();
	}
}
