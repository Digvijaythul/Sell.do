package login;

import org.testng.annotations.Test;

import com.selldo.Utility.BaseTest;
import com.selldoPOM.crm.LoginPage;

public class SuperadminLoginTest extends BaseTest{

	@Test
	public void superadminLoginTest() throws Exception{
		LoginPage login =  new LoginPage(driver);
		login.login("divya+superadmin@amuratech.com", "amura@123");
		//Git check 2
	}
	
}
