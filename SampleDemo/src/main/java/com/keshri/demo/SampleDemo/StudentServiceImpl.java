package com.keshri.demo.SampleDemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class StudentServiceImpl implements StudentService {

	@Autowired
	@Qualifier("temp")
	StudentDao studentDao;

	@Override
	public StudentBean getStudentById(long studentId) {
		return studentDao.getStudentById(studentId);
	}

	@Override
	public boolean saveStudent(StudentBean bean) {
		return studentDao.saveStudent(bean);
	}

	@Override
	public StudentBean updateStudent(StudentBean bean, long studentId) {
		return studentDao.updateStudent(bean, studentId);
	}

	@Override
	public StudentBean deleteStudent(long studentId) {
		return studentDao.deleteStudent(studentId);
	}

	@Override
	public List<StudentBean> getAllStudent() {
		return studentDao.getAllStudent();
	}

}
