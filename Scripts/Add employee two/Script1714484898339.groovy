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

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Login_txtUsername'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_Login_txtPassword'), 'vZRTLKcObY4+AeQQrtQj5Q==')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Employee Management/a_Employee List'))

WebUI.click(findTestObject('Object Repository/Page_Employee Management/i_add'))

WebUI.setText(findTestObject('Object Repository/Page_Employee Management/input__first-name-box'), 'Sam')

WebUI.setText(findTestObject('Object Repository/Page_Employee Management/input__last-name-box'), 'aabrahm')

WebUI.click(findTestObject('Object Repository/Page_Employee Management/i_arrow_drop_down'))

WebUI.click(findTestObject('Object Repository/Page_Employee Management/span_Canadian Development Center'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Employee Management/select_-- Select --AustraliaAustralia offic_24b8d4'), 
    'string:2', true)

WebUI.click(findTestObject('Object Repository/Page_Employee Management/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Personal Details/span_-- Select --'))

WebUI.click(findTestObject('Object Repository/Page_Personal Details/span_Single'))

WebUI.click(findTestObject('Object Repository/Page_Personal Details/span_-- Select --'))

WebUI.click(findTestObject('Object Repository/Page_Personal Details/span_Male'))

WebUI.click(findTestObject('Object Repository/Page_Personal Details/span_-- Select --'))

WebUI.click(findTestObject('Object Repository/Page_Personal Details/span_Canadian'))

WebUI.click(findTestObject('Object Repository/Page_Personal Details/label_Drivers License Number'))

WebUI.setText(findTestObject('Object Repository/Page_Personal Details/input_Nationality_licenseNo'), '34578')

WebUI.click(findTestObject('Object Repository/Page_Personal Details/i_date_range'))

WebUI.click(findTestObject('Object Repository/Page_Personal Details/input__select-dropdown'))

WebUI.click(findTestObject('Object Repository/Page_Personal Details/span_2025'))

WebUI.click(findTestObject('Object Repository/Page_Personal Details/div_3'))

WebUI.click(findTestObject('Object Repository/Page_Personal Details/i_date_range'))

WebUI.click(findTestObject('Object Repository/Page_Personal Details/button_Close'))

WebUI.click(findTestObject('Object Repository/Page_Personal Details/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Job/i_arrow_drop_down'))

WebUI.click(findTestObject('Object Repository/Page_Job/span_Full-Time Contract'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Job/select_-- Select --FreelanceFull-Time Contr_ec654f'), 
    'string:2', true)

WebUI.click(findTestObject('Object Repository/Page_Job/i_arrow_drop_down'))

WebUI.click(findTestObject('Object Repository/Page_Job/span_Quality assurance (QA)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Job/select_-- Select --Architecture TeamQuality_a60494'), 
    'string:3', true)

WebUI.click(findTestObject('Object Repository/Page_Job/i_arrow_drop_down'))

WebUI.click(findTestObject('Object Repository/Page_Job/span_Office and Clerical Workers'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Job/select_-- Select --Craft WorkersLaborers an_89e419'), 
    'string:6', true)

WebUI.click(findTestObject('Object Repository/Page_Job/i_arrow_drop_down'))

WebUI.click(findTestObject('Object Repository/Page_Job/span_Assistant Director-Regional Sales'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Job/select_-- Select --Art DirectorAssistant Di_9f3082'), 
    'string:87', true)

WebUI.click(findTestObject('Object Repository/Page_Job/i_arrow_drop_down'))

WebUI.click(findTestObject('Object Repository/Page_Job/div_-- Select --'))

WebUI.click(findTestObject('Object Repository/Page_Job/i_date_range'))

WebUI.click(findTestObject('Object Repository/Page_Job/div_30'))

WebUI.click(findTestObject('Object Repository/Page_Job/i_date_range'))

WebUI.click(findTestObject('Object Repository/Page_Job/div_April_picker__nav--next'))

WebUI.click(findTestObject('Object Repository/Page_Job/div_April_picker__nav--next'))

WebUI.click(findTestObject('Object Repository/Page_Job/div_14'))

WebUI.click(findTestObject('Object Repository/Page_Job/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Onboarding/span_-- Select --'))

WebUI.click(findTestObject('Object Repository/Page_Onboarding/span_Onboarding - USA'))

WebUI.click(findTestObject('Object Repository/Page_Onboarding/button_Save'))

WebUI.closeBrowser()

