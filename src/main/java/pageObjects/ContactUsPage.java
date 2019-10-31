package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage {

	public WebDriver driver;
	
	By contactUsHdr=By.xpath("//h1[text()='Contact us']");
	By firstNameTxt=By.xpath("//input[@name='first-name']");
	By lastNameTxt=By.xpath("//input[@name='last-name']");
	By emailTxt=By.xpath("//input[@name='email-address']");
	By phoneTxt=By.xpath("//input[@name='phone-number']");
	By websiteURLTxt=By.xpath("//input[@name='website-url']");
	By companyNameTxt=By.xpath("//input[@name='business-name']");
	By reasonForEnquiryLst=By.xpath("//select[@name='reason-for-enquiry']");
	By messageTxtArea=By.xpath("//textarea[@name='message']");
	
	//followng are the methods to get the webelements
	public ContactUsPage(WebDriver driver) {
		this.driver=driver;	
	}
	
	public WebElement getContactUsHdr()
	{
		return driver.findElement(contactUsHdr);
	}
	
	public WebElement getFirstNameTxt()
	{
		return driver.findElement(firstNameTxt);
	}
	
	public WebElement getLastNameTxt()
	{
		return driver.findElement(lastNameTxt);
	}
	
	public WebElement getEmailTxt()
	{
		return driver.findElement(emailTxt);
	}
	
	public WebElement getPhoneTxt()
	{
		return driver.findElement(phoneTxt);
	}
	
	public WebElement getWebsiteURLTxt()
	{
		return driver.findElement(websiteURLTxt);
	}
	
	public WebElement getCompanyNameTxt()
	{
		return driver.findElement(companyNameTxt);
	}
	
	public WebElement getReasonForEnquiryLst()
	{
		return driver.findElement(reasonForEnquiryLst);
	}	
	public WebElement getMessageTxtArea()
	{
		return driver.findElement(messageTxtArea);
	}
	
	//followng are the methods to operate on the webelements
	public void setValueFirstName(String fName)
	{
		getFirstNameTxt().sendKeys(fName);
	}
	public void setValueLastName(String lName)
	{
		getLastNameTxt().sendKeys(lName);
	}
	public void setValueEmailTxt(String email)
	{
		getEmailTxt().sendKeys(email);
	}
	public void setValuePhoneTxt(String phoneNumber)
	{
		getPhoneTxt().sendKeys(phoneNumber);
	}
	public void setValueWebsiteURLTxt(String sebsite)
	{
		getWebsiteURLTxt().sendKeys(sebsite);
	}
	public void setValueCompanyNameTxt(String companyName)
	{
		getCompanyNameTxt().sendKeys(companyName);
	}
	public void SelectReasonForEnquiry(int index)
	{
		Select sel = new Select(getReasonForEnquiryLst());
		sel.selectByIndex(index); 
	}
	public void setValueMessageTxtArea(String message)
	{
		getMessageTxtArea().sendKeys(message);
	}
	
}
