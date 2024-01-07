package com.dio.project.design.repository;

import com.dio.project.design.model.Scheduling;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Pageable;
import java.time.ZonedDateTime;

@Repository
public interface SchedulingRepository extends JpaRepository<Scheduling,Long> {
    Page<Scheduling> findAllByInitialDateTime(ZonedDateTime initialDatetime, Pageable pageable);
    Page<Scheduling> findAllByFinalDateTime(ZonedDateTime finalDatetime, Pageable pageable);
}
