package com.eventos.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;



@Entity
public class Evento  implements Serializable {
	public static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long CODIGO;
	
	@NotBlank
	private String NOME;
	
	@NotBlank
	private String LOCAL;
	
	@NotBlank
	private String DATA;
	
	@NotBlank
	private String HORARIO;

	//GETTERS E SETTERS
	public long getCODIGO() {
		return CODIGO;
	}

	public void setCODIGO(long cODIGO) {
		CODIGO = cODIGO;
	}

	public String getNOME() {
		return NOME;
	}

	public void setNOME(String nOME) {
		NOME = nOME;
	}

	public String getLOCAL() {
		return LOCAL;
	}

	public void setLOCAL(String lOCAL) {
		LOCAL = lOCAL;
	}

	public String getDATA() {
		return DATA;
	}

	public void setDATA(String dATA) {
		DATA = dATA;
	}

	public String getHORARIO() {
		return HORARIO;
	}

	public void setHORARIO(String hORARIO) {
		HORARIO = hORARIO;
	}
	
	

}
