package com.twuc.shopping.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.nio.file.FileStore;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ShoppingCartRequest {
    private String name;
    private String price;
    private Integer num;
}
