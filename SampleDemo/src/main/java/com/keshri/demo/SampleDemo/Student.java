package com.keshri.demo.SampleDemo;

import java.io.Serializable;

public class Student implements Serializable {
	private static final long serialVersionUID = 1L;

	private long studentId;
	private String studentName;
	private String address;

	public Student() {

	}

	public Student(long studentId, String studentName, String address) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.address = address;
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
