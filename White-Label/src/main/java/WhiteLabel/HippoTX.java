package WhiteLabel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HippoTX {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:/Users/rmandhare/Desktop/Selenium/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("http://hippo.insurance.test.quinstreet.net/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		
		//Enter the zip
		driver.findElement(By.id("nzipcode")).sendKeys("75002");
		
		driver.findElement(By.xpath("//button[contains(text(),'Start Quote')]")).click();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		
		//firstname
		driver.findElement(By.id("QTE_FirstName")).sendKeys("xxtestxx");
		
		//lastname
		driver.findElement(By.id("QTE_LastName")).sendKeys("xxtestxx");
		
		//email
		driver.findElement(By.id("QTE_EmailAddress")).sendKeys("test@test.com");
		
		//phonenumber
		driver.findElement(By.id("QTE_CurrentPhoneNumber")).sendKeys("4547458547");
		
		//Residential address
		driver.findElement(By.id("QTE_ResidentialStreetAddress")).sendKeys("103 street, Allen TX USA");
		
		
		//check box
		driver.findElement(By.id("QTE_FCRAConsent")).click();
		
		
		//continue button
		driver.findElement(By.xpath("//button[@class='btn btn-secondary btn continue-button']")).click();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		//vin - element not interactable exception
		//driver.findElement(By.xpath("//div[@class='formblock-input-text position-relative']//label[@for='QTE_VEH_0_Vin']")).sendKeys("WBA2J3C52JVA49980");
		
		
		
	
		
		
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		//car year
		driver.findElement(By.xpath("//div[@id='typeahead_QTE_VEH_0_Year']//div[@class='vs__dropdown-toggle']")).click();
		
    driver.findElement(By.xpath(".//span[@class='vs__selected'][contains(text(),'2020')]")).click();

   /*    List<WebElement> dd_menu = driver.findElements(By.xpath("//div[@id='typeahead_QTE_VEH_0_Year']//div[@class='vs__dropdown-toggle'/li]"));
		
		for(int i=0; i<dd_menu.size();i++)
		{
			WebElement element = dd_menu.get(i);
			
			String innerhtml = element.getAttribute("innerHTML");
			
			//System.out.println(innerhtml);
			
			if(innerhtml.contentEquals("2018"))
			{
				element.click();
				break;
			}
		}
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
*/		
		
		
		

	}

}
