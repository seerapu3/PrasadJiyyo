package jiyyoTests;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import accelerators.Base;
import businessFunctions.LABmodule;
public class LAB_Module extends Base {
	static ExtentTest logger;

 @Test
  public static void LABcreatebillexistingpatient() throws Exception {
  	logger = extent.createTest("Create Bill with existing patient");
	logger.log(Status.PASS, "Create Bill with existing patient");
  }
 
 @Test
 public static void LABdcreatebillnewpatient() throws Exception {
 	logger = extent.createTest("Create Bill with New patient");
	logger.log(Status.PASS, "Create Bill with New patient");
	
 }
}