package revision;

import java.util.Scanner;

public class Bank {
	
	private String userName;
	private String password;
	private int totalAttempt;

	Bank() {

	}

	Bank(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return this.password;
	}

	public void login() {

		while (totalAttempt <= 3) {
		
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please Enter User Name");
			String userName1 = scanner.nextLine();
			System.out.println("Please Enter Password");
			String password1 = scanner.nextLine();

			if (userName1.equals("Harry") && password1.equals("true")) {
				System.out.println("Welcome Tebson Global");
				totalAttempt = 4;

			} else {
				System.out.println("Invalid Input");
				totalAttempt++;

				if (totalAttempt == 3) {

					System.out.println("Your account has been blocked");
					totalAttempt = 4;
				}
			}
		} 
			
		}
			
		
		
		
	}
	
		
	


// boolean correct = false;

// while (correct == false) {
// if (userName.equals("Harry") && password.equals("true")) {

// System.out.println("User Name and Password are valid");
// correct = true;
// } //else {
// System.out.println("Invalid User Name and Password, Please again");
// }
