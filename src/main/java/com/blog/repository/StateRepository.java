package com.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blog.entity.State;
import java.util.List;


@Repository
public interface StateRepository extends JpaRepository<State, Integer>{
	
	
}
