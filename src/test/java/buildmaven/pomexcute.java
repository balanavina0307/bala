package buildmaven;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.devtools.v143.page.model.Screenshot;

public class pomexcute extends basic {
	public static void main( String[]args) throws InterruptedException, IOException {
	browser("chrome");
	url("https://www.kuoe-en.com/");
	maximize();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	waitt(20);
	contini();
	waitt(20);
	accepp();
	pomclss h = new pomclss();
	h.getuser().click();
	
	h.submit().click();
//	h.selet().click();
	
	//Screenshot
	screenshot("Monika");
	
//	h.sencondd().click();
	
	
//	h.getsendkey().sendKeys("computers");
	
//	h.Submit().click();
	
	}
}
