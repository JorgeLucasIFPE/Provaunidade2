package leilao.domain.controller.overseer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import leilao.infra.model.OverseerModel;
import leilao.infra.repository.OverseerRepo;

@RestController
@RequestMapping("/overseer")
public class OverseerController {

    @Autowired
    private OverseerRepo overseerRepo;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)

    public List<OverseerModel> listAll() {
        List<OverseerModel> overseer = overseerRepo.findAll();
        return overseer;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public OverseerModel AddOverseer(@RequestBody OverseerModel overseer) {
        overseerRepo.save(overseer);
        return overseer;
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public OverseerModel deleteOverseer(@PathVariable OverseerModel overseer) {
        overseerRepo.delete(overseer);
        return overseer;
    }

}
