package com.twuc.shopping.repository;

import com.twuc.shopping.Po.ProductPo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<ProductPo,Integer> {
    @Override
    List<ProductPo> findAll();
}
