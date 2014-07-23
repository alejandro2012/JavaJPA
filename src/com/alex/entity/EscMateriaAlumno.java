package com.alex.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the esc_materia_alumno database table.
 * 
 */
@Entity
@Table(name="esc_materia_alumno")
@NamedQuery(name="EscMateriaAlumno.findAll", query="SELECT e FROM EscMateriaAlumno e")
public class EscMateriaAlumno implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="esc_materia_alumno_id")
	private int escMateriaAlumnoId;

	@Column(name="esc_alumno_id")
	private int escAlumnoId;

	@Column(name="esc_materia_id")
	private int escMateriaId;

	public EscMateriaAlumno() {
	}

	public int getEscMateriaAlumnoId() {
		return this.escMateriaAlumnoId;
	}

	public void setEscMateriaAlumnoId(int escMateriaAlumnoId) {
		this.escMateriaAlumnoId = escMateriaAlumnoId;
	}

	public int getEscAlumnoId() {
		return this.escAlumnoId;
	}

	public void setEscAlumnoId(int escAlumnoId) {
		this.escAlumnoId = escAlumnoId;
	}

	public int getEscMateriaId() {
		return this.escMateriaId;
	}

	public void setEscMateriaId(int escMateriaId) {
		this.escMateriaId = escMateriaId;
	}

}