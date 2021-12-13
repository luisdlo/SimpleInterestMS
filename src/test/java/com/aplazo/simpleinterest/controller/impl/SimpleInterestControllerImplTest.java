package com.aplazo.simpleinterest.controller.impl;

import com.aplazo.simpleinterest.service.SimpleInterestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(SimpleInterestControllerImpl.class)
class SimpleInterestControllerImplTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private SimpleInterestService simpleInterestService;


    @Test
    void getListPayments() throws Exception {

        when(simpleInterestService.getListPayments(any())).thenReturn(new ArrayList<>());

        this.mockMvc.perform(post("/interest/payments").content("{ \"amount\": 400, \"terms\": 5, \"rate\": 2 }")
                        .contentType(MediaType.APPLICATION_JSON_VALUE)
                        .accept(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(status().isOk());
    }
}