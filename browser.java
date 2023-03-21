package seleniumTest;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class browser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\新建文件夹\\seleniumTest\\chromedriver.exe");

		ChromeDriver Cdriver = new ChromeDriver();

		
		Cdriver.get("https://leafground.com/input.xhtml");
		Cdriver.manage().window().maximize();
		Thread.sleep(2000);
		
		//add / delete web element
		Cdriver.findElement(By.name("j_idt88:j_idt91")).clear();
		Thread.sleep(2000);
		
		Cdriver.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys("Hey");
		Cdriver.findElement(By.id("j_idt88:j_idt91")).sendKeys("Hey");
		Thread.sleep(3000);
		
		Cdriver.findElement(By.id("menuform:j_idt38")).click();
		Cdriver.findElement(By.id("menuform:m_checkbox")).click();
		Thread.sleep(1000);
		Cdriver.findElement(By.id("j_idt87:j_idt89")).click();
		Thread.sleep(3000);
		
		Cdriver.findElement(By.id("menuform:j_idt38")).click();
		Cdriver.findElement(By.id("menuform:m_radio")).click();
		Thread.sleep(1000);
		Cdriver.findElement(By.xpath("//label[@for='j_idt87:console1:0']")).click();
		Thread.sleep(3000);
		
		Cdriver.findElement(By.id("menuform:j_idt38")).click();
		Cdriver.findElement(By.id("menuform:m_dropdown")).click();
		Thread.sleep(1000);
		WebElement dropdown = Cdriver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select dd=new Select(dropdown);
		dd.selectByIndex(2);
		Thread.sleep(1000);
		
		Cdriver.findElement(By.id("menuform:j_idt37")).click();
		Cdriver.findElement(By.id("menuform:m_drag")).click();
		Thread.sleep(1000);
		WebElement drag = Cdriver.findElement(By.id("form:conpnl"));
		Actions actions = new Actions(Cdriver);
		actions.dragAndDropBy(drag, 200, 0).perform();
		Thread.sleep(2000);
		WebElement drop = Cdriver.findElement(By.id("form:drag_content"));
		actions.dragAndDropBy(drop, -600, -150).perform();
		Thread.sleep(2000);
		
		String title=Cdriver.getTitle();
		System.out.println(title);
		String currenturlnew= Cdriver.getCurrentUrl();
		System.out.println(currenturlnew);
		
		List<WebElement> link=Cdriver.findElements(By.xpath("//*"));
		System.out.println("Size of web elements in current web page: "+link.size());
		Thread.sleep(2000);
		
		Cdriver.close();
		

	}

}
