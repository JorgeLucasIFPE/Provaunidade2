package leilao.domain.controller.donator;

import java.util.List;

import leilao.infra.model.DonatorModel;
import leilao.infra.repository.DonatorRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/donator")
public class DonatorController {

    @Autowired
    private DonatorRepo donatorRepo;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<DonatorModel> listAll() {
        return donatorRepo.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public DonatorModel addDonator(@RequestBody DonatorModel donator) {
        donatorRepo.save(donator);
        return donator;
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public DonatorModel removeDonator(@RequestBody DonatorModel donator) {
        donatorRepo.delete(donator);
        return donator;
    }

}