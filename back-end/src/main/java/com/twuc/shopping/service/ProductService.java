package com.twuc.shopping.service;

import com.twuc.shopping.Po.ProductPo;
import com.twuc.shopping.domain.Product;
import com.twuc.shopping.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
}
