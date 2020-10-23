package com.twuc.shopping.repository;

import com.twuc.shopping.Po.shoppingCartPo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface shoppingCartRepository extends CrudRepository<shoppingCartPo,Integer> {
    @Override
    List<shoppingCartPo> findAll();

    shoppingCartPo findByname(String name);
}
