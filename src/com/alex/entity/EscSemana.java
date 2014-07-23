package com.alex.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the esc_semana database table.
 * 
 */
@Entity
@Table(name="esc_semana")
@NamedQuery(name="EscSemana.findAll", query="SELECT e FROM EscSemana e")
public class EscSemana implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="esc_semana_id")
	private int escSemanaId;

	private String dia;

	public EscSemana() {
	}

	public int getEscSemanaId() {
		return this.escSemanaId;
	}

	public void setEscSemanaId(int escSemanaId) {
		this.escSemanaId = escSemanaId;
	}

	public String getDia() {
		return this.dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

}