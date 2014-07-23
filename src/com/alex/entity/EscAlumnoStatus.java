package com.alex.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the esc_alumno_status database table.
 * 
 */
@Entity
@Table(name="esc_alumno_status")
@NamedQuery(name="EscAlumnoStatus.findAll", query="SELECT e FROM EscAlumnoStatus e")
public class EscAlumnoStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="esc_alumno_status_id")
	private int escAlumnoStatusId;

	private String status;

	public EscAlumnoStatus() {
	}

	public int getEscAlumnoStatusId() {
		return this.escAlumnoStatusId;
	}

	public void setEscAlumnoStatusId(int escAlumnoStatusId) {
		this.escAlumnoStatusId = escAlumnoStatusId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}