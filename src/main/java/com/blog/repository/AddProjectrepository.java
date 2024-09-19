package com.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blog.entity.AddProject;


@Repository
public interface AddProjectrepository  extends JpaRepository<AddProject, Long>{

}
