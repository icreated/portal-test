package org.icreated.portal.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.icreated.portal.api.AppPortalConfiguration;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes= {AppPortalConfiguration.class})
public class CommonControllerTest {
	
	@Autowired
	private WebApplicationContext context;
	
	private MockMvc mvc;

	@Before
	public void setUp() throws Exception {
	    this.mvc = MockMvcBuilders.webAppContextSetup(context).build();
	}
	
	@Test
	public void shouldSayHello() throws Exception {
		
		String json = mvc.perform(get("/hello")).andExpect(status().isOk())
		.andReturn().getResponse().getContentAsString();
		assertThat(json).contains("{\"token\":\"Hello\"}");
	}

}
