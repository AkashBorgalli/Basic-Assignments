package com.training.basicassignments;

public class CUIApplication {

	public static String login(String username, String password) {
		String statement = null;
			if (username.contentEquals("Akash") && password.contentEquals("Capgemini")) {
				statement = "Welcome" + "," + username;
			} 
			else { 
				for(int i =1 ;i<=3;i++) {
					if (i==3) {
						statement = "Contact Admin";
						
					}
				}
			}
			
		return statement;

	}

}
