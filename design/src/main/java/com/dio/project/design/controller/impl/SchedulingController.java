package com.dio.project.design.controller.impl;

import com.dio.project.design.controller.CrudController;
import com.dio.project.design.dto.SchedulingDTO;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.dio.project.design.service.SchedulingService;

import javax.validation.Valid;

@RestController
@RequestMapping("/scheduling")
public class SchedulingController implements CrudController<SchedulingDTO> {

    private final SchedulingService schedullingService;

    public SchedulingController(SchedulingService schedullingService) {
        this.schedullingService = schedullingService;
    }

    @Override
    @PostMapping
    public ResponseEntity<SchedulingDTO> create(@Valid @RequestBody SchedulingDTO objetoVo) {
        return this.schedullingService.create(objetoVo);
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<SchedulingDTO> getById(@PathVariable long id) {
        return this.schedullingService.getById(id);
    }

    @Override
    public ResponseEntity<Page<SchedulingDTO>> getItems(int page, int size) {
        return this.schedullingService.getItems(page,size);
    }

    @Override
    @PutMapping
    public ResponseEntity<SchedulingDTO> update(@Valid @RequestBody SchedulingDTO objeto) {
        return this.schedullingService.update(objeto);
    }
}
