package pe.edu.upeu.examenLP.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.examenLP.entity.Carrito;

@Repository
public interface CarritoRepository extends JpaRepository<Carrito, Long>{

}