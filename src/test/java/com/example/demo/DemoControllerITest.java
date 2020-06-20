package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
class DemoControllerITest {
  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext context;

  @BeforeEach
  public void setup() {
    this.mockMvc = MockMvcBuilders
            .webAppContextSetup(this.context)
            .build();
  }

  @Test
  void whenGet_thenAssertViewOk() throws Exception {
    this.mockMvc.perform(get("/"))
            .andDo(print())
            .andExpect(status().isOk());
  }
}