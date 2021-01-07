package com.hcl.medicinemonitoring.test;


import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hcl.airport.model.User;
import com.hcl.medicinemonitoring.controller.HomeController;
import com.hcl.medicinemonitoring.controller.UserControler;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;

public class UserControllerTest {

	 

    private MockMvc mockMvc;

 

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(new UserControler()).build();
    }

 

    @Test
    public void testHomePage() throws Exception {
        this.mockMvc.perform(post("/user/registration")
         .content(asJsonString(new User(1,"sonika","sony","12345",20,"skd",true,1)))
         .contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                //.andExpect(view().name("registerSuccess"))
                  .andExpect(redirectedUrl("registerSuccess"))
                //.andDo(MockMvcResultHandlers.print())
                .andReturn();
    }

 

    /*@Test
    public void testMessagePage() throws Exception {
        this.mockMvc.perform(get("/message")).andExpect(status().isOk())
                .andExpect(content().string("Hello there!"));
    }*/
    public static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}