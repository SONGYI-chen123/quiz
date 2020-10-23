package com.twuc.shopping.api;

import com.twuc.shopping.domain.OrderForm;
import com.twuc.shopping.repository.OrderFormRepository;
import com.twuc.shopping.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.boot.autoconfigure.rsocket.RSocketRequesterAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import com.twuc.shopping.Po.OrderFormPo;
import com.twuc.shopping.repository.OrderFormRepository;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@Slf4j
@RestController
public class OrderFormController {
    @Autowired
    OrderService orderService;

    @PostMapping("/addOrder")
    public void addOrder(@RequestBody OrderForm orderForm){
        orderService.addOrder(orderForm);
    }

    @GetMapping("/showOrder")
    public List<OrderForm> showOrderForm(){
        List<OrderForm> orderForms = new ArrayList<>();
        orderForms = orderService.showOrderForm();
        return orderForms;
    }
}
