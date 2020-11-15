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

WebUI.navigateToUrl('https://www.facebook.com/')

WebUI.waitForPageLoad(5, FailureHandling.STOP_ON_FAILURE)
println WebUI.getWindowTitle()
String titleWindow = WebUI.getWindowTitle()
String tittle = "Facebook – log in or sign up"
//String tittle = "Facebook"
WebUI.verifyMatch(titleWindow,tittle, true)


WebUI.click(findTestObject('Object Repository/dd_fb/Page_Facebook  log in or sign up/a_Create New Account'))

for (def rownum = 1; rownum <= findTestData('fb_reg_data').getRowNumbers(); rownum++ ) 
{
    //WebUI.setText(findTestObject('dd_fb/Page_Facebook  log in or sign up/input_concat(We couldn, , t create your acc_8e27d1'), fname)
    WebUI.setText(findTestObject('dd_fb/Page_Facebook  log in or sign up/input_concat(We couldn, , t create your acc_8e27d1'), 
        findTestData('fb_reg_data').getValue(1, rownum))

    //WebUI.setText(findTestObject('Object Repository/dd_fb/Page_Facebook  log in or sign up/input_concat(We couldn, , t create your acc_342d17'), sname)
    WebUI.setText(findTestObject('Object Repository/dd_fb/Page_Facebook  log in or sign up/input_concat(We couldn, , t create your acc_342d17'), 
        findTestData('fb_reg_data').getValue(2, rownum))

    //WebUI.setText(findTestObject('Object Repository/dd_fb/Page_Facebook  log in or sign up/input_concat(We couldn, , t create your acc_554ec3'), phonenumber)
    WebUI.setText(findTestObject('Object Repository/dd_fb/Page_Facebook  log in or sign up/input_concat(We couldn, , t create your acc_554ec3'), 
        findTestData('fb_reg_data').getValue(3, rownum))

    //WebUI.setEncryptedText(findTestObject('Object Repository/dd_fb/Page_Facebook  log in or sign up/input_concat(We couldn, , t create your acc_7f0a99'),     'ZovMJh5T2MY=')
    WebUI.setEncryptedText(findTestObject('Object Repository/dd_fb/Page_Facebook  log in or sign up/input_concat(We couldn, , t create your acc_7f0a99'), 
        'ZovMJh5T2MY=')

    //WebUI.selectOptionByValue(findTestObject('Object Repository/dd_fb/Page_Facebook  log in or sign up/select_Day123456789101112131415161718192021_40ab5b'),    day, true)
    WebUI.selectOptionByValue(findTestObject('Object Repository/dd_fb/Page_Facebook  log in or sign up/select_Day123456789101112131415161718192021_40ab5b'), 
        findTestData('fb_reg_data').getValue(4, rownum), true)

    //WebUI.selectOptionByValue(findTestObject('Object Repository/dd_fb/Page_Facebook  log in or sign up/select_MonthJanFebMarAprMayJunJulAugSepOctNovDec'),     month, true)
    WebUI.selectOptionByValue(findTestObject('Object Repository/dd_fb/Page_Facebook  log in or sign up/select_MonthJanFebMarAprMayJunJulAugSepOctNovDec'), 
        findTestData('fb_reg_data').getValue(5, rownum), true)

    //WebUI.selectOptionByValue(findTestObject('Object Repository/dd_fb/Page_Facebook  log in or sign up/select_Year20202019201820172016201520142013_c76834'),     year, true)
    WebUI.selectOptionByValue(findTestObject('Object Repository/dd_fb/Page_Facebook  log in or sign up/select_Year20202019201820172016201520142013_c76834'), 
        findTestData('fb_reg_data').getValue(6, rownum), true)


WebUI.click(findTestObject('Object Repository/dd_fb/Page_Facebook  log in or sign up/input_Male_sex'))

WebUI.click(findTestObject('Object Repository/dd_fb/Page_Facebook  log in or sign up/button_Sign Up'))
}



