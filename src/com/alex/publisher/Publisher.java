package com.alex.publisher;

import javax.persistence.EntityManager;

import com.alex.entity.EscAlumno;
import com.alex.publisher.MyEntity;

public class Publisher {
	
	public static void main(String[] args) {
		
		MyEntity entity = new MyEntity();
		
		EscAlumno alumno = new EscAlumno();
		alumno.setAmaterno("duarte");
		alumno.setApaterno("arzate");
		alumno.setNombre("laura laura");
		
		EntityManager em = entity.getEntityManager();
		em.persist(alumno);
	}


}
