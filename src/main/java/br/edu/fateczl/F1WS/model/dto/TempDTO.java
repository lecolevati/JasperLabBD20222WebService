package br.edu.fateczl.F1WS.model.dto;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonTypeName(value = "temporada")
@JsonTypeInfo(include = JsonTypeInfo.As.WRAPPER_OBJECT, use = JsonTypeInfo.Id.NAME)
public class TempDTO {

	private int numeroPiloto;
	private String pais;
	private String nomePiloto;
	private String nomeEquipe;
	private int posicao;
	private int pontos;
}
