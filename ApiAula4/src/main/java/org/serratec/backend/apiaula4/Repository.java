package org.serratec.backend.apiaula4;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import org.serratec.backend.apiaula4.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface Repository extends JpaRepository<Cliente, UUID> {
}

