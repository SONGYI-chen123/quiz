package com.twuc.shopping.repository;

import com.twuc.shopping.Po.ShoppingCartPo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ShoppingCartRepository extends CrudRepository<ShoppingCartPo,Integer> {
    @Override
    List<ShoppingCartPo> findAll();

    ShoppingCartPo findByname(String name);
}
