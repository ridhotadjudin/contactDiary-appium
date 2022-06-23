package com.nexsoft.calendar;
import static org.testng.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.nexsoft.calendar.pom.NewContact;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class AppiumContactDiary {
	protected AndroidDriver driver;
	
	@Test
	public void init () throws MalformedURLException {

		
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("appActivity", "com.apozas.contactdiary.MainActivity");
			capabilities.setCapability("appPackage", "com.apozas.contactdiary");
			capabilities.setCapability("deviceName", "emulator-5554");
			capabilities.setCapability("platformVersion", "9.0");
			
			
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		  
		/*	driver.findElement(By.id("com.apozas.contactdiary:id/fab")).click();
			//driver.findElement(By.id("com.apozas.contactdiary:id/fab")).;
			
			TouchAction touchNewEvent = new TouchAction(driver);
			touchNewEvent.tap(PointOption.point(954, 1237)).perform();
			
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			

			
			driver.findElement(By.id("com.apozas.contactdiary:id/eventdate_input")).click();
			
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			
			String  date =  driver.findElement(By.id("android:id/date_picker_header_date")).getText();
			String  year =  driver.findElement(By.id("android:id/date_picker_header_year")).getText();
			
			Date date1 = null;
			try {
				date1 = new SimpleDateFormat("EEE, MMM d yyyy").parse(date+" "+year);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  


			Date dateUsers = null;
			try {
				dateUsers = new SimpleDateFormat("dd MM yyyy").parse("02 06 2021");
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			

			int currentYear = date1.getYear();
			int currentMonth = date1.getMonth();
		
			
			int targetYear = dateUsers.getYear();
			int targetMonth = dateUsers.getMonth();
			

			int stepYear = Math.abs(((currentYear-targetYear)*12));
			int stepMonth = Math.abs(((currentMonth-targetMonth)));
			
			int step = stepYear+stepMonth;
			
			

			if (currentYear < targetYear) {

				for (int z = 0; z < step; z++) {
					driver.findElement(By.id("android:id/next")).click();
				}

			} else if (currentYear > targetYear) {
				for (int y = 0; y < step; y++) {
					driver.findElement(By.id("android:id/prev")).click();
				}
			}
			
			DateFormat dateFormat = new SimpleDateFormat("dd MMMM yyy");  
			
			
			
			
			driver.findElement(By.xpath("//android.view.View[@content-desc=\""+dateFormat.format(dateUsers)+"\"]")).click();
		   
			driver.findElement(By.id("android:id/button1")).click();
			
			

			Dimension dimension = driver.manage().window().getSize();
			
			Dimension frame = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout")).getSize();
			
			System.out.println("Tinggi layar hape = " + dimension.height);
			System.out.println("Lebar layar hape = " + dimension.width);
			
			System.out.println("Tinggi layar hape = " + frame.height);
			System.out.println("Lebar layar hape = " + frame.width);
			
			System.out.println("Estimasi titik atas = " +(dimension.height-frame.height)/2);
			System.out.println("Estimasi titik samping = " +(dimension.width-frame.width)/2);
			
			
			
			TouchAction dateSwipe = new TouchAction(driver);
			dateSwipe.press(PointOption.point(777, 1327)).
			waitAction(WaitOptions.waitOptions(Duration.ofMillis(250))).
			moveTo(PointOption.point(898,334)).release().perform();
			*/
			driver.findElement(By.id("com.apozas.contactdiary:id/fab")).click();
			//driver.findElement(By.id("com.apozas.contactdiary:id/fab")).;
			
			TouchAction touchNewEvent = new TouchAction(driver);
			touchNewEvent.tap(PointOption.point(957, 1763)).perform();
			
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			
			NewContact contact = new NewContact(driver);
			contact.setTxtDate("02072022");
			
			List<String> choice = new ArrayList<String>();
			choice.add("1");
			choice.add("2");
			contact.setMitigation(choice);
			
			
			contact.setTxtEndDate("05072022");
			
			
			contact.setTxtTime("08", "20", "am");
			
			contact.setTxtEndTime("10", "30", "pm");
			
			contact.txtName.sendKeys("Dewabrata");
			contact.txtPlace.sendKeys("Khayangan");
			contact.cYes.click();
			contact.cOutdoor.click();
			contact.txtNote.sendKeys("Ini Testing");
			contact.save();
			
			//driver.find_element_by_xpath("//android.view.View[@resource-id='rptRole__ctl0_rptCommunicationlt...']")

			List<WebElement> lstElement =driver.findElements(By.xpath("//android.widget.TextView[@resource-id='com.apozas.contactdiary:id/list_item']"));
			
			String unknownChar ="👤   ";
			boolean checkData = false;
			for (WebElement webElement : lstElement) {
				String nama = webElement.getText().replace(unknownChar,"");
				if (nama.equalsIgnoreCase("Dewabrata")) {
					checkData = true;
					break;
				}
			}
			assertTrue(checkData);
		}
	

}
