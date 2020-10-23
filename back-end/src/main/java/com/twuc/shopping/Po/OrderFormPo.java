package com.twuc.shopping.Po;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.util.List;

@Entity
@Table(name="orderform")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class OrderFormPo {
    @Id
    @GeneratedValue
    private Integer id;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "orderFormPo")
    private List<ShoppingCartPo> ShoppingCartPos;

}
