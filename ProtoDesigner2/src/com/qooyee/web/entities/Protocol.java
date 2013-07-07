package com.qooyee.web.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="pd_protocol")
public class Protocol implements Serializable {

	private static final long serialVersionUID = 3685658136378691721L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="prid")
	private int prid;
	
	@OneToMany(cascade={CascadeType.REFRESH})
	@JoinColumn(name="pid")
	private Project project;
	
	@Column(name="title")
	private String title;
	
	@Column(name="intro")
	private String intro;
	
	@Column(name="define")
	private String define;
	
	@OneToMany(cascade=CascadeType.REFRESH,fetch=FetchType.LAZY,mappedBy="protocol")
	private Set<ApplicationPort> appports;

	public int getPrid() {
		return prid;
	}

	public void setPrid(int prid) {
		this.prid = prid;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getDefine() {
		return define;
	}

	public void setDefine(String define) {
		this.define = define;
	}

	public Set<ApplicationPort> getAppports() {
		return appports;
	}

	public void setAppPorts(Set<ApplicationPort> appports) {
		this.appports = appports;
	}
	
	
}
