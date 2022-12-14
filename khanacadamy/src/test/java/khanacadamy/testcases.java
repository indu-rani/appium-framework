package khanacadamy;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.awt.event.KeyEvent;
import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import io.appium.java_client.touch.offset.PointOption;

public class testcases extends capabilities {
	AndroidDriver<AndroidElement> driver;
	
	@BeforeTest
	public void KillAllProcesses() throws IOException, InterruptedException {
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Thread.sleep(8000);
		
	}

					@Test(enabled=true)

					public void search() throws InterruptedException, IOException
					{
						service = startServer();
						AndroidDriver<AndroidElement> driver= hybrid_capabilities(appactivity, apppackage, deviceName, chromeexcutable);
						Thread.sleep(2000);;
						driver.findElement(MobileBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("indu");
						
						driver.hideKeyboard();
						
						driver.findElement(MobileBy.id("com.androidsample.generalstore:id/radioFemale")).click();
						
						Thread.sleep(5000);
						
						driver.findElement(MobileBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
								
						
						Thread.sleep(5000);
						driver.findElements(MobileBy.xpath("//*[@text='ADD TO CART']")).get(0).click();
						driver.findElements(MobileBy.xpath("//*[@text='ADD TO CART']")).get(0).click();
						
						driver.findElement(MobileBy.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
						Thread.sleep(5000);
						String price1=driver.findElements(MobileBy.id("com.androidsample.generalstore:id/productPrice")).get(0).getText();
						
						price1=price1.substring(1);
						
						Double cost1=Double.parseDouble(price1);
						System.out.println(cost1);
						
						String price2=driver.findElements(MobileBy.id("com.androidsample.generalstore:id/productPrice")).get(1).getText();
						price2=price2.substring(1);
						Double cost2=Double.parseDouble(price2);
						System.out.println(price2);
						Double Totalprice=cost1+cost2;
						System.out.println(Totalprice);
						
						
						
						String total=driver.findElement(MobileBy.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
						
						total=total.substring(1);
						
						double total1=Double.parseDouble(total);
						
						System.out.println(total1);
						
						if(Totalprice.equals(total1))
						{
							
							System.out.println("Price Matched");
						}
						else
						{
							
							System.out.print("Price not Matching");
						}
						
						
						Thread.sleep(5000);
						driver.findElement(MobileBy.className("android.widget.CheckBox")).click();
						driver.findElement(MobileBy.className("android.widget.Button")).click();
						
						Thread.sleep(8000);
						
						driver.findElement(MobileBy.id("com.androidsample.generalstore:id/webView"));
						Thread.sleep(5000);
						System.out.println(driver.getTitle());
						
						
					}
			@Test(enabled=false)
					
					public void positive1() throws InterruptedException
					{
				driver.findElement(MobileBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("indu");
				
				driver.hideKeyboard();
				
				driver.findElement(MobileBy.id("com.androidsample.generalstore:id/radioFemale")).click();
				
				Thread.sleep(5000);
				
				driver.findElement(MobileBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
				driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"PG 3\"))").click();
				Thread.sleep(5000);
				driver.findElements(MobileBy.xpath("//*[@text='ADD TO CART']")).get(1).click();
				Thread.sleep(5000);
				driver.findElement(MobileBy.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
				String total=driver.findElement(MobileBy.id("com.androidsample.generalstore:id/productPrice")).getText();
				
				total=total.substring(1);
				
				double total1=Double.parseDouble(total);
				
				System.out.println(total1);
				
				Thread.sleep(5000);
				driver.findElement(MobileBy.id("com.androidsample.generalstore:id/productName")).getText();
				driver.findElement(MobileBy.className("android.widget.CheckBox")).click();
				driver.findElement(MobileBy.id("com.androidsample.generalstore:id/btnProceed")).click();
				
					}
			@Test(enabled=true)

			public void positive2() throws InterruptedException
			{
			     driver.findElement(MobileBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("indu");

			    driver.hideKeyboard();

			     driver.findElement(MobileBy.id("com.androidsample.generalstore:id/radioFemale")).click();

			     Thread.sleep(5000);

			     driver.findElement(MobileBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
			     driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"PG 3\"))").getSize();
			     driver.findElements(MobileBy.xpath("//*[@text='ADD TO CART']")).get(1).click();
			 	Thread.sleep(5000);
			 	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Air Jordan 1 Mid SE\"))").getSize();
			    driver.findElements(MobileBy.xpath("//*[@text='ADD TO CART']")).get(1).click();
			    driver.findElement(MobileBy.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
			    TouchAction TA=new TouchAction(driver);
			    AndroidElement term=driver.findElementByAndroidUIAutomator("text(\"Please read our terms of conditions\")");
			    TA.longPress(longPressOptions().withElement(element(term)).withDuration(ofSeconds(5))).release().perform();
			    
			}
				}
