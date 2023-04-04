package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTapsUpdate {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		Thread.sleep(2000);
		
		//Login to the page
		driver.findElement(By.id("username")).sendKeys("DemoCsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(2000);
		
		//Navigate to the links
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter the details 
		WebElement organisationName = driver.findElement(By.id("createLeadForm_companyName"));
		organisationName.sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Santhya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("G");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("santhyaoffical@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("7760513299");
		
		//click the button
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(1000);
		
		//Edit function
		driver.findElement(By.linkText("Edit")).click();
		WebElement updateOrgName = driver.findElement(By.id("updateLeadForm_companyName"));
		updateOrgName.clear();
		updateOrgName.sendKeys("Teatleaf1");
		driver.findElement(By.className("smallSubmit")).click();
		
		//close driver
		driver.close();

	}

}
