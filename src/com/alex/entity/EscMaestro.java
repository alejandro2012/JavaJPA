package com.alex.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the esc_maestro database table.
 * 
 */
@Entity
@Table(name="esc_maestro")
@NamedQuery(name="EscMaestro.findAll", query="SELECT e FROM EscMaestro e")
public class EscMaestro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="esc_maestro_id")
	private int escMaestroId;

	private String amaterno;

	private String apaterno;

	@Lob
	private String direccion;

	private String nombre;

	private String telefono;

	public EscMaestro() {
	}

	public int getEscMaestroId() {
		return this.escMaestroId;
	}

	public void setEscMaestroId(int escMaestroId) {
		this.escMaestroId = escMaestroId;
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