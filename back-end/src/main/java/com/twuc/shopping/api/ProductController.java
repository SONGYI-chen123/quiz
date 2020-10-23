package com.twuc.shopping.api;

import com.twuc.shopping.domain.Product;
import com.twuc.shopping.domain.ShoppingCartReponse;
import com.twuc.shopping.domain.shoppingCartRequest;
import com.twuc.shopping.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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

    @PostMapping("/addShopping")
    public void addProductToShoppingCart(@RequestBody shoppingCartRequest shoppingCartRequest){
        productService.addProductToShoppingCart(shoppingCartRequest);
    }

    @GetMapping("/shopping")
    public List<ShoppingCartReponse> showShoppingCart(){
        List<ShoppingCartReponse> shoppingCarts = new ArrayList<ShoppingCartReponse>();
        shoppingCarts = productService.showShoppingCart();
        return shoppingCarts;
    }
}
