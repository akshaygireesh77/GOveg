package com.Goveg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Goveg.model.RegisterBean;

public interface RegisterRepository extends JpaRepository<RegisterBean, Integer> {

	RegisterBean findByRegId(int regId);
}
