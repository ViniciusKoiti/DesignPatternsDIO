package com.dio.project.design.service.impl;

import com.dio.project.design.service.SchedulingService;
import com.dio.project.design.dto.SchedulingDTO;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;

public class SchedulingServiceImpl implements SchedulingService {
    @Override
    public ResponseEntity<SchedulingDTO> create(SchedulingDTO objetoVo) {
        return null;
    }

    @Override
    public ResponseEntity<SchedulingDTO> getById(long id) {
        return null;
    }

    @Override
    public ResponseEntity<Page<SchedulingDTO>> getItems(int page, int size) {
        return null;
    }

    @Override
    public ResponseEntity<SchedulingDTO> update(SchedulingDTO objeto) {
        return null;
    }
}
