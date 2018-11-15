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

WebUI.setText(findTestObject('Object Repository/Page_esbCloudPortal/input_Username_input_0'), 'pat')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_esbCloudPortal/input_Password_input_1'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.setText(findTestObject('Object Repository/Page_esbCloudPortal/input_Organisation_input_2'), 'ubank')

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Login'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Manage customers'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_customers'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/md-select_Search ByMobile numb'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/div_Mobile number'))

WebUI.setText(findTestObject('Object Repository/Page_esbCloudPortal/input_Filter_input_12'), '0633077666')

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Search'))

WebUI.waitForElementClickable(findTestObject('Page_esbCloudPortal/span_Manage'), 5)

WebUI.mouseOver(findTestObject('Page_esbCloudPortal/span_Manage'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Manage'))

WebUI.waitForElementClickable(findTestObject('Page_esbCloudPortal/span_Edit Customer'), 5)

WebUI.doubleClick(findTestObject('Object Repository/Page_esbCloudPortal/span_Edit Customer'))

WebUI.setText(findTestObject('Object Repository/Page_esbCloudPortal/input_Surname_Surname'), 'SIBINDI')

WebUI.setText(findTestObject('Object Repository/Page_esbCloudPortal/input_Name_Name'), 'NELSON')

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Update'))

WebUI.mouseOver(findTestObject('Page_esbCloudPortal/span_Ok'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Ok'))

WebUI.waitForElementClickable(findTestObject('Page_esbCloudPortal/span_Supervisor approvals'), 5)

WebUI.doubleClick(findTestObject('Object Repository/Page_esbCloudPortal/span_Supervisor approvals'))

WebUI.waitForElementClickable(findTestObject('Page_esbCloudPortal/span_Pending updates'), 5)

WebUI.doubleClick(findTestObject('Object Repository/Page_esbCloudPortal/span_Pending updates'))

WebUI.mouseOver(findTestObject('Page_esbCloudPortal/span_CUSTOMER'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_CUSTOMER'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/md-icon_SIBINDI_ng-scope md-fo'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Ok'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/md-icon_Supervisor approvals_m'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/md-icon_Supervisor approvals_m'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/button_Johan Vorster'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Logout'))

WebUI.setText(findTestObject('Object Repository/Page_esbCloudPortal/input_Username_input_19'), 'pat')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_esbCloudPortal/input_Password_input_20'), 'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.setText(findTestObject('Object Repository/Page_esbCloudPortal/input_Organisation_input_21'), 'ubank')

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Login'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_OK (1)'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_esbCloudPortal/input_Password_input_20'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Login'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Manage customers'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_customers'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/md-select_Search ByMobile numb_1'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/div_Mobile number'))

WebUI.setText(findTestObject('Object Repository/Page_esbCloudPortal/input_Filter_input_32'), '0767925474')

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Search'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Manage'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Change Mobile Number'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Update'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Ok'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Supervisor approvals'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Pending updates'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_CUSTOMER'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/md-icon_msisdn_ng-scope md-fon'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Ok'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/md-icon_Supervisor approvals_m'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/button_Johan Vorster'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Logout'))

WebUI.setText(findTestObject('Object Repository/Page_esbCloudPortal/input_Username_input_0'), 'pat')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_esbCloudPortal/input_Password_input_1'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.setText(findTestObject('Object Repository/Page_esbCloudPortal/input_Organisation_input_2'), 'ubank')

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Login'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Manage customers'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_customers'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/md-select_Search ByMobile numb'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/div_Mobile number'))

WebUI.setText(findTestObject('Object Repository/Page_esbCloudPortal/input_Filter_input_12'), '0633077666')

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Search'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Manage'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Banking Services'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/md-radio-button_Internet Banki'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Activate'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Ok'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Supervisor approvals'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Pending banking services'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/md-icon_INTERNET_BANKING_ng-sc'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_OK (1)'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/md-icon_Supervisor approvals_m'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/md-icon_Manage customers_menu-'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Johan Vorster'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/button_Logout'))

WebUI.setText(findTestObject('Object Repository/Page_esbCloudPortal/input_Username_input_0'), 'pat')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_esbCloudPortal/input_Password_input_1'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.setText(findTestObject('Object Repository/Page_esbCloudPortal/input_Organisation_input_2'), 'ubank')

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Login'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Manage customers'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_customers'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/md-select_Search ByMobile numb'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/div_Mobile number'))

WebUI.setText(findTestObject('Object Repository/Page_esbCloudPortal/input_Filter_input_12'), '0633077666')

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Search'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Manage'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Block Channels'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/md-radio-button_Internet Banki_1'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Block'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Ok'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Manage'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Re-Issue Pin'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/md-radio-button_Internet Banki_2'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Re-issue'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Ok'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Manage'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_View Links'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/input'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Ok'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Supervisor approvals'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Pending accounts'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_DERE LINK ACCOUNT'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/md-icon_uSave-Fixed Deposit_ng'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_OK (1)'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/md-icon_Supervisor approvals_m'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/md-icon_Manage customers_menu-'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/button_Johan Vorster'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Logout'))

WebUI.setText(findTestObject('Object Repository/Page_esbCloudPortal/input_Username_input_56'), 'pat')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_esbCloudPortal/input_Password_input_57'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.setText(findTestObject('Object Repository/Page_esbCloudPortal/input_Organisation_input_58'), 'ubank')

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Login'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Manage customers'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_customers'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/md-select_Search ByMobile numb_2'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/div_Mobile number'))

WebUI.setText(findTestObject('Object Repository/Page_esbCloudPortal/input_Filter_input_68'), '0633077666')

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Search'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Manage'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Updates Limits'))

WebUI.setText(findTestObject('Object Repository/Page_esbCloudPortal/input_MONTH_ng-pristine ng-unt'), '8')

WebUI.setText(findTestObject('Object Repository/Page_esbCloudPortal/input_MONTH_ng-untouched ng-va'), '8')

WebUI.setText(findTestObject('Object Repository/Page_esbCloudPortal/input_TRAN_ng-pristine ng-unto'), '7')

WebUI.setText(findTestObject('Object Repository/Page_esbCloudPortal/input_TRAN_ng-untouched ng-val'), '7')

WebUI.setText(findTestObject('Object Repository/Page_esbCloudPortal/input_TRAN_ng-pristine ng-unto'), '6')

WebUI.setText(findTestObject('Object Repository/Page_esbCloudPortal/input_TRAN_ng-untouched ng-val'), '6')

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Update'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Ok'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Supervisor approvals'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Pending updates'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_CUSTOMER'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/md-icon_Internal Transfers Mon'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Ok'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/md-icon_Supervisor approvals_m'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Johan Vorster'))

WebUI.click(findTestObject('Object Repository/Page_esbCloudPortal/span_Logout'))

WebUI.closeBrowser()

