package com.twuc.shopping.Po;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.CascadeType.REMOVE;

@Entity
@Table(name="shoppingCart")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class shoppingCartPo {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String price;
    private Integer num;
}
