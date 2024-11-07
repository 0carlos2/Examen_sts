package pe.edu.upeu.examenLP.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.examenLP.dao.ClienteDao;
import pe.edu.upeu.examenLP.entity.Cliente;
import pe.edu.upeu.examenLP.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{
	
	@Autowired
	private ClienteDao clienteDao;

	@Override
	public Cliente create(Cliente a) {
		// TODO Auto-generated method stub
		return clienteDao.create(a);
	}

	@Override
	public Cliente update(Cliente a) {
		// TODO Auto-generated method stub
		return clienteDao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		clienteDao.delete(id);
	}

	@Override
	public Optional<Cliente> read(Long id) {
		// TODO Auto-generated method stub
		return clienteDao.read(id);
	}

	@Override
	public List<Cliente> readAll() {
		// TODO Auto-generated method stub
		return clienteDao.readAll();
	}
	

}
