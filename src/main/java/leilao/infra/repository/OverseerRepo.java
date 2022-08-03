package leilao.infra.repository;

import leilao.infra.model.OverseerModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OverseerRepo extends JpaRepository<OverseerModel, String> {

}
