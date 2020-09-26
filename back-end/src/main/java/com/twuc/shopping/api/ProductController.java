package com.twuc.shopping.api;

import com.twuc.shopping.Po.OrderFormPo;
import com.twuc.shopping.Po.ProductPo;
import com.twuc.shopping.domain.OrderForm;
import com.twuc.shopping.domain.Product;
import com.twuc.shopping.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    ProductRepository productRepository;

    @PostMapping("/addProduct")
    public ResponseEntity addProduct(@RequestBody Product product){
        ProductPo  productPo= new ProductPo();
        productPo.setName(product.getName());
        productPo.setPrice(product.getPrice());
        productPo.setUnit(product.getUnit());
        productPo.setImageUrl(product.getImageUrl());
        return ResponseEntity.created((null)).build();
    }
}
