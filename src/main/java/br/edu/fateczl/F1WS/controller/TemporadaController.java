package br.edu.fateczl.F1WS.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fateczl.F1WS.model.dto.TempDTO;
import br.edu.fateczl.F1WS.model.entity.Temp;
import br.edu.fateczl.F1WS.repository.TempRepository;

@RestController
@RequestMapping("/api")
public class TemporadaController {
	
	@Autowired
	private TempRepository tempRep;
	
	@GetMapping("/temporada/{paisCorrida}")
	public List<TempDTO> listaPorCorrida(@PathVariable(value = "paisCorrida") String paisCorrida) {
		List<Temp> temporadas = tempRep.listaFinalCorrida(paisCorrida);
		List<TempDTO> temporadasDTO = convertListTempListTempDTO(temporadas);
		return temporadasDTO;
	}
	
	private List<TempDTO> convertListTempListTempDTO(List<Temp> temps) {
		List<TempDTO> tempsDTO = new ArrayList<TempDTO>();

		for (Temp temp : temps) {
			TempDTO tempDTO = new TempDTO();
			tempDTO.setNomeEquipe(temp.getNomeEquipe());
			tempDTO.setNomePiloto(temp.getNomePiloto());
			tempDTO.setNumeroPiloto(temp.getNumeroPiloto());
			tempDTO.setPais(temp.getPais());
			tempDTO.setPontos(temp.getPontos());
			tempDTO.setPosicao(temp.getPosicao());
			
			tempsDTO.add(tempDTO);
		}
		return tempsDTO;
	}
	
}
