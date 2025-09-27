package day42testNG;

import org.testng.annotations.Test;

/*
1. open app
2. login 
3. logout 
*/ 

public class FirstTestcase {
	
	

	@Test(priority =1)
	void openapp() {
		System.out.println("open application ");
	}
	
	@Test (priority =2)
	void login() {
		System.out.println("login application ");
	}
	
	@Test (priority =4)
	void logout() {
		System.out.println(" logiut application ");
	}
}
