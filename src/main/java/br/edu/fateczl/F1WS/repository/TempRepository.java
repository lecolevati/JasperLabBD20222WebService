package br.edu.fateczl.F1WS.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import br.edu.fateczl.F1WS.model.entity.Temp;

public interface TempRepository extends JpaRepository<Temp, Integer> {
	
	@Modifying
	@Query(value = "SELECT p.numero, p.nome, e.nome AS equipe, t.posicao, "
			+ "	t.pontos, c.pais "
			+ "FROM temporada t, corrida c, piloto p, equipe e "
			+ "WHERE t.codigo_corrida = c.codigo "
			+ "	AND p.numero = t.numero_piloto "
			+ "	AND e.codigo = p.equipe "
			+ "	AND t.pontos > 0 "
			+ "	AND c.pais = ?1 "
			+ "ORDER BY posicao",
			nativeQuery = true)
	List<Temp> listaFinalCorrida(String pais);
	
}
