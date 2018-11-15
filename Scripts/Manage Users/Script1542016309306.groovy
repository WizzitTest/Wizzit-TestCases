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

WebUI.setText(findTestObject('Object Repository/Page_esbCloudPortal/input_Username_input_0 (1)'), 'pat')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_esbCloudPortal/input_Password_input_1 (1)'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.setText(findTestObject('Object Repository/Page_esbCloudPortal/input_Organisation_input_2 (1)'), 'ubank')

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Login (1)'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Manage Users'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_users'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/md-select_Search ByAll UsersMo'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/div_Mobile Number (1)'))

WebUI.setText(findTestObject('Object Repository/Page_esbCloudPortal/input_Filter_input_12 (1)'), '0633077666')

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Search (1)'))

WebUI.waitForElementClickable(findTestObject('Page_esbCloudPortal/span_Manage (1)'), 5)

WebUI.mouseOver(findTestObject('Page_esbCloudPortal/span_Manage (1)'))

WebUI.click(findTestObject('Page_esbCloudPortal/span_Manage (1)'))

WebUI.waitForElementClickable(findTestObject('Page_esbCloudPortal/span_Add Portal Channel'), 5)

WebUI.mouseOver(findTestObject('Page_esbCloudPortal/span_Add Portal Channel'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Add Portal Channel'))

WebUI.setText(findTestObject('Object Repository/Page_esbCloudPortal/input_Employee id_input_43'), 'P77765')

WebUI.setText(findTestObject('Object Repository/Page_esbCloudPortal/input_Branch ID_input_44'), 'Sandton')

WebUI.setText(findTestObject('Object Repository/Page_esbCloudPortal/input_E-mail_input_45'), 'vtmodise@gmail.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_esbCloudPortal/select_AuditCall_CenterFinance'), 'string:58e2a84e42e4142f7a0ef8a8',
	true)

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/div_Select Role_md-off'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Activate (1)'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Ok (2)'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Supervisor approvals (1)'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Pending banking services (1)'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/md-icon_PORTAL_ng-scope md-fon'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_OK (3)'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/md-icon_Supervisor approvals_m (1)'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/md-icon_Manage Users_menu-togg'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/button_Johan Vorster (1)'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Logout (1)'))

WebUI.setText(findTestObject('Object Repository/Page_esbCloudPortal/input_Username_input_0 (1)'), 'pat')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_esbCloudPortal/input_Password_input_1 (1)'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.setText(findTestObject('Object Repository/Page_esbCloudPortal/input_Organisation_input_2 (1)'), 'ubank')

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Login (1)'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Manage Users'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_users'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/md-select_Search ByAll UsersMo'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/div_Username'))

WebUI.setText(findTestObject('Object Repository/Page_esbCloudPortal/input_Filter_input_12 (1)'), 'P98765')

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Search (1)'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Manage (1)'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Edit User'))

WebUI.setText(findTestObject('Object Repository/Page_esbCloudPortal/input_Username_CellNo'), 'P56879')

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Update (1)'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Ok (2)'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Supervisor approvals (1)'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Pending updates (1)'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/md-icon_P56879_ng-scope md-fon'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/md-icon_P56879_ng-scope md-fon'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/md-icon_Supervisor approvals_m (1)'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/md-icon_Manage Users_menu-togg'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/button_Johan Vorster (1)'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Logout (1)'))

WebUI.setText(findTestObject('Object Repository/Page_esbCloudPortal/input_Username_input_0 (1)'), 'pat')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_esbCloudPortal/input_Password_input_1 (1)'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.setText(findTestObject('Object Repository/Page_esbCloudPortal/input_Organisation_input_2 (1)'), 'ubank')

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Login (1)'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Manage Users'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_users'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/md-select_Search ByAll UsersMo'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/div_Username'))

WebUI.setText(findTestObject('Object Repository/Page_esbCloudPortal/input_Filter_input_12 (1)'), 'P65432')

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Search (1)'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Manage (1)'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_RE-Issue Portal Password'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/div_Processing Request..._md-o'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Re-issue (1)'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Ok (2)'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Manage (1)'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_De-activate Portal user'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/div_Processing Request..._md-o_1'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Deactivate'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Ok (2)'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Manage (1)'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Change user roles'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_esbCloudPortal/select_AuditCall_CenterFinance'), 'string:58e2a84e42e4142f7a0ef8a8',
	true)

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Save'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Ok (2)'))

WebUI.closeBrowser()

