package com.CHF.TP1.repositorios;

import com.CHF.TP1.entidades.Domicilio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DomicilioRepository extends JpaRepository <Domicilio,Long> {
}
