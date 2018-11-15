package com.mam.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "actor")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "createdAt", "updatedAt" }, allowGetters = true)
public class Actor implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long act_id;

	@NotBlank
	String act_fname;

	@NotBlank
	String act_lname;

	@NotBlank
	String act_gender;

	@Column(nullable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date createdAt;

	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date updatedAt;

	public long getAct_id() {
		return act_id;
	}

	public void setAct_id(long act_id) {
		this.act_id = act_id;
	}

	public String getAct_fname() {
		return act_fname;
	}

	public void setAct_fname(String act_fname) {
		this.act_fname = act_fname;
	}

	public String getAct_lname() {
		return act_lname;
	}

	public void setAct_lname(String act_lname) {
		this.act_lname = act_lname;
	}

	public String getAct_gender() {
		return act_gender;
	}

	public void setAct_gender(String act_gender) {
		this.act_gender = act_gender;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public String toString() {
		return "Actor [act_id=" + act_id + ", act_fname=" + act_fname + ", act_lname=" + act_lname + ", act_gender="
				+ act_gender + "]";
	}

}
