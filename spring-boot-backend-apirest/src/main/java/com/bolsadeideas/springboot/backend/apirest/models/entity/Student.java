package com.bolsadeideas.springboot.backend.apirest.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student extends Cliente implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long student_id;

	private Integer student_number;
	private Integer average_mark;

	public Student() {
		super();
	}

	public Student(Long student_id, Integer student_number, Integer average_mark) {
		super();
		this.student_id = student_id;
		this.student_number = student_number;
		this.average_mark = average_mark;
	}

	public Long getStudent_id() {
		return student_id;
	}

	public void setStudent_id(Long student_id) {
		this.student_id = student_id;
	}

	public Integer getStudent_number() {
		return student_number;
	}

	public void setStudent_number(Integer student_number) {
		this.student_number = student_number;
	}

	public Integer getAverage_mark() {
		return average_mark;
	}

	public void setAverage_mark(Integer average_mark) {
		this.average_mark = average_mark;
	}

	private static final long serialVersionUID = 1L;

}
