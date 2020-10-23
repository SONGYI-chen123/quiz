package com.twuc.shopping.service;

import com.twuc.shopping.Po.OrderFormPo;
import com.twuc.shopping.Po.shoppingCartPo;
import com.twuc.shopping.domain.OrderForm;
import com.twuc.shopping.domain.shoppingCartRequest;
import com.twuc.shopping.repository.OrderFormRepository;

import java.util.ArrayList;
import java.util.List;

public class OrderService {
    private final OrderFormRepository orderFormRepository;
    private final com.twuc.shopping.repository.shoppingCartRepository shoppingCartRepository;

    public OrderService(OrderFormRepository orderFormRepository, com.twuc.shopping.repository.shoppingCartRepository shoppingCartRepository){
        this.orderFormRepository = orderFormRepository;
        this.shoppingCartRepository = shoppingCartRepository;
    }


    public void addOrder(OrderForm orderForm) {
        List<shoppingCartRequest> shoppingCartRequests = orderForm.getShoppingCartRequests();
        List<shoppingCartPo> shoppingCarts = new ArrayList<shoppingCartPo>();
        for(int i=0; i<shoppingCartRequests.size();i++){
            shoppingCarts.add(shoppingCartRepository.findByname(shoppingCartRequests.get(i).getName()));
        }
        OrderFormPo orderFormPo = new OrderFormPo();
        orderFormRepository.save(orderFormPo);
    }
}
