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

WebUI.callTestCase(findTestCase('Login/AdminLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.navigateToUrl(GlobalVariable.voter_id_methods, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/ID Methods/ID Methods Page/Add ID Method Button'))

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/ID Methods/New ID Method Modal/Name'), 'Drivers License')

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/ID Methods/New ID Method Modal/Heading'), 'State Drivers License')

WebUI.selectOptionByValue(findTestObject('Admin Console ePulse Menu/Account Settings/ID Methods/New ID Method Modal/Select Color'), 
    '1', true)

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/ID Methods/New ID Method Modal/Instructions'), 
    'State Drivers License')

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/ID Methods/New ID Method Modal/Order'), '1')

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/ID Methods/New ID Method Modal/Show Does Name Match_slider'))

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/ID Methods/New ID Method Modal/Show Does Address Match_slider'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/ID Methods/New ID Method Modal/Show is ID Expired_slider'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/ID Methods/New ID Method Modal/Page_Epulse  am-Automation-test/Incorrect Heading'), 
    'No Drivers License?')

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/ID Methods/New ID Method Modal/Page_Epulse  am-Automation-test/Incorrect Instructions'), 
    'Vote Provisional')

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/ID Methods/New ID Method Modal/Submit'), FailureHandling.STOP_ON_FAILURE)

