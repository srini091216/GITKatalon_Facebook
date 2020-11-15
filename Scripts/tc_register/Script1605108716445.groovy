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

WebUI.navigateToUrl('https://www.facebook.com')

WebUI.click(findTestObject('Object Repository/Page_Facebook  log in or sign up/a_Create New Account'))

WebUI.setText(findTestObject('Object Repository/Page_Facebook  log in or sign up/input_concat(We couldn, , t create your acc_8e27d1'), 
    'srini')

WebUI.setText(findTestObject('Object Repository/Page_Facebook  log in or sign up/input_concat(We couldn, , t create your acc_342d17'), 
    'vas')

WebUI.setText(findTestObject('Page_Facebook  log in or sign up/input_concat(We couldn, , t create your acc_7f0a99'), '99999999999')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Facebook  log in or sign up/input_concat(We couldn, , t create your acc_7f0a99'), 
    'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.selectOptionByValue(findTestObject('Page_Facebook  log in or sign up/select_Day123456789101112131415161718192021_40ab5b'), 
    '12', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Facebook  log in or sign up/select_MonthJanFebMarAprMayJunJulAugSepOctNovDec'), 
    '8', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Facebook  log in or sign up/select_Year20202019201820172016201520142013_c76834'), 
    '1991', true)

WebUI.click(findTestObject('Object Repository/Page_Facebook  log in or sign up/label_Male'))

WebUI.click(findTestObject('Object Repository/Page_Facebook  log in or sign up/button_Sign Up'))

WebUI.closeBrowser()

