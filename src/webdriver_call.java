
public class webdriver_call {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     webdriver d=new firefoxDriver();
     
     d.sendkeys();
     d.get();
     
     webdriver d1= new chromeDriver();
     d1.get();
     d1.sendkeys();
     
	}

}
