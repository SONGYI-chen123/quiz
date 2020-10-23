package com.twuc.shopping.service;

import com.twuc.shopping.Po.ProductPo;
import com.twuc.shopping.Po.shoppingCartPo;
import com.twuc.shopping.domain.Product;
import com.twuc.shopping.domain.ShoppingCartReponse;
import com.twuc.shopping.domain.shoppingCartRequest;
import com.twuc.shopping.repository.ProductRepository;
import com.twuc.shopping.repository.shoppingCartRepository;

import java.util.List;
import java.util.stream.Collectors;

public class ProductService {
    private final ProductRepository productRepository;
    private final shoppingCartRepository shoppingCartRepository;

    public ProductService(ProductRepository productRepository, com.twuc.shopping.repository.shoppingCartRepository shoppingCartRepository){
        this.productRepository = productRepository;
        this.shoppingCartRepository = shoppingCartRepository;
    }

    public void addProduct(Product product) {
        ProductPo productPo = new ProductPo();
        productPo.setName(product.getName());
        productPo.setPrice(product.getPrice());
        productPo.setImageUrl(product.getImageUrl());
        productRepository.save(productPo);
    }

    public List<Product> showProduct() {
        return productRepository.findAll().stream()
                .map(
                        item -> {
                            Product product = new Product();
                            product.setName(item.getName());
                            product.setPrice(item.getPrice());
                            product.setUnit(item.getUnit());
                            product.setImageUrl(item.getImageUrl());
                            return product;
                        })
                .collect(Collectors.toList());
    }

    public void addProductToShoppingCart(shoppingCartRequest shoppingCartRequest) {
        List<shoppingCartPo> shoppingCartPos = shoppingCartRepository.findAll();
        for(int i = 0;i<shoppingCartPos.size();i++){
            if(shoppingCartPos.get(i).getName().equals(shoppingCartRequest.getName())){
                int num = shoppingCartPos.get(i).getNum() + 1;
                shoppingCartPo shoppingCartPo = shoppingCartRepository.findByname(shoppingCartRequest.getName());
                shoppingCartPo.setNum(num);
                shoppingCartRepository.save(shoppingCartPo);
            }
        }
        shoppingCartPo shoppingCartPo = new shoppingCartPo();
        shoppingCartPo.setName(shoppingCartRequest.getName());
        shoppingCartPo.setPrice(shoppingCartRequest.getPrice());
        shoppingCartPo.setNum(0);
        shoppingCartRepository.save(shoppingCartPo);
    }

    public List<ShoppingCartReponse> showShoppingCart() {
        return shoppingCartRepository.findAll().stream()
                .map(
                        item -> {
                            ShoppingCartReponse shoppingCartReponse = new ShoppingCartReponse();
                            shoppingCartReponse.setName(item.getName());
                            shoppingCartReponse.setNum(item.getNum());
                            return shoppingCartReponse;
                        })
                .collect(Collectors.toList());
    }
}
