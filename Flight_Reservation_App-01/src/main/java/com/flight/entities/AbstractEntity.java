package com.flight.entities;

import javax.persistence.*;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class AbstractEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	public long getId() {
	return id; }
	public void setId(long id) {
	this.id = id;
	}


}
