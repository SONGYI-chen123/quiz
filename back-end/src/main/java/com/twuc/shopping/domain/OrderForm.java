package com.twuc.shopping.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderForm {
    private List<ShoppingCartRequest> ShoppingCartRequests;
}
