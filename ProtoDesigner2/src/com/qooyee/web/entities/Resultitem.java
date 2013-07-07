package com.qooyee.web.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="pd_resultitem")
public class Resultitem implements Serializable {

	private static final long serialVersionUID = 5152695152670878690L;

	@OneToMany(cascade={CascadeType.REFRESH})
	@JoinColumn(name="apid")
	private ApplicationPort appport;
	
	@Column(name="rname")
	private String rname;
	
	@Column(name="rtype")
	private String rtype;
	
	@Column(name="rdesc")
	private String rdesc;

	public ApplicationPort getAppport() {
		return appport;
	}

	public void setAppport(ApplicationPort appport) {
		this.appport = appport;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public String getRtype() {
		return rtype;
	}

	public void setRtype(String rtype) {
		this.rtype = rtype;
	}

	public String getRdesc() {
		return rdesc;
	}

	public void setRdesc(String rdesc) {
		this.rdesc = rdesc;
	}
	
	
}
