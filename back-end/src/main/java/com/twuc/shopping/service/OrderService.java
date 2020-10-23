package com.twuc.shopping.service;

import com.twuc.shopping.Po.OrderFormPo;
import com.twuc.shopping.Po.ProductPo;
import com.twuc.shopping.Po.shoppingCartPo;
import com.twuc.shopping.domain.OrderForm;
import com.twuc.shopping.domain.Product;
import com.twuc.shopping.repository.OrderFormRepository;

import java.util.ArrayList;
import java.util.List;

public class OrderService {
    private final OrderFormRepository orderFormRepository;
    public OrderService(OrderFormRepository orderFormRepository){
        this.orderFormRepository = orderFormRepository;
    }


    public void addOrder(OrderForm orderForm) {
        OrderFormPo orderFormPo = new OrderFormPo();
        List<shoppingCartPo> shoppingCarts = new ArrayList<shoppingCartPo>();
    }
}
