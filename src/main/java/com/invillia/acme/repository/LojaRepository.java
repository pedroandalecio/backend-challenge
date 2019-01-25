package com.invillia.acme.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.invillia.acme.model.Loja;

@Repository
public interface LojaRepository extends JpaRepository<Loja, Integer> {
	
}
