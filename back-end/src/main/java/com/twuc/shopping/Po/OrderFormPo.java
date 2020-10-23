package com.twuc.shopping.Po;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.util.List;

import static javax.persistence.CascadeType.*;

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
    @OneToMany(cascade = CascadeType.REMOVE , mappedBy = "orderform")
    private List<shoppingCartPo> shoppingCartPos;

}
