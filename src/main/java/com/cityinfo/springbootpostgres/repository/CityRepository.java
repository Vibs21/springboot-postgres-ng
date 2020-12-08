package com.cityinfo.springbootpostgres.repository;

import com.cityinfo.springbootpostgres.model.Cityinfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface CityRepository extends JpaRepository<Cityinfo, Long> {

    @Query("select c from Cityinfo c where c.enddate BETWEEN ?1 and ?2")
    List<Cityinfo> getCityByDateRange(Date start, Date end);

}
