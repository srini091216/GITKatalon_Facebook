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

WebUI.navigateToUrl(GlobalVariable.rawurl)

WebUI.click(findTestObject('Object Repository/for_envirment_fb_reg/Page_Facebook  log in or sign up/a_Create New Account'))

WebUI.setText(findTestObject('Object Repository/for_envirment_fb_reg/Page_Facebook  log in or sign up/input_concat(We couldn, , t create your acc_8e27d1'), 
    GlobalVariable.fname)

WebUI.setText(findTestObject('Object Repository/for_envirment_fb_reg/Page_Facebook  log in or sign up/input_concat(We couldn, , t create your acc_342d17'), 
    GlobalVariable.sname)

WebUI.setText(findTestObject('Object Repository/for_envirment_fb_reg/Page_Facebook  log in or sign up/input_concat(We couldn, , t create your acc_554ec3'), 
    GlobalVariable.phonenumber)

WebUI.setEncryptedText(findTestObject('Object Repository/for_envirment_fb_reg/Page_Facebook  log in or sign up/input_concat(We couldn, , t create your acc_7f0a99'), 
    'fu92NKJvr/bzyNf/ynnEGg==')

WebUI.selectOptionByValue(findTestObject('Object Repository/for_envirment_fb_reg/Page_Facebook  log in or sign up/select_Day123456789101112131415161718192021_40ab5b'), 
    GlobalVariable.day, true)

WebUI.selectOptionByValue(findTestObject('Object Repository/for_envirment_fb_reg/Page_Facebook  log in or sign up/select_MonthJanFebMarAprMayJunJulAugSepOctNovDec'), 
    GlobalVariable.month, true)

WebUI.selectOptionByValue(findTestObject('Object Repository/for_envirment_fb_reg/Page_Facebook  log in or sign up/select_Year20202019201820172016201520142013_c76834'), 
    GlobalVariable.year, true)

WebUI.click(findTestObject('Object Repository/for_envirment_fb_reg/Page_Facebook  log in or sign up/input_Male_sex'))

WebUI.click(findTestObject('Object Repository/for_envirment_fb_reg/Page_Facebook  log in or sign up/button_Sign Up'))

WebUI.closeBrowser()

