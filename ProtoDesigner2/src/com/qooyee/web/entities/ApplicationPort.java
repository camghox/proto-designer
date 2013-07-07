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
@Table(name="pd_appport")
public class ApplicationPort implements Serializable {

	private static final long serialVersionUID = -7120128549912413641L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="apid")
	private int apid;
	
	@OneToMany(cascade={CascadeType.REFRESH})
	@JoinColumn(name="prid")
	private Protocol protocol;
	
	@Column(name="descr")
	private String descr;
	
	@Column(name="url")
	private String url;
	
	@Column(name="format")
	private String format;
	
	@Column(name="method")
	private String method;
	
	@Column(name="restrict")
	private String restrict;
	
	@OneToMany(cascade=CascadeType.REFRESH,fetch=FetchType.LAZY,mappedBy="appport")
	private Set<Paramter> paramters;
	
	@OneToMany(cascade=CascadeType.REFRESH,fetch=FetchType.LAZY,mappedBy="appport")
	private Set<Resultitem> resultitems;

	@Column(name="example")
	private String example;
	
	public String getExample() {
		return example;
	}

	public void setExample(String example) {
		this.example = example;
	}

	public int getApid() {
		return apid;
	}

	public void setApid(int apid) {
		this.apid = apid;
	}

	public Protocol getProtocol() {
		return protocol;
	}

	public void setProtocol(Protocol protocol) {
		this.protocol = protocol;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getRestrict() {
		return restrict;
	}

	public void setRestrict(String restrict) {
		this.restrict = restrict;
	}

	public Set<Paramter> getParamters() {
		return paramters;
	}

	public void setParamters(Set<Paramter> paramters) {
		this.paramters = paramters;
	}

	public Set<Resultitem> getResultitems() {
		return resultitems;
	}

	public void setResultitems(Set<Resultitem> resultitems) {
		this.resultitems = resultitems;
	}
	
	
}
