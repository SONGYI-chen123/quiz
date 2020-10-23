package com.twuc.shopping.service;

import com.twuc.shopping.Po.ProductPo;
import com.twuc.shopping.domain.Product;
import com.twuc.shopping.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public void addProduct(Product product) {
        ProductPo productPo = new ProductPo();
        productPo.setName(product.getName());
        productPo.setPrice(product.getPrice());
        productPo.setImageUrl(product.getImageUrl());
        productRepository.save(productPo);
    }

}
