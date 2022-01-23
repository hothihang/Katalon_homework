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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(url)

WebUI.setText(findTestObject('TC_11/Page_ng k nhp hc - HOCMAI/fullname'), fullname)

WebUI.setText(findTestObject('TC_11/Page_ng k nhp hc - HOCMAI/email'), email)

WebUI.setText(findTestObject('TC_11/Page_ng k nhp hc - HOCMAI/phone'), phone)

WebUI.setEncryptedText(findTestObject('TC_11/Page_ng k nhp hc - HOCMAI/password'), 'GjdOfBMatdLZ8Bl0wj+pCw==')

WebUI.setEncryptedText(findTestObject('TC_11/Page_ng k nhp hc - HOCMAI/repasword'), 'GjdOfBMatdLZ8Bl0wj+pCw==')

WebUI.click(findTestObject('TC_11/Page_ng k nhp hc - HOCMAI/submit'))

