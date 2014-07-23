package com.alex.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the esc_alumno database table.
 * 
 */
@Entity
@Table(name="esc_alumno")
@NamedQuery(name="EscAlumno.findAll", query="SELECT e FROM EscAlumno e")
public class EscAlumno implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="esc_alumno_id")
	private int escAlumnoId;

	private String amaterno;

	private String apaterno;

	@Lob
	private String direccion;

	@Column(name="esc_alumno_status_id")
	private int escAlumnoStatusId;

	private String matricula;

	private String nombre;

	private String telefono;

	public EscAlumno() {
	}

	public int getEscAlumnoId() {
		return this.escAlumnoId;
	}

	public void setEscAlumnoId(int escAlumnoId) {
		this.escAlumnoId = escAlumnoId;
	}

	public String getAmaterno() {
		return this.amaterno;
	}

	public void setAmaterno(String amaterno) {
		this.amaterno = amaterno;
	}

	public String getApaterno() {
		return this.apaterno;
	}

	public void setApaterno(String apaterno) {
		this.apaterno = apaterno;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getEscAlumnoStatusId() {
		return this.escAlumnoStatusId;
	}

	public void setEscAlumnoStatusId(int escAlumnoStatusId) {
		this.escAlumnoStatusId = escAlumnoStatusId;
	}

	public String getMatricula() {
		return this.matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}