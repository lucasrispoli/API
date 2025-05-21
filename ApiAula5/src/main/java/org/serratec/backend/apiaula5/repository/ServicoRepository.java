package org.serratec.backend.apiaula5.repository;

import org.serratec.backend.apiaula5.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Long> {
}