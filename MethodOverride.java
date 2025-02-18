package javaPractice;
class Parent_Class
{
	final void login()
	{
		System.out.println("Login with email id");
	}
}
public class MethodOverride extends Parent_Class                                                                                       
{
	void loginwithmobilno()
	{	
		System.out.println("Login with mobile no");
		//super.login(); //super keyword
	}
	public static void main(String[] args) 
	{
		MethodOverride m1=new MethodOverride();
		m1.login();	
	}
}
