package com.dio.project.design.repository;

import com.dio.project.design.model.Scheduling;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface SchedulingRepository extends JpaRepository<Scheduling,Long> {

}
