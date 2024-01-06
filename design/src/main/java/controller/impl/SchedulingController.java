package controller.impl;

import controller.CrudController;
import dto.SchedulingDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.SchedulingService;

@RestController
@RequestMapping("/scheduling")
public class SchedulingController implements CrudController<SchedulingDTO> {

    private final SchedulingService schedullingService;

    public SchedulingController(SchedulingService schedullingService) {
        this.schedullingService = schedullingService;
    }

    @Override
    public ResponseEntity<SchedulingDTO> create(SchedulingDTO objetoVo) {


        return null;
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<SchedulingDTO> getById(@PathVariable long id) {
        return this.schedullingService.getById(id);
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
