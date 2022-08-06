package leilao.infra.repository;

import leilao.infra.model.BatchesModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BatchesRepo extends JpaRepository<BatchesModel, Long> {

}
