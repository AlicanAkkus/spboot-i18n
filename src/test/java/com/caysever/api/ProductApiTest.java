package com.caysever.api;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Created by alican on 01.05.2017.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductApiTest {

    @Autowired
    private WebApplicationContext wac;
    private MockMvc mockMvc;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    @Test
    public void verifyProductsSize() throws Exception {
        this.mockMvc.perform(get("/api/product/")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$", hasSize(2)));
    }

    @Test
    public void verifyProductsFetching() throws Exception {
        this.mockMvc.perform(get("/api/product/")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print());
    }

    @Test
    public void verifyProductsContent() throws Exception {
        this.mockMvc.perform(get("/api/product/")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].name", containsString("Axon")))
                .andDo(print());
    }

}
