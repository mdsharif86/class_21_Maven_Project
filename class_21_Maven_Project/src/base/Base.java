package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\Driver\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectpath:" + projectPath);
		
		fis = new FileInputStream(projectpath + "")
	}
}
