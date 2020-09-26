package com.twuc.shopping.test;



import com.fasterxml.jackson.databind.ObjectMapper;
import com.twuc.shopping.domain.OrderForm;
import com.twuc.shopping.repository.OrderFormRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
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
    public void should_add_orderForm() throws Exception{
        OrderForm orderForm = new OrderForm("西瓜",20.00,2,"个");
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = objectMapper.writeValueAsString(orderForm);
        mockMvc.perform(post("/add").content(jsonString).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated());
    }
}
