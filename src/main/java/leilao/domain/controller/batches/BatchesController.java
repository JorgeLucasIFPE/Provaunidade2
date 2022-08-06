package leilao.domain.controller.batches;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import leilao.infra.model.BatchesModel;
import leilao.infra.repository.BatchesRepo;

@RestController
@RequestMapping("/batches")
public class BatchesController {

    @Autowired
    private BatchesRepo batchesRepo;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<BatchesModel> listAll() {
        List<BatchesModel> batches = batchesRepo.findAll();
        return batches;
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
    public BatchesModel removeBatches(@PathVariable("id") BatchesModel batch) {
        batchesRepo.delete(batch);
        // TODO compare time befero deletion
        return batch;
    }
}