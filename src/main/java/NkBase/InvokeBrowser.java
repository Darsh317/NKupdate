package NkBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokeBrowser {

	public WebDriver driver;
	public WebDriverWait wait;

	public void browserOpen() {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().clearDriverCache().setup();
//		WebDriverManager.chromedriver().setup();
//		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Fresh-eclipse-workspace\\Naukari\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wait = new WebDriverWait(driver, Duration.ofSeconds(45));
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		

	}

}
