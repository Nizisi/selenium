package seleniumTest;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import java.io.File;
import java.io.IOException;


public class screenshot {

	public static void main(String[] args)throws InterruptedException,IOException {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\新建文件夹\\seleniumTest\\chromedriver.exe");

		ChromeDriver Cdriver = new ChromeDriver();
		Cdriver.get("file:///C:/Users/chang/Downloads/Screen%20shot.pdf");
		Cdriver.manage().window().maximize();
		Thread.sleep(2000);
		TakesScreenshot screenshot=(TakesScreenshot) Cdriver;
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		File des = new File("D:\\\\新建文件夹\\\\seleniumTest\\screenshot.png");
		FileHandler.copy(src,des);
		
		Cdriver.close();
	}

}
