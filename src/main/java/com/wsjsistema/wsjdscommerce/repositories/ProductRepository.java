package com.wsjsistema.wsjdscommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wsjsistema.wsjdscommerce.entities.Product;

public interface ProductRepository  extends JpaRepository<Product, Long>{

}
