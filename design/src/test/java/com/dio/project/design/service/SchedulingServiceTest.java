package com.dio.project.design.service;

import com.dio.project.design.dto.SchedulingDTO;
import com.dio.project.design.model.Scheduling;
import com.dio.project.design.repository.SchedulingRepository;
import com.dio.project.design.service.impl.SchedulingServiceImpl;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class SchedulingServiceTest {

    @Mock
    private SchedulingRepository schedulingRepository;

    @Mock
    private ObjectMapper objectMapper;

    @InjectMocks
    private SchedulingServiceImpl schedulingService;

    @Test
    void testGetByIdFound(){
        long id = 1L;
        Scheduling mockScheduling = new Scheduling(id);
        SchedulingDTO mockSchedulingDTO = new SchedulingDTO(id);
        when(schedulingRepository.findById(id)).thenReturn(Optional.of(mockScheduling));
        when(objectMapper.convertValue(mockScheduling,SchedulingDTO.class)).thenReturn(mockSchedulingDTO);
        ResponseEntity<SchedulingDTO> response = schedulingService.getById(id);
        assertEquals(HttpStatus.OK,response.getStatusCode());
        assertEquals(mockSchedulingDTO, response.getBody());
    }

    @Test
    void testGetByIdNotFound() {
        long id = 0L;
        when(schedulingRepository.findById(id)).thenReturn(Optional.empty());
        assertThrows(ResponseStatusException.class, () -> schedulingService.getById(id));
    }
}
