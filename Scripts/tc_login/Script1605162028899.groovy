import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.facebook.com')

WebUI.setText(findTestObject('Object Repository/Page_Facebook  log in or sign up/Page_Facebook  log in or sign up/input_Facebook helps you connect and share _954540'), 
    'srinigangadhari@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Facebook  log in or sign up/Page_Facebook  log in or sign up/input_Facebook helps you connect and share _2bef06'), 
    '5A9tsNo3ZzH9h9hONrsdGw==')

WebUI.click(findTestObject('Object Repository/Page_Facebook  log in or sign up/Page_Facebook  log in or sign up/button_Log In'))

WebUI.click(findTestObject('Object Repository/Page_Facebook  log in or sign up/Page_Log in to Facebook  Facebook/a_Forgotten password'))

WebUI.setText(findTestObject('Object Repository/Page_Facebook  log in or sign up/Page_Forgotten Password  Cant Log In  Facebook/input_Please enter your email address or ph_72d199'), 
    'nfgnfgnfgnfgnfn')

WebUI.click(findTestObject('Object Repository/Page_Facebook  log in or sign up/Page_Forgotten Password  Cant Log In  Facebook/label_Please enter your email address or ph_2d557c'))

WebUI.click(findTestObject('Object Repository/Page_Facebook  log in or sign up/Page_Forgotten Password  Cant Log In  Facebook/span_Cancel'))

