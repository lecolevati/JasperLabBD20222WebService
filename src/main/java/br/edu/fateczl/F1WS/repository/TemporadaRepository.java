package br.edu.fateczl.F1WS.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fateczl.F1WS.model.entity.Temporada;

public interface TemporadaRepository extends JpaRepository<Temporada, Integer> {
	
	List<Temporada> findByCorridaPais(String pais);

}
