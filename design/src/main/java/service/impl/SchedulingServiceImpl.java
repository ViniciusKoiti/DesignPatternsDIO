package service.impl;

import dto.SchedulingDTO;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import service.SchedulingService;

public class SchedulingServiceImpl implements SchedulingService {
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
