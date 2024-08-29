package SleniumHomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class SL11_Homework1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		 // FrameDemo at com.neotech.lesson07 using the CommonMethods.java
		// https://jqueryui.com/tooltip/

		setUp();

	
		driver.switchTo().frame(0);

		WebElement age = driver.findElement(By.id("age"));
		age.sendKeys("40");
		Thread.sleep(2000);

		driver.switchTo().defaultContent();

		WebElement frameEl = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));

		driver.switchTo().frame(frameEl);
		age.clear();
		Thread.sleep(2000);
		age.sendKeys("30");
		Thread.sleep(2000);

	
		driver.switchTo().defaultContent();

		tearDown();

	}

}
