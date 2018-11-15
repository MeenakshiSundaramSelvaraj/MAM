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

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "rating")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "createdAt", "updatedAt" }, allowGetters = true)
public class Rating implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long rating_id;

	long mov_id;
	long rev_id;
	int rev_stars;
	long num_o_ratings;

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

	public long getRev_id() {
		return rev_id;
	}

	public void setRev_id(long rev_id) {
		this.rev_id = rev_id;
	}

	public int getRev_stars() {
		return rev_stars;
	}

	public void setRev_stars(int rev_stars) {
		this.rev_stars = rev_stars;
	}

	public long getNum_o_ratings() {
		return num_o_ratings;
	}

	public void setNum_o_ratings(long num_o_ratings) {
		this.num_o_ratings = num_o_ratings;
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
