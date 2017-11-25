package com.keshri.demo.SampleDemo;

import java.util.List;

public interface StudentService {
	StudentBean getStudentById(long StudentId);

	boolean saveStudent(StudentBean bean);

	StudentBean updateStudent(StudentBean bean, long studentId);

	StudentBean deleteStudent(long studentId);

	List<StudentBean> getAllStudent();
}
