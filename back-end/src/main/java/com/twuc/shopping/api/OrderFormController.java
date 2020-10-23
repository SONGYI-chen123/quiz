package com.twuc.shopping.api;

import com.twuc.shopping.domain.OrderForm;
import com.twuc.shopping.repository.OrderFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.boot.autoconfigure.rsocket.RSocketRequesterAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import com.twuc.shopping.Po.OrderFormPo;
import com.twuc.shopping.repository.OrderFormRepository;

@RestController
public class OrderFormController {
    @Autowired
    OrderFormRepository orderFormRepository;

    @PostMapping("/add")
    public ResponseEntity addOrderForm(@RequestBody OrderForm orderForm){
    }
}
