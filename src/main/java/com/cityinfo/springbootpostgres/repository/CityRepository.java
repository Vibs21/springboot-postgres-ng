package com.cityinfo.springbootpostgres.repository;

import com.cityinfo.springbootpostgres.model.Cityinfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<Cityinfo, Long> {

}
