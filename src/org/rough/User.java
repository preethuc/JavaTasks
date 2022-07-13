package org.rough;

public class User {

	String[] users = {"Preetha","Abitha","Sneha","Priya"};
	String activeUser;
	public User(int userIndex) {
		System.out.println("User Constructor! \n" + users[userIndex] + "\n");
		this.activeUser = users[userIndex];
	}
	
	String getUserName(){
		return this.activeUser;
		
	}
}
