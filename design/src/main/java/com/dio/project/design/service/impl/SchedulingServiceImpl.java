package com.dio.project.design.service.impl;

import com.dio.project.design.common.constant.scheduling.SchedulingConstant;
import com.dio.project.design.model.Scheduling;
import com.dio.project.design.repository.SchedulingRepository;
import com.dio.project.design.service.SchedulingService;
import com.dio.project.design.dto.SchedulingDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class SchedulingServiceImpl implements SchedulingService {

    private final SchedulingRepository schedulingRepository;

    private final ObjectMapper objectMapper;

    public SchedulingServiceImpl(SchedulingRepository schedulingRepository, ObjectMapper objectMapper) {
        this.schedulingRepository = schedulingRepository;
        this.objectMapper = objectMapper;
    }

    @Override
    public ResponseEntity<SchedulingDTO> create(SchedulingDTO schedulingDTO) {
        if(schedulingRepository.existsById(schedulingDTO.getId())){
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
        schedulingRepository.save(objectMapper.convertValue(schedulingDTO, Scheduling.class));
        return ResponseEntity.status(HttpStatus.CREATED).body(schedulingDTO);
    }

    @Override
    public ResponseEntity<SchedulingDTO> getById(long id) {
        Optional<Scheduling> schedulingOptional = schedulingRepository.findById(id);
        if(schedulingOptional.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,String.format(SchedulingConstant.SCHEDULING_ERROR_NOT_FOUND,id));
        }
        SchedulingDTO schedulingDTO = objectMapper.convertValue(schedulingOptional.get(),SchedulingDTO.class);
        return ResponseEntity.ok(schedulingDTO);
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
