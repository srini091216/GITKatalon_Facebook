package com.test.demo

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.awt.Robot
import java.awt.Toolkit
import java.awt.image.BufferedImage

import javax.imageio.ImageIO

import org.openqa.selenium.TakesScreenshot
import org.openqa.selenium.WebDriver
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.lowagie.text.Rectangle

import internal.GlobalVariable

public class customfunctionalities {

	@Keyword
	def printQAName() {
		println("\n       This is Srinivas Gangadhari.......!!!!\n")
	}

	@Keyword
	def takescreenshot(){
		Rectangle scrshot = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize())
		BufferedImage capture = new Robot().createScreenCapture(Screenrect)
		ImageIO.write(capture, "bmp" , new File(args[0]))
	}

	@Keyword
	def screenshot(){
		WebDriver driver = DriverFactory.getWebDriver()
		byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshot, "image/png");
		scenario.write(scenario.getName());
	}
}
