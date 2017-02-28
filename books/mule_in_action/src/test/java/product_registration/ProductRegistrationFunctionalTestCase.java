package product_registration;

import org.junit.Test;
import org.mule.api.MuleMessage;
import org.mule.api.client.MuleClient;
import org.mule.tck.FunctionalTestCase;
import org.mule.transport.NullPayload;

@SuppressWarnings("deprecation")
public class ProductRegistrationFunctionalTestCase extends FunctionalTestCase {
	protected String getConfigResources(){
		return "./src/main/app/product_registration.xml";
	}
	
	@Test
	public void testCanRegisterProducts() throws Exception {
		MuleClient client = muleContext.getClient();
		
		String productAsJson = "{\"name\":\"Widget\", \"price\":9.99, \"weight\":1.0, \"sku\":\"abcd-12345\"}";
		
		client.dispatch("http://localhost:8081/", productAsJson, null);
		
		MuleMessage result = client.request("jms://products",  RECEIVE_TIMEOUT);
		
		assertNotNull(result);
		assertNull(result.getExceptionPayload());
		assertFalse(result.getPayload() instanceof NullPayload);
		assertEquals(productAsJson, result.getPayloadAsString());
	}
	
}
