package com.twuc.shopping.api;

import com.twuc.shopping.Po.OrderFormPo;
import com.twuc.shopping.Po.ProductPo;
import com.twuc.shopping.domain.OrderForm;
import com.twuc.shopping.domain.Product;
import com.twuc.shopping.repository.ProductRepository;
import com.twuc.shopping.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@Slf4j
@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("/addProduct")
    public void addProduct(@RequestBody Product product){
        productService.addProduct(product);
    }

    @GetMapping("/product")
    public List<Product> showProduct(){
        List<Product> products= new ArrayList<Product>();
        products = productService.showProduct();
        return products;
    }
}
