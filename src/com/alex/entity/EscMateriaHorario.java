package com.alex.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the esc_materia_horario database table.
 * 
 */
@Entity
@Table(name="esc_materia_horario")
@NamedQuery(name="EscMateriaHorario.findAll", query="SELECT e FROM EscMateriaHorario e")
public class EscMateriaHorario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="esc_materia_horario_id")
	private int escMateriaHorarioId;

	@Column(name="esc_materia_id")
	private int escMateriaId;

	@Column(name="esc_semana_id")
	private int escSemanaId;

	@Column(name="hora_inicio")
	private int horaInicio;

	@Column(name="horario_fin")
	private int horarioFin;

	public EscMateriaHorario() {
	}

	public int getEscMateriaHorarioId() {
		return this.escMateriaHorarioId;
	}

	public void setEscMateriaHorarioId(int escMateriaHorarioId) {
		this.escMateriaHorarioId = escMateriaHorarioId;
	}

	public int getEscMateriaId() {
		return this.escMateriaId;
	}

	public void setEscMateriaId(int escMateriaId) {
		this.escMateriaId = escMateriaId;
	}

	public int getEscSemanaId() {
		return this.escSemanaId;
	}

	public void setEscSemanaId(int escSemanaId) {
		this.escSemanaId = escSemanaId;
	}

	public int getHoraInicio() {
		return this.horaInicio;
	}

	public void setHoraInicio(int horaInicio) {
		this.horaInicio = horaInicio;
	}

	public int getHorarioFin() {
		return this.horarioFin;
	}

	public void setHorarioFin(int horarioFin) {
		this.horarioFin = horarioFin;
	}

}