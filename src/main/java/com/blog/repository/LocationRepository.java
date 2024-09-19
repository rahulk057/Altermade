package com.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blog.entity.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {

	Location save(Location location);

}
