package com.Goveg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Goveg.model.ItemBean;

public interface ItemRepository extends JpaRepository<ItemBean, Integer> {

}
