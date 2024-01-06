package com.dio.project.design.controller;

import com.dio.project.design.controller.impl.SchedulingController;
import com.dio.project.design.dto.SchedulingDTO;
import com.dio.project.design.service.SchedulingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
@ExtendWith(MockitoExtension.class)
@WebMvcTest(SchedulingController.class)
public class SchedullingControllerTest {


    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private SchedulingService schedulingService;

    @BeforeEach
    void setUp(){
        SchedulingDTO mockScheduling = new SchedulingDTO();
        mockScheduling.setId(1L);
        ResponseEntity<SchedulingDTO> responseEntity = ResponseEntity.ok(mockScheduling);
        when(schedulingService.getById(1L)).thenReturn(responseEntity);
    }

    @Test
    void getSchedulingByIdShouldReturnScheduling() throws Exception {
        mockMvc.perform(get("/scheduling/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1L));
    }
}