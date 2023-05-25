package com.example.realtor.repositories;

import com.example.realtor.model.Flat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlatRepository extends JpaRepository<Flat, Long> {
}
