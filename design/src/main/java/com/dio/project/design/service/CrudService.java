package com.dio.project.design.service;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

public interface CrudService<T> {

    ResponseEntity<T> create(T objetoVo);
    ResponseEntity<T> getById(@PathVariable long id);

    ResponseEntity<Page<T>> getItems(int page,
                                     int size);
    ResponseEntity<T> update(T objeto);
}
