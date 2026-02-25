package buildmaven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomclss extends basic {
	public  pomclss() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="DrpDwnMn01label")
	private WebElement mail;
	
	public WebElement getuser() {
		return mail;
	}
//	@FindBy(id="nav-search-submit-button")
//	private WebElement Submitt;
//	public WebElement Submit() {
//		return Submitt;
//	}
	@FindBy(xpath ="(//a[@aria-label='OLD SMITH 90-001　≫'])")
	private WebElement Submitt;
	public WebElement submit() {
		return Submitt;
	}
	
	@FindBy(xpath = "(//a[@aria-label='OLD SMITH 90-002 / BRONZE　≫']")
	private WebElement second;
	public WebElement sencondd() {
		return second;
	}
	@FindBy(xpath = ("//span[text()='Applied Indices & Sword Hands']"))
	private WebElement selector;
	public WebElement selet() {
		return selector;
		
	}
}
