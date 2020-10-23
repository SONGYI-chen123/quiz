package com.twuc.shopping.service;

import com.twuc.shopping.Po.OrderFormPo;
import com.twuc.shopping.Po.ShoppingCartPo;
import com.twuc.shopping.domain.OrderForm;
import com.twuc.shopping.domain.ShoppingCartRequest;
import com.twuc.shopping.repository.OrderFormRepository;
import com.twuc.shopping.repository.ShoppingCartRepository;

import java.util.ArrayList;
import java.util.List;

public class OrderService {
    private final OrderFormRepository orderFormRepository;
    private final ShoppingCartRepository shoppingCartRepository;

    public OrderService(OrderFormRepository orderFormRepository, ShoppingCartRepository shoppingCartRepository){
        this.orderFormRepository = orderFormRepository;
        this.shoppingCartRepository = shoppingCartRepository;
    }


    public void addOrder(OrderForm orderForm) {
        List<ShoppingCartRequest> ShoppingCartRequests = orderForm.getShoppingCartRequests();
        List<ShoppingCartPo> shoppingCarts = new ArrayList<ShoppingCartPo>();
        for(int i = 0; i< ShoppingCartRequests.size(); i++){
            shoppingCarts.add(shoppingCartRepository.findByname(ShoppingCartRequests.get(i).getName()));
        }
        OrderFormPo orderFormPo = new OrderFormPo();
        orderFormRepository.save(orderFormPo);
    }

    public List<OrderForm> showOrderForm() {
        List<OrderFormPo> orderFormPos = orderFormRepository.findAll();
        List<OrderForm> orderForms = new ArrayList<>();
        for(int i=0;i<orderFormPos.size();i++){
            for(int j=0;j<orderFormPos.get(i).getShoppingCartPos().size();j++){
                ShoppingCartPo shoppingCartPo = orderFormPos.get(i).getShoppingCartPos().get(j);
                ShoppingCartRequest shoppingCartRequest = orderForms.get(i).getShoppingCartRequests().get(j);
                shoppingCartRequest.setName(shoppingCartPo.getName());
                shoppingCartRequest.setPrice(shoppingCartPo.getPrice());
                shoppingCartRequest.setNum(shoppingCartPo.getNum());
                orderForms.get(i).getShoppingCartRequests().add(shoppingCartRequest);
            }
            orderForms.add(orderForms.get(i));
        }
        return orderForms;
    }
}
