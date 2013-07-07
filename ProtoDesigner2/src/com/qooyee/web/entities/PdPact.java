package com.qooyee.web.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pd_pact")
public class PdPact implements Serializable {

	private static final long serialVersionUID = -1639465938199778773L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="paid")
	private int paid;
	
	@Column(name="pname",length=100)
	private String pname;
	
	@Column(name="pdesc",length=255)
	private String pdesc;
	
	@Column(name="pdefine",length=255)
	private String pdefine;

	public int getPaid() {
		return paid;
	}

	public void setPaid(int paid) {
		this.paid = paid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPdesc() {
		return pdesc;
	}

	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}

	public String getPdefine() {
		return pdefine;
	}

	public void setPdefine(String pdefine) {
		this.pdefine = pdefine;
	}
	
	

}
