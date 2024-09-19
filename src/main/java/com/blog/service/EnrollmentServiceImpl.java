package com.blog.service;

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

}
