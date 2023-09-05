package websiteHero

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

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

import internal.GlobalVariable

public class Hero {

	@Keyword
	def loginHero(url,username,password){
		WebUI.openBrowser(url)
		WebUI.click(findTestObject('Object Repository/WebsiteHero/Make_Appointment'))
		WebUI.setText(findTestObject('Object Repository/WebsiteHero/username'), username)
		WebUI.setEncryptedText(findTestObject('Object Repository/WebsiteHero/password'), password)
		WebUI.click(findTestObject('Object Repository/WebsiteHero/Button_Login'))
		WebUI.verifyTextPresent("Make Appointment", false)
	}
}
