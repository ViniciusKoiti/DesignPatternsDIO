package com.dio.project.design.controller;

import com.dio.project.design.common.constant.scheduling.SchedulingConstant;
import com.dio.project.design.controller.impl.SchedulingController;
import com.dio.project.design.dto.SchedulingDTO;
import com.dio.project.design.service.SchedulingService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.web.server.ResponseStatusException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
@ExtendWith(MockitoExtension.class)
@WebMvcTest(SchedulingController.class)
public class SchedullingControllerTest {


    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private SchedulingService schedulingService;

    @Test
    void testGetSchedulingByIdShouldReturnScheduling() throws Exception {
        SchedulingDTO mockScheduling = new SchedulingDTO();
        mockScheduling.setId(1L);
        ResponseEntity<SchedulingDTO> responseEntity = ResponseEntity.ok(mockScheduling);
        when(schedulingService.getById(1L)).thenReturn(responseEntity);
        mockMvc.perform(get("/scheduling/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1L));
    }

    @Test
    void testGetSchedulingNotExistScheduling() throws Exception {
        mockMvc.perform(get("/scheduling/2"))
                .andExpect(result -> assertTrue(result.getResolvedException() instanceof ResponseStatusException));
    }

    @Test
    void testCreateScheduling() throws Exception {
        long id = 1;
        SchedulingDTO schedulingDTO = new SchedulingDTO(id); // Substitua com valores apropriados
        SchedulingDTO returnedDTO = new SchedulingDTO(id);   // O DTO que você espera que seja retornado

        when(schedulingService.create(any(SchedulingDTO.class))).
                thenReturn(new ResponseEntity<>(returnedDTO, HttpStatus.CREATED));

        mockMvc.perform(post("/scheduling")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(new ObjectMapper().writeValueAsString(schedulingDTO)))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.id").
                        value(returnedDTO.getId())); // Ajuste conforme necessário
    }
}
