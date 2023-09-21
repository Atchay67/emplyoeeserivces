package com.atchaya.emplyoeeserivces;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmplyoeeRepository extends JpaRepository<Emplyoee,name>{

}