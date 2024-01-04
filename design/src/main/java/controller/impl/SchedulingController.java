package controller.impl;

import controller.CrudController;
import dto.SchedulingDTO;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import service.SchedullingService;

@RestController
public class SchedulingController implements CrudController<SchedulingDTO> {

    public SchedulingController(SchedullingService schedullingService) {
        this.schedullingService = schedullingService;
    }

    private SchedullingService schedullingService;


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
