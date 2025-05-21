package org.serratec.backend.apiaula5.repository;

import org.serratec.backend.apiaula5.entity.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface VeiculoRespository extends JpaRepository<Veiculo, UUID> {


    Optional<Veiculo> findById(Long id);

    boolean existsById(Long id);

    void deleteById(Long id);
}
