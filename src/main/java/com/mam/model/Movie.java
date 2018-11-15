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
@Table(name = "movie")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "createdAt", "updatedAt" }, allowGetters = true)
public class Movie implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long mov_id;

	@NotBlank
	String mov_title;

	int mov_time;

	@NotBlank
	String mov_lang;
	Date mov_dt_rel;

	@NotBlank
	String mov_rel_country;

	@Column(nullable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date createdAt;

	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date updatedAt;

	public long getMov_id() {
		return mov_id;
	}

	public void setMov_id(long mov_id) {
		this.mov_id = mov_id;
	}

	public String getMov_title() {
		return mov_title;
	}

	public void setMov_title(String mov_title) {
		this.mov_title = mov_title;
	}

	public int getMov_time() {
		return mov_time;
	}

	public void setMov_time(int mov_time) {
		this.mov_time = mov_time;
	}

	public String getMov_lang() {
		return mov_lang;
	}

	public void setMov_lang(String mov_lang) {
		this.mov_lang = mov_lang;
	}

	public Date getMov_dt_rel() {
		return mov_dt_rel;
	}

	public void setMov_dt_rel(Date mov_dt_rel) {
		this.mov_dt_rel = mov_dt_rel;
	}

	public String getMov_rel_country() {
		return mov_rel_country;
	}

	public void setMov_rel_country(String mov_rel_country) {
		this.mov_rel_country = mov_rel_country;
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

}
