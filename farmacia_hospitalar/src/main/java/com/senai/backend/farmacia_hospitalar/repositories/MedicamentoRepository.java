package com.senai.backend.farmacia_hospitalar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.backend.farmacia_hospitalar.models.Medicamento;

@Repository
public interface MedicamentoRepository extends JpaRepository<Medicamento, Integer> {
    
}
