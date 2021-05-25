package com.bolsadeideas.springboot.backend.apirest.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "professor")
public class Professor extends Cliente implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long professor_id;
	private Integer salary;

	public Professor() {
		super();
	}

	public Professor(Long professor_id, Integer salary) {
		super();
		this.professor_id = professor_id;
		this.salary = salary;
	}

	public Long getProfessor_id() {
		return professor_id;
	}

	public void setProfessor_id(Long professor_id) {
		this.professor_id = professor_id;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	private static final long serialVersionUID = 1L;

}
