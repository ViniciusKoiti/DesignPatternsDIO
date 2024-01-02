package controller;

import common.constant.PageConstant;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;

public interface CrudController<T> {

    ResponseEntity<T> create(T objetoVo);
    ResponseEntity<T> getById(long id);

    ResponseEntity<Page<T>> getItems(@RequestParam(defaultValue = PageConstant.DEFAULT_VALUE_PAGE) int page,
                     @RequestParam(defaultValue = PageConstant.DEFAULT_VALUE_SIZE_PAGE) int size);
    ResponseEntity<T> update(T objeto);
}
