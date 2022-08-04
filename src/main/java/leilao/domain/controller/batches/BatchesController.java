package leilao.domain.controller;

import leilao.infra.repository.BatchesRepo;
import leilao.infra.model.BatchesModel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/batches")
public class BatchesController {
    
    @Autowired
    private BatchesRepo batchesRepo ;


    @GetMapping
    public List<Batches> listAll() {
        return BatchesRepo.findAll();
    }

    @PostMapping
    public Batches addBatches(@RequestBody Batches batches) {
        BatchesRepo.save(batches);
        return batches;
    }

    @DeleteMapping("/{id}")
    public Batches removeBatches(@RequestBody Batches batches) {
        BatchesRepo.delete(batches);
        return batches; 
    }

}