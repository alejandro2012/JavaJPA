package com.alex.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the esc_plan database table.
 * 
 */
@Entity
@Table(name="esc_plan")
@NamedQuery(name="EscPlan.findAll", query="SELECT e FROM EscPlan e")
public class EscPlan implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="esc_plan_id")
	private int escPlanId;

	private String plan;

	public EscPlan() {
	}

	public int getEscPlanId() {
		return this.escPlanId;
	}

	public void setEscPlanId(int escPlanId) {
		this.escPlanId = escPlanId;
	}

	public String getPlan() {
		return this.plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

}