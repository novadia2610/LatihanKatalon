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

WebUI.openBrowser('https://demoqa.com/automation-practice-form')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/FormDemoQA/firstname'), 'Adinda')

WebUI.setText(findTestObject('Object Repository/FormDemoQA/lastname'), 'Dheanita')

WebUI.setText(findTestObject('Object Repository/FormDemoQA/email'), "adinda@gmail.com")

WebUI.click(findTestObject('Object Repository/FormDemoQA/div_Female'))

WebUI.setText(findTestObject('Object Repository/FormDemoQA/mobilenumber'), '081389424305')

WebUI.click(findTestObject('Object Repository/FormDemoQA/date/dateInput'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FormDemoQA/date/monthSelect'), '4', false)

WebUI.selectOptionByValue(findTestObject('Object Repository/FormDemoQA/date/yearSelect'), '2022', false)

WebUI.click(findTestObject('Object Repository/FormDemoQA/date/date'))

//WebUI.setText(findTestObject('Object Repository/FormDemoQA/subject'), "Adinda Cinta Nova")

WebUI.click(findTestObject('Object Repository/FormDemoQA/div_Sports'))

WebUI.uploadFile(findTestObject('Object Repository/FormDemoQA/choosefile'), 'C:\\Users\\Nova\\Pictures\\Screenshots\\bukti.png')

WebUI.setText(findTestObject('Object Repository/FormDemoQA/address'), "Cibinong deket CCM")

WebUI.setText(findTestObject('Object Repository/FormDemoQA/state'), "NCR")

WebUI.setText(findTestObject('Object Repository/FormDemoQA/city'), "Delhi")

WebUI.click(findTestObject('Object Repository/FormDemoQA/buttonSubmit'))

