package com.dio.project.design.controller;

import com.dio.project.design.common.constant.PageConstant;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
public interface CrudController<T> {
    @PostMapping
    ResponseEntity<T> create(T objetoVo);
    @GetMapping("/{id}")
    ResponseEntity<T> getById(@PathVariable long id);

    @GetMapping
    ResponseEntity<Page<T>> getItems(@RequestParam(defaultValue = PageConstant.DEFAULT_VALUE_PAGE) int page,
                     @RequestParam(defaultValue = PageConstant.DEFAULT_VALUE_SIZE_PAGE) int size);
    @PutMapping
    ResponseEntity<T> update(T objeto);
}
