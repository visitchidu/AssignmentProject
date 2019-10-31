package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SPHomePage {

	public WebDriver driver;

	By searchTxt=By.xpath("//input[@title='Search']");
	//By securepayLnk=By.xpath("//div[contains(text(),'SecurePay online payment and eCommerce solutions for businesses')]");
	By securepayLnk=By.xpath("//h3[contains(text(),'SecurePay online payment and eCommerce solutions for ...')]");
	By supportLnk=By.xpath("//ul[@id='nav']//a[text()='Support']");
	By contactUsLnk=By.xpath("//ul[@class='sub-menu']/li/a[text()='Contact Us']");
	
	public SPHomePage(WebDriver driver) {		
		this.driver=driver;
	}

	public WebElement getSearchTxt()
	{
		return driver.findElement(searchTxt);
	}

	public WebElement getContactUsLnk()
	{
		return driver.findElement(contactUsLnk);
	}
	
	public WebElement getsupportLnk()
	{
		return driver.findElement(supportLnk);
	}
	
	public WebElement getSecurepayLnk()
	{
		return driver.findElement(securepayLnk);
	}	
	
	public void setValueSearchText(String txt)
	{
		getSearchTxt().sendKeys(txt);
	}
	public void pressEnterOnSearchText()
	{
		getSearchTxt().sendKeys(Keys.RETURN);
	}
	public void clickOnSecurepayLnkt()
	{
		getSecurepayLnk().click();
	}
	
}
