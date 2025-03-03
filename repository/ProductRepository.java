package com.seuUsuario.crud_auth.repository;

import com.seuUsuario.crud_auth.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
