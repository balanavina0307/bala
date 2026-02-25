package buildmaven;
import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.KeyEventDispatcher;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basic {
	static Actions a;
	static Robot r;
	static WebDriver driver;
	public static void browser(String brio) {
		if(brio.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(brio.equalsIgnoreCase("edge")) {
				WebDriverManager.chromedriver().setup();
				driver = new EdgeDriver();
	}
	}
	public static void mmmmm() {
		
	}
		public static void url(String url) {
			driver.get(url);
		}	
		public static void waitt(int i) throws InterruptedException {
			Thread.sleep(i);
		}
		public static void maximize() {
			driver.manage().window().maximize();
		}
		  public static void contini() {
			  driver.findElement(By.xpath("//input[@type='button']")).click();
		  }
		  
		  public static void accepp() {
			  driver.findElement(By.xpath("//button[@class='A9d5ZY ']")).click();
		  }
		  public static void atem() {
			  driver.findElement(By.xpath("//p[text()='ALL ITEMS']")).click();
		  }
//		  public static void allitems() {
//			  a= new Actions(driver);
//			  
//			  WebElement alitems = driver.findElement(By.xpath("//p[text()='ALL ITEMS']"));
//			  a.moveToElement(alitems).click().perform();
//		  }
		  public static void sortby() {
		  
			  WebElement srt = driver.findElement(By.id("label-for-id_-8"));
			  a.moveToElement(srt).click().perform();
			  
//			  Select sl = new Select(srt);
		  }
		  public static void price() {
			  WebElement Nwest = driver.findElement(By.xpath("//span[text()='Newest']"));
			  
			  a.moveToElement(Nwest).click().perform();
			  
		  }
		  
//		  public static void  lowtohigh() {
//			 WebElement low = driver.findElement(By.xpath("//span[text()='Price (low to high)']"));
//			 a.moveToElement(low).click().perform();
//			 
//		  }
//		public static void mousecl() {
//			a= new Actions(driver);
//			
//			 WebElement srt = driver.findElement(By.id("label-for-id_-8"));
//			a.moveToElement(srt).perform();
//			driver.findElement(By.xpath("//span[text()='Price (low to high)']")).click();
//			driver.navigate();
//			
//		}
		public static File screenshot(String name) throws IOException {
		TakesScreenshot tk = (TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Anudip\\Desktop\\buildmaven\\src\\test\\" +name+ ".png");
		FileUtils.copyFile(src, dest);	
		return dest;
		}
	
}

















//public static void insert() throws AWTException {
//	r = new Robot();
//	r.keyPress(KeyEvent.VK_DOWN);
//	r.keyPress(KeyEvent.VK_DOWN);
//	r.keyRelease(KeyEvent.VK_DOWN);
//	r.keyRelease(KeyEvent.VK_DOWN);
//	driver.findElement(By.xpath("//span[text()='Price (low to high)']")).click();
//
//}
