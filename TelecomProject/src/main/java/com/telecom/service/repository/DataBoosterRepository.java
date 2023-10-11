package com.telecom.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telecom.model.DataBooster;

@Repository
public interface DataBoosterRepository extends JpaRepository<DataBooster, Integer>{

}
