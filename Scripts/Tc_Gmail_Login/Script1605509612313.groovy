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

WebUI.navigateToUrl('https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin')

WebUI.setText(findTestObject('Object Repository/gmail_login_obj/Page_Gmail/input_Continue to Gmail_identifier'), 'mytest.091216')

WebUI.click(findTestObject('Object Repository/gmail_login_obj/Page_Gmail/div_Next_VfPpkd-RLmnJb'))

WebUI.setEncryptedText(findTestObject('Object Repository/gmail_login_obj/Page_Gmail/input_Too many failed attempts_password'), 
    'fu92NKJvr/bzyNf/ynnEGg==')

WebUI.click(findTestObject('Object Repository/gmail_login_obj/Page_Gmail/div_Next_VfPpkd-RLmnJb_1'))

WebUI.click(findTestObject('Object Repository/gmail_login_obj/Page_Inbox (1) - mytest.091216gmail.com - Gmail/a_Drafts'))

WebUI.click(findTestObject('Object Repository/gmail_login_obj/Page_Drafts - mytest.091216gmail.com - Gmail/img_Send feedback_gb_Ia gbii'))

WebUI.click(findTestObject('Object Repository/gmail_login_obj/Page_Drafts - mytest.091216gmail.com - Gmail/a_Sign out'))

WebUI.closeBrowser()

