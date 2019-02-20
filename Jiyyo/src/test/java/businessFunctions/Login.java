package businessFunctions;

import accelerators.Actiondrivers;

public class Login extends Actiondrivers{
	
	public static void login() throws Throwable
	{
		click(repository.login.loginmenu, "Click on Login Menu");
		type(repository.login.username, "seerapu@yopmail.com", "User Name");
		type(repository.login.password, "03g55a0204", "Password");
		click(repository.login.loginbutton, "Login");
	}

}
