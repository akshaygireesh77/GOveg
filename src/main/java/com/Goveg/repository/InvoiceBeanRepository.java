package com.Goveg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Goveg.model.InvoiceBean;
@Repository
public interface InvoiceBeanRepository extends JpaRepository<InvoiceBean, Integer> {
	List<InvoiceBean> findByRegId(int regId);
	 void deleteByRegId(int regId);

}
