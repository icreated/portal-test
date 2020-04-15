package org.icreated.portal.api;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Properties;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes= {AppPortalConfiguration.class})
public class AppPortalConfigurationTest {
	
	@Autowired
	Properties ctx;
	
	@Autowired
	Environment env;
	
	
	@Test
	public void testCtx() {
		
		assertThat(ctx.getProperty("#AD_Client_ID")).isEqualTo(env.getProperty("ctx.AD_Client_ID"));
		assertThat(ctx.getProperty("#AD_Org_ID")).isEqualTo(env.getProperty("ctx.AD_Org_ID"));
	}
	
}