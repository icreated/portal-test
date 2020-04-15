package org.icreated.portal.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.sql.PreparedStatement;
import java.util.Properties;

import org.compiere.model.MInvoice;
import org.compiere.model.PO;
import org.compiere.util.DB;
import org.icreated.portal.api.AppPortalConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes= {AppPortalConfiguration.class})
public class InvoiceServiceTest {
	
	@Autowired
	InvoiceService invoiceService;
	
	@Autowired
	Properties ctx;
	
	
	@Test
	public void getInvoice() {
		
		
	}

}
