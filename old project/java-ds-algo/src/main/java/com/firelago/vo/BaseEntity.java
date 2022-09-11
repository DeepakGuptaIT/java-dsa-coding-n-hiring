package com.firelago.vo;

import java.time.LocalDateTime;

public class BaseEntity {
	protected long id;
	private boolean active = true;
	private LocalDateTime createdAt =LocalDateTime.now();
	private Long createdBy = 10L;

	public BaseEntity() {
		super();
	}

	public BaseEntity(long id, Boolean active, LocalDateTime createdAt, Long createdBy) {
		super();
		this.id = id;
		this.active = active;
		this.createdAt = createdAt;
		this.createdBy = createdBy;
	}

	public BaseEntity(long id, Boolean active) {
		super();
		this.id = id;
		this.active = active;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	

}
