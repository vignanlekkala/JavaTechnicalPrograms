 interface webdriver {

	
	abstract void get();
	abstract void sendkeys();
	
}

 class firefoxDriver implements webdriver
 {
	 public void get()
	 {
		 System.out.println("firefox get method");
		 
	 }
	 
	 public void sendkeys()
	 {
		 System.out.println("firefox sendkeys method");
	 }
	 
 }
 
 
 class chromeDriver implements webdriver
 {
	 public void get()
	 {
		 System.out.println("chrome get method");
		 
	 }
	 public void sendkeys()
	 {
		 System.out.println("chrome sendkeys method");
	 }
	 
	 
	
	 public void click()
	 {
		 System.out.println("chrome click method");
	 }
	 
 }
 
 

 