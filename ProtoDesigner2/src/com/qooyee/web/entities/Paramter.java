package com.qooyee.web.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="pd_paramter")
public class Paramter implements Serializable {

	private static final long serialVersionUID = 2776967357098091997L;
	
	@OneToMany(cascade={CascadeType.REFRESH})
	@JoinColumn(name="apid")
	private ApplicationPort appport;

	@Column(name="pname")
	private String pname;
	
	@Column(name="ptype")
	private String ptype;
	
	@Column(name="isNeed")
	private String isNeed;
	
	@Column(name="pdesc")
	private String pdesc;

	public ApplicationPort getAppport() {
		return appport;
	}

	public void setAppport(ApplicationPort appport) {
		this.appport = appport;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPtype() {
		return ptype;
	}

	public void setPtype(String ptype) {
		this.ptype = ptype;
	}

	public String getIsNeed() {
		return isNeed;
	}

	public void setIsNeed(String isNeed) {
		this.isNeed = isNeed;
	}

	public String getPdesc() {
		return pdesc;
	}

	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}
	
	
}
