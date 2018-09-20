import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\SEBAST~1.VOF\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Manage Employees Department\\TCA095002\\20180920_203210\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('Page_/a_ Manage Employees Department'))

WebUI.selectOptionByValue(findTestObject('Page_/select_AllEmployeeNHIP Number'), 'Employee', true)

WebUI.delay(2)

WebUI.verifyTextPresent('Enter NHIP Number/', false)

WebUI.selectOptionByValue(findTestObject('Page_/select_AllEmployeeNHIP Number'), 'Nhip', true)

WebUI.verifyTextPresent('Enter NHIP Number/', false)

WebUI.verifyElementClickable(findTestObject('Page_/input_ctl00adminContentPlaceHo_searchbox'))

WebUI.selectOptionByValue(findTestObject('Page_/select_AllEmployeeNHIP Number'), 'Employee', true)

WebUI.click(findTestObject('Page_/input_ctl00adminContentPlaceHo_search'))

WebUI.verifyElementText(findTestObject('Page_/td_Sorry No Employees  Found..'), 'Sorry No Employees Found...')

WebUI.verifyElementText(findTestObject('Page_/th_First Name'), 'First Name')

WebUI.verifyElementText(findTestObject('Page_/th_Last Name'), 'Last Name')

WebUI.verifyElementText(findTestObject('Page_/th_NHIP Number'), 'NHIP Number')

WebUI.verifyElementText(findTestObject('Page_/th_Employer'), 'Employer')

WebUI.selectOptionByValue(findTestObject('Page_/select_AllEmployeeNHIP Number'), 'Nhip', true)

WebUI.setText(findTestObject('Page_/input_Description_Textbox'), 'dfg45')

WebUI.click(findTestObject('Page_/input_ctl00adminContentPlaceHo_search'))

WebUI.click(findTestObject('Page_/td_Sorry No Employees  Found..'))

WebUI.setText(findTestObject('Page_/input_ctl00adminContentPlaceHo'), 'NHIP-02014-00')

WebUI.click(findTestObject('Page_/input_ctl00adminContentPlaceHo_search'))

WebUI.verifyElementText(findTestObject('Page_/td_NHIP-02014-00'), 'NHIP-02014-00')

WebUI.selectOptionByValue(findTestObject('Page_/select_AllEmployeeNHIP Number'), 'Employee', true)

WebUI.setText(findTestObject('Page_/input_ctl00adminContentPlaceHo'), 'La-Cher')

WebUI.click(findTestObject('Page_/input_ctl00adminContentPlaceHo_search'))

WebUI.verifyElementText(findTestObject('Page_/td_La-Cher'), 'La-Cher')

WebUI.setText(findTestObject('Page_/input_ctl00adminContentPlaceHo'), 'Glinton')

WebUI.click(findTestObject('Page_/input_ctl00adminContentPlaceHo_search'))

WebUI.verifyElementText(findTestObject('Page_/td_Glinton'), 'Glinton')

WebUI.click(findTestObject('Page_/input_btnAssignEmployees'))

WebUI.verifyElementText(findTestObject('Page_/span_AssignUnassign Employee_pop'), 'Assign/Unassign Employee Departments')

WebUI.verifyElementPresent(findTestObject('Page_/input_ctl00adminContentPlaceHo_popsearch'), 0)

WebUI.verifyElementPresent(findTestObject('Page_/input_btnContinue_popSearch'), 0)

WebUI.verifyElementPresent(findTestObject('Page_/input_btn_popClear'), 0)

WebUI.verifyElementPresent(findTestObject('Page_/input_btn_pop_submit'), 0)

WebUI.click(findTestObject('Page_/input_txtdepKeyword_pop'))

WebUI.setText(findTestObject('Page_/input_txtdepKeyword_pop'), 'aa')

WebUI.click(findTestObject('Page_/input_ctl00adminContentPlaceHo_popsearch'))

WebUI.click(findTestObject('Page_/span_Close'))

''', 'Test Cases/Manage Employees Department/TCA095002', new TestCaseBinding('Test Cases/Manage Employees Department/TCA095002',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
