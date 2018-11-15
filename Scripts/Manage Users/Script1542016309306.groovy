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

WebUI.setText(findTestObject('Object Repository/Page_esbCloudPortal/input_Username_input_0 (1)'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_esbCloudPortal/input_Password_input_1 (1)'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.setText(findTestObject('Object Repository/Page_esbCloudPortal/input_Organisation_input_2 (1)'), 'ubank')

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Login (1)'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Manage Users'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/button_users'))

WebUI.waitForElementClickable(findTestObject('Page_esbCloudPortal/button_Manage'), 5)

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/button_Manage'))

WebUI.waitForElementClickable(findTestObject('Page_esbCloudPortal/span_Edit User'), 5)

WebUI.doubleClick(findTestObject('Object Repository/Page_esbCloudPortal/span_Edit User'))

WebUI.waitForElementClickable(findTestObject('Page_esbCloudPortal/span_Cancel'), 5)

WebUI.doubleClick(findTestObject('Object Repository/Page_esbCloudPortal/span_Cancel'))

WebUI.waitForElementClickable(findTestObject('Page_esbCloudPortal/span_Manage (1)'), 5)

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Manage (1)'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Add Portal Channel'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Cancel'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Add User'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Johan Vorster (1)'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/button_Logout'))

WebUI.closeBrowser()

