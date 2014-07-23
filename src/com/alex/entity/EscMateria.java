package com.alex.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the esc_materia database table.
 * 
 */
@Entity
@Table(name="esc_materia")
@NamedQuery(name="EscMateria.findAll", query="SELECT e FROM EscMateria e")
public class EscMateria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="esc_materia_id")
	private int escMateriaId;

	@Column(name="esc_maestro_id")
	private int escMaestroId;

	@Column(name="esc_plan_id")
	private int escPlanId;

	private String materia;

	public EscMateria() {
	}

	public int getEscMateriaId() {
		return this.escMateriaId;
	}

	public void setEscMateriaId(int escMateriaId) {
		this.escMateriaId = escMateriaId;
	}

	public int getEscMaestroId() {
		return this.escMaestroId;
	}

	public void setEscMaestroId(int escMaestroId) {
		this.escMaestroId = escMaestroId;
	}

	public int getEscPlanId() {
		return this.escPlanId;
	}

	public void setEscPlanId(int escPlanId) {
		this.escPlanId = escPlanId;
	}

	public String getMateria() {
		return this.materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

}