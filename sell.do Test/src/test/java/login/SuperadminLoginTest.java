package login;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.selldo.Utility.BaseTest;
import com.selldoPOM.crm.ClientLoginPage;
import com.selldoPOM.crm.LoginPage;

public class SuperadminLoginTest extends BaseTest{

	@Test
	public void superadminLoginTest() throws Exception{
		String url1 = "https://v2.sell.do/admin/clients/login_as_client";
		String url2 = driver.getCurrentUrl();
		
		
		LoginPage login =  new LoginPage(driver);
		login.login("divya+superadmin@amuratech.com", "amura@123");
		
		assertEquals(url2, url1, "Login PASS");
		
		ClientLoginPage clp = new ClientLoginPage(driver);
		clp.clientLogin("Amura developers pvt ltd");
		
		clp.logout();
	}
	
}
