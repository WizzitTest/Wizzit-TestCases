import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://ubank.wizzitcloud.com:9094/#/login')

WebUI.setText(findTestObject('Object Repository/Page_esbCloudPortal/input_Username_input_0'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_esbCloudPortal/input_Password_input_1'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.setText(findTestObject('Object Repository/Page_esbCloudPortal/input_Organisation_input_2'), 'ubank')

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Login'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Manage customers'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/button_customers'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/md-select_Search ByMobile numb'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/div_Name'))

WebUI.setText(findTestObject('Object Repository/Page_esbCloudPortal/input_Filter_input_12'), 'violet')

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Search'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Manage'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Edit Customer'))

WebUI.setText(findTestObject('Object Repository/Page_esbCloudPortal/input_Name_Name'), 'VIOLET MODISE')

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Update'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Ok'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Supervisor approvals'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Pending updates'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/md-icon_UBANKP001_ng-scope md-'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Johan Vorster'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Logout'))

WebUI.closeBrowser()

