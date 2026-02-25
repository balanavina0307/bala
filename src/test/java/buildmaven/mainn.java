package buildmaven;

import java.awt.AWTException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit;

import org.apache.commons.compress.utils.TimeUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.module.Browser;

public class mainn extends basic {
		public static void main(String args[])throws InterruptedException, AWTException {
			
			browser("chrome");
			url("https://www.kuoe-en.com/");
			maximize();
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			waitt(20);
			contini();
			waitt(20);
			accepp();
			waitt(20);
			atem();
//			 allitems();
			sortby();
			price();
			
			
//			
//			sortby();
//			lowtohigh();
//			sortt();
//		
//			insert();
//		
			
			
			//id="DrpDwnMn01label"
		}		
}
