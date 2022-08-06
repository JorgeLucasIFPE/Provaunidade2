package leilao.domain.controller.batches;

import leilao.infra.repository.BatchesRepo;
import leilao.infra.model.BatchesModel;

import java.time.LocalTime;
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
    @ResponseStatus(HttpStatus.OK)
    public List<BatchesModel> listAll() {
        return batchesRepo.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BatchesModel addBatches(@RequestBody BatchesModel batch) {
        batch.setDelieverDate(java.time.LocalTime.now());
        batchesRepo.save(batch);
        return batch;
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public BatchesModel removeBatches(@RequestBody BatchesModel batches) {
        batchesRepo.delete(batches);
        // TODO compare time befero deletion
        return batches;
    }

}