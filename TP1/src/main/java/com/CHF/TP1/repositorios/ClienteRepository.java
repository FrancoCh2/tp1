package com.CHF.TP1.repositorios;

import com.CHF.TP1.entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository < Cliente,Long> {
}
