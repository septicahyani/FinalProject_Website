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

WebUI.navigateToUrl('https://banksystem-demoshop.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/order and transaction/Page_DemoShop/a_Login'))

WebUI.setText(findTestObject('Object Repository/order and transaction/Page_DemoShop/input_Email_Input.Email'), 'septi.cahyani@mailsac.com')

WebUI.setEncryptedText(findTestObject('Object Repository/order and transaction/Page_DemoShop/input_Password_Input.Password'), 
    'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Object Repository/order and transaction/Page_DemoShop/button_Log in'))

WebUI.click(findTestObject('Object Repository/order and transaction/Page_DemoShop/button_Buy now'))

WebUI.click(findTestObject('Object Repository/order and transaction/Page_DemoShop/button_Direct payment'))

WebUI.click(findTestObject('Object Repository/order and transaction/Page_Payment Gateway/div_Netherlands                        CBA'))

WebUI.setText(findTestObject('Object Repository/order and transaction/Page_Log in - BankSystem/input_Email_Input.Email'), 
    'bristore.testing@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/order and transaction/Page_Log in - BankSystem/input_Password_Input.Password'), 
    'Nf2w5RrXq2x/ul16lISlXA==')

WebUI.click(findTestObject('Object Repository/order and transaction/Page_Log in - BankSystem/button_Log in'))

WebUI.click(findTestObject('Object Repository/order and transaction/Page_Confirm payment - BankSystem/span_'))

WebUI.click(findTestObject('Object Repository/order and transaction/Page_Confirm payment - BankSystem/button_Pay 8.00'))

WebUI.click(findTestObject('Object Repository/order and transaction/Page_DemoShop/button_Logout'))

