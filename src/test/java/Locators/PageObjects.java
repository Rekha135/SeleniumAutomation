package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PageObjects {

	public By acceptCookies = By.xpath("//button[normalize-space()='Allow all cookies']");
	public By servicesTab = By.xpath("(//span[contains(text(),'Services')])[1]");
	public By selectedService = By.xpath("(//ul[contains(@class,'level1')])[3]");
	public By automation = By.xpath("//a[contains(@class,'subMenuLink')][normalize-space()='Automation']");
	public By selectedAutomation = By.xpath("(//li[contains(@class,'current expanded')])[1]");
	public By contactUsTitle = By.className("Form__Title");
	public By firstNameField = By.id("4ff2ed4d-4861-4914-86eb-87dfa65876d8");
	public By lastNameField = By.id("11ce8b49-5298-491a-aebe-d0900d6f49a7");
	public By emailIDField = By.id("056d8435-4d06-44f3-896a-d7b0bf4d37b2");
	public By phoneNumField = By.id("755aa064-7be2-432b-b8a2-805b5f4f9384");
	public By companyName = By.id("703dedb1-a413-4e71-9785-586d609def60");
	public By messageBox = By.id("88459d00-b812-459a-99e4-5dc6eff2aa19");
	public By countryDropDown = By.id("e74d82fb-949d-40e5-8fd2-4a876319c45a");
	public By iAgreeCheckBox = By.xpath("(//label[normalize-space()='I agree'])[1]");
	public By iAmNotRobotCheckBox = By.cssSelector(".g-recaptcha");
	public By submitCTA = By.id("b35711ee-b569-48b4-8ec4-6476dbf61ef8");
	public By worldWideDropDown = By.xpath("//span[@aria-label='Worldwide']");
	public By countryList = By.xpath("//div[@id='country-list-id']//ul");
}
