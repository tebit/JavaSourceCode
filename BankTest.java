package revision;

import java.util.Scanner;

public class BankTest {

	public static void main(String[] args) {
try {
//		System.out.println("Your Account has been blocked, Please contact your branch");
		Bank b = new Bank();
//		b.setUserName(userName);
//		b.setPassword(password);

		b.login();
}catch(Exception e) {
	System.out.println("You can't do that.");
}
	

	}
}
