package com.twuc.shopping.Po;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="product")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductPo {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String price;
    private String unit;
    private String imageUrl;

    @OneToOne
    private OrderFormPo orderFormPo;
}
