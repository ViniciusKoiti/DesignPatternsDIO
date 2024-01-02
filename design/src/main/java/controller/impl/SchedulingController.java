package controller.impl;

import controller.CrudController;
import dto.SchedulingDTO;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;

public class SchedulingController implements CrudController<SchedulingDTO> {
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
