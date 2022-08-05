package leilao.domain.controller.batches;

import leilao.infra.repository.BatchesRepo;
import leilao.infra.model.BatchesModel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/batches")
public class BatchesController {

    @Autowired
    private BatchesRepo batchesRepo;

    @GetMapping
    public List<BatchesModel> listAll() {
        return batchesRepo.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BatchesModel addBatches(@RequestBody BatchesModel batch) {
        batchesRepo.save(batch);
        return batch;
    }

    @DeleteMapping("/{id}")
    public BatchesModel removeBatches(@RequestBody BatchesModel batches) {
        batchesRepo.delete(batches);
        return batches;
    }

}