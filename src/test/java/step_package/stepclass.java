package step_package;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class stepclass {
	WebDriver driver;
	@Given("^Open ebay application$")
	public void open_ebay_application() throws Throwable {
		System.setProperty("webDriver.chrome.driver", "\"C:\\chormeDriver\\chrome-win64\\chrome.exe\"");
		 ChromeOptions naz= new ChromeOptions();
		 naz.addArguments("--remote-allow-origins=*");
		 
		 driver= new ChromeDriver();

		 driver.get("https://docs.oracle.com/javase/7/docs/api/");
		 //driver.get("https://www.ebay.com/");
		 driver.manage().window().maximize();
		 //Thread.sleep(2000);
		 
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}

	@Then("^Select Health & Beauty from dropdown$")
	public void select_Health_Beauty_from_dropdown() throws Throwable {
	                                //For 'Dropdown & select'we can use 3 method but in this 3 we can use only selectbyVisiable
		                                 //Text and selectbyValue
		Select drpdn = new Select(driver.findElement(By.id("gh-cat")));
		drpdn.selectByVisibleText("Health & Beauty");
		//drpdn.selectByValue("26395");
		//drpdn.selectByIndex(19);
	}

	@Then("^Click search button$")
	public void click_search_button() throws Throwable {
	   
		WebElement srch = driver.findElement(By.id("gh-btn"));
		srch.click();
		Thread.sleep(3000);
		driver.close();
	}
   
	@Then("^mouse over Motors page$")
	public void mouse_over_Motors_page() throws Throwable {
		
		Actions ac= new Actions(driver);
		ac.moveToElement(driver.findElement(By.cssSelector("#vl-flyout-nav > ul > li:nth-child(3) > a"))).build().perform();
	    Thread.sleep(3000);
	}

	@Then("^Click Classics$")
	public void click_Classics() throws Throwable {
		
		WebElement MT= driver.findElement(By.xpath("//a[text()='Classics']"));
		
		MT.click();
		Thread.sleep(2000);
		driver.close();
	    
	}
	
	@Then("^Print count of links available$")
	public void print_count_of_links_available() throws Throwable {
	    
		List<WebElement> alllinks= driver.findElements(By.tagName("a"));
		System.out.println("Total links in this page are "+ alllinks.size());
		for(int i=0; i<alllinks.size(); i ++) {
			System.out.println(alllinks.get(i).getAttribute("href"));
			
		}
	      driver.close();	
	}

	@Then("^Click on Jordan (\\d+) Retro Field Purple$")
	public void click_on_Jordan_Retro_Field_Purple(int arg1) throws Throwable {
		//for doing Scrolldown the page
	   ((JavascriptExecutor)driver).executeScript("scroll(0,500)");
	   Thread.sleep(2000);
	   WebElement scrll = driver.findElement(By.xpath("/html/body/div[6]/div[5]/ul/li[7]/a/h3"));
	   scrll.click();
	   Thread.sleep(3000);
	   driver.close();
		
	}

	
		 
		 
	
	@Then("^Click Help$")
	public void click_Help() throws Throwable {
		driver.switchTo().frame("classFrame");
		WebElement frme = driver.findElement(By.xpath("/html/body/div[1]/ul/li[8]/a"));
		frme.click();
		 Thread.sleep(3000);
		driver.close();
	   
	}

   
	

	

	}





	
	  
   
	
	
   

