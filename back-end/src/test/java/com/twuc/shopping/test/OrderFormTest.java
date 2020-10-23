package com.twuc.shopping.test;



import com.fasterxml.jackson.databind.ObjectMapper;
import com.twuc.shopping.domain.OrderForm;
import com.twuc.shopping.domain.ShoppingCartRequest;
import com.twuc.shopping.repository.OrderFormRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class OrderFormTest {
    @Autowired
    MockMvc mockMvc;
    @Autowired
    OrderFormRepository orderFormRepository;

    @Test
    public void should_add_order_Form() throws Exception{
        List<ShoppingCartRequest> shoppingCartRequests = new ArrayList<ShoppingCartRequest>();
        ShoppingCartRequest shoppingCartRequest =ShoppingCartRequest.builder().name("西瓜").price("20.5").num(3).build();
        shoppingCartRequests.add(shoppingCartRequest);
        OrderForm orderForm = new OrderForm(shoppingCartRequests);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = objectMapper.writeValueAsString(orderForm);
        mockMvc.perform(post("/add").content(jsonString).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated());
    }
}
