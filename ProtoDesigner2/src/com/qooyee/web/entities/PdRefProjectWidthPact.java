package com.qooyee.web.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pd_ref_project_pact")
public class PdRefProjectWidthPact implements Serializable {

	private static final long serialVersionUID = 2543576248198832996L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="rid")
	private int rid;
	
	@Column(name="pid")
	private int pid;
	
	@Column(name="paid")
	private int paid;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getPaid() {
		return paid;
	}

	public void setPaid(int paid) {
		this.paid = paid;
	}
	
	
}
