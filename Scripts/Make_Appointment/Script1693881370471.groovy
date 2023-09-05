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

WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Object Repository/WebsiteHero/dropdown_facility'), 2)

WebUI.click(findTestObject('Object Repository/WebsiteHero/checkbox_apply'))

WebUI.click(findTestObject('Object Repository/WebsiteHero/radiobutton_Medicaid'))

WebUI.setText(findTestObject('Object Repository/WebsiteHero/date/input_date'), '27/12/2016')

//WebUI.click(findTestObject('Object Repository/WebsiteHero/date_icon'))

//WebUI.click(findTestObject('Object Repository/WebsiteHero/date/select_date'))

WebUI.setText(findTestObject('Object Repository/WebsiteHero/text_comment'), "Comment")

WebUI.click(findTestObject('Object Repository/WebsiteHero/button_bookappointment'))

WebUI.verifyTextPresent("Appointment Confirmation", false)


