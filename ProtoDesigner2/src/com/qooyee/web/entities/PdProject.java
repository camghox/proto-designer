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
@Table(name="pd_project")
public class PdProject implements Serializable {

	private static final long serialVersionUID = -6371692314283649101L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pid")
	private int pid;
	
	@Column(name="pname")
	private String pname;
	
	@Column(name="pdesc")
	private String pdesc;
	
	@Column(name="create_time")
	private Date createTime;
	
	@Column(name="create_user")
	private int createUser;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
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

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public int getCreateUser() {
		return createUser;
	}

	public void setCreateUser(int createUser) {
		this.createUser = createUser;
	}
	
	
}
