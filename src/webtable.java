import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class webtable {

	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Nisum\\Music\\Driver Files\\IEDriverServer_x64_3.8.0\\IEDriverServer.exe");
		driver =new InternetExplorerDriver();
		
		driver.navigate().to("https://money.rediff.com/gainers/bsc/daily/groupa?");
		
		
		
		
	}

}
