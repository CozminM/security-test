package com.codecool.securityTest.repository;

import com.codecool.securityTest.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client, Long> {

    Optional<Client> findByEmail(String email);

    Client getClientById(Long id);

    boolean existsClientsByUsername (String username);

    boolean existsClientsByEmail (String email);
}
