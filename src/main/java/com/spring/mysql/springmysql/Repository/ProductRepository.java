package com.spring.mysql.springmysql.Repository;

import com.spring.mysql.springmysql.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}
