package pe.edu.upeu.examenLP.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.examenLP.dao.ClienteDao;
import pe.edu.upeu.examenLP.entity.Cliente;
import pe.edu.upeu.examenLP.repository.ClienteRepository;

@Component
public class ClienteDaoImpl implements ClienteDao{
	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public Cliente create(Cliente a) {
		// TODO Auto-generated method stub
		return clienteRepository.save(a);
	}

	@Override
	public Cliente update(Cliente a) {
		// TODO Auto-generated method stub
		return clienteRepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		clienteRepository.deleteById(id);
	}

	@Override
	public Optional<Cliente> read(Long id) {
		// TODO Auto-generated method stub
		return clienteRepository.findById(id);
	}

	@Override
	public List<Cliente> readAll() {
		// TODO Auto-generated method stub
		return clienteRepository.findAll();
	}
}
