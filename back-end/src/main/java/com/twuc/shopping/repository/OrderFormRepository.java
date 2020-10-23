package com.twuc.shopping.repository;

import com.twuc.shopping.Po.OrderFormPo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderFormRepository extends CrudRepository<OrderFormPo,Integer> {
    @Override
    List<OrderFormPo> findAll();

}
