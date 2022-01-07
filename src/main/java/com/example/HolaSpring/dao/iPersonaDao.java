package com.example.HolaSpring.dao;

import com.example.HolaSpring.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface iPersonaDao extends JpaRepository<Persona, Long>{
    
}
