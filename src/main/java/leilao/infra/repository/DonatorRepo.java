package leilao.infra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import leilao.infra.model.DonatorModel;

@Repository
public interface DonatorRepo extends JpaRepository<DonatorModel, Long> {

    DonatorModel getById(DonatorModel donator_id);

}