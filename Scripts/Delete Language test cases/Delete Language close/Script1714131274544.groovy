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

WebUI.navigateToUrl('https://paulplato-trials712.orangehrmlive.com/')

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Login_txtUsername'), username2)

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Login_txtPassword'), password2)

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Employee Management/i_more_vert'))

WebUI.click(findTestObject('Object Repository/Page_Employee Management/a_oxd_menu_left Qualifications'))

WebUI.click(findTestObject('Object Repository/Page_Employee Management/i_more_vert'))

WebUI.click(findTestObject('Object Repository/Page_Employee Management/a_Languages'))

WebUI.click(findTestObject('Object Repository/Page_Qualifications/label'))

WebUI.click(findTestObject('Object Repository/Page_Qualifications/i_more_horiz'))

WebUI.click(findTestObject('Object Repository/Page_Qualifications/a_Delete Selected'))

WebUI.click(findTestObject('Object Repository/Page_Qualifications/div_Cancel_materialize-lean-overlay-1'))

WebUI.closeBrowser()

