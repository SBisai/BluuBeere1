import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenBrowser {
	
	@Test
	 public static void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "G:\\Java\\Bluubeere\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		System.out.println("**************Done*****************");
		System.out.println("Testing done by Soumitra");
		driver.close();
	}

}
