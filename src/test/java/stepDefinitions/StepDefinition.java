package stepDefinitions;

import java.util.Locale;
import junit.framework.Assert;
import org.openqa.selenium.interactions.Actions;
import pageObjects.ContactUsPage;
import pageObjects.SPHomePage;
import resources.Base;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends Base {//extending the base class as driver declaration and initialization is done there
	FakeValuesService fakeValuesService = new FakeValuesService(
	new Locale("en-GB"), new RandomService());
	
	@Given("^Initialize the browser with Firefox$")
	public void initialize_the_browser_with_Firefox() throws Throwable {
		 driver =initializeDriver();
	}

	@And("^Navigate to \"([^\"]*)\" Site$")
	public void navigate_to_Site(String url) throws Throwable {
		driver.get(url);
	}

	@And("^Search for \"([^\"]*)\" and navigate to the same$")
	public void search_for_securepay_navigate_to_Site(String arg1) throws Throwable {
		 SPHomePage sphp = new SPHomePage(driver);
		 sphp.setValueSearchText(arg1);
		 sphp.pressEnterOnSearchText();
		 driver.manage().window().maximize();
		 sphp.clickOnSecurepayLnkt();    
	}
	
	@When("^Navigate to ContactUs Page$")
	public void navigate_to_ContactUs_Page() throws Throwable {
		Actions actions = new Actions(driver); 
		SPHomePage sphp = new SPHomePage(driver);
		actions.moveToElement(sphp.getsupportLnk()).perform();
		sphp.getContactUsLnk().click();  
		
		ContactUsPage cup = new ContactUsPage(driver);
		Assert.assertTrue(cup.getContactUsHdr().isDisplayed());
	}
	
	@And("^Populate all the fields in contact us page$")
	public void Populate_all_the_fields_in_contact_us_page() throws Throwable {
		 String firstName = fakeValuesService.letterify("??????????");
		 String lastName = fakeValuesService.letterify("??????????");
		 String email = fakeValuesService.bothify("????##@gmail.com");
		 String phoneNumber = fakeValuesService.numerify("+61#######");
		 String url = fakeValuesService.letterify("https://www.?????????.com");
		 String companyName = fakeValuesService.letterify("??????????");	
		 String message = fakeValuesService.letterify("??????????");
		 
		ContactUsPage cup = new ContactUsPage(driver);
		cup.setValueFirstName(firstName);
		cup.setValueLastName(lastName);
		cup.setValuePhoneTxt(phoneNumber);
		cup.setValueEmailTxt(email);
		cup.setValueWebsiteURLTxt(url);
		cup.setValueCompanyNameTxt(companyName);
		cup.SelectReasonForEnquiry(1);
		cup.setValueMessageTxtArea(message);
		}

	 @Then("^close browsers$")
	    public void close_browsers() throws Throwable {
	        driver.quit();
	    }
}
