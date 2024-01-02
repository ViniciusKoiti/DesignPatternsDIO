package service;

import common.constant.PageConstant;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;

public interface CrudService<T> {

    ResponseEntity<T> create(T objetoVo);
    ResponseEntity<T> getById(long id);

    ResponseEntity<Page<T>> getItems(int page,
                                     int size);
    ResponseEntity<T> update(T objeto);
}
