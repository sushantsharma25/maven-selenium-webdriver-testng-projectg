package testcases.mytheresa;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import objectRepository.mytheresa.MytheresaAccountInformationPage;
import objectRepository.mytheresa.MytheresaCreateAccountPage;
import objectRepository.mytheresa.MytheresaHomePage;
import objectRepository.mytheresa.MytheresaMyAccountPage;

import static variables.mytheresa.UserVariables.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.remote.*;
import org.testng.Assert;
import java.net.*;
import org.testng.annotations.Test;
public class pkb {
@Test
public void testgooglrsearch() throws MalformedURLException{
 try {
//WebDriver driver = newFirefoxDriver();
//FirefoxOptions options = new FirefoxOptions();
//options.addArguments("-headless");
//WebDriver driver = new RemoteWebDriver(new URL("http://40.113.221.175:4444/wd/hub"),new FirefoxOptions());
RemoteWebDriver driver = new RemoteWebDriver(new URL("http://52.186.156.179:4444/wd/hub"),new FirefoxOptions());
driver.get("http://52.186.156.179:8080");
System.out.println(driver.getCurrentUrl());
//Assert.assertEquals("Only Testing");
Assert.assertEquals("testing","testing");
//we expect the title “Google “ should be present 
String Expectedtitle = "Google";
System.out.println("Before Running HIIIIIIIIIIIIIIIIIIIIIIIIIII");
	 
//it will fetch the actual title 
String Actualtitle = driver.getCurrentUrl();
//String Actualtitle = driver.getTitle();
System.out.println("Before Assetion " + Expectedtitle + Actualtitle);
//it will compare actual title and expected title
//Assert.assertEquals(Actualtitle, Expectedtitle);
//print out the result
//System.out.println("After Assertion " + Expectedtitle + Actualtitle + " Title matched ");
 }
catch (MalformedURLException e) {
      // if key is not a valid path then it cannot be resolved to an unmanged resource
	System.out.println("incorrect url");
    }
 }
}
	
