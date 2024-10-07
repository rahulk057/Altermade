package com.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.entity.Enrollment;
import com.blog.repository.EnrollmentRepository;

@Service
public class EnrollmentServiceImpl implements EnrollmentService{

	@Autowired
	private EnrollmentRepository enrollmentRepository;
	@Override
	public Enrollment saveEnrollment(Enrollment enrollment) {
		// TODO Auto-generated method stub
		return enrollmentRepository.save(enrollment);
	}
	@Override
	public Enrollment getEnrollmentById(Long id) {
		// TODO Auto-generated method stub
		return enrollmentRepository.getById(id);
	}
	@Override
	public List<Enrollment> getEnrollment() {
		// TODO Auto-generated method stub
		return enrollmentRepository.findAll();
	}

}
