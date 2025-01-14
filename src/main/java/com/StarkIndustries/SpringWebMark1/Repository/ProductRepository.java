package com.StarkIndustries.SpringWebMark1.Repository;

import com.StarkIndustries.SpringWebMark1.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
