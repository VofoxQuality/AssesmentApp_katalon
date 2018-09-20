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


RunConfiguration.setExecutionSettingFile('C:\\Users\\SEBAST~1.VOF\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Manage Department\\TCA094002\\20180920_192324\\execution.properties')

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

WebUI.click(findTestObject('Object Repository/Page_/a_ Manage Department'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_/td_Manage Department'), 'Manage Department')

WebUI.verifyElementText(findTestObject('Object Repository/Page_/th_Department'), 'Department')

WebUI.verifyElementText(findTestObject('Object Repository/Page_/th_Description'), 'Description')

WebUI.verifyElementText(findTestObject('Page_/a_Edit'), 'Edit')

WebUI.verifyElementText(findTestObject('Page_/a_Delete'), 'Delete')

//WebUI.verifyElementVisible(findTestObject('Page_/input_btnAddNewDepartment'), FailureHandling.STOP_ON_FAILURE)
//WebUI.verifyElementVisible(findTestObject('Page_/span_1'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Page_/input_btnAddNewDepartment'))

WebUI.verifyElementText(findTestObject('Page_/span_Add New Department'), 'Add New Department')

WebUI.verifyElementText(findTestObject('Page_/td_Department'), 'Department')

WebUI.verifyElementText(findTestObject('Page_/th_Description'), 'Description')

WebUI.click(findTestObject('Page_/input_ButtonSubmit'))

//WebUI.verifyElementText(findTestObject('Page_/span_This Field is Required_1'), '*This Field is Required')
WebUI.verifyElementText(findTestObject('Page_/span_This Field is Required_2'), '*This Field is Required')

WebUI.setText(findTestObject('Page_/input_ctl00adminContentPlaceHo_dept'), 'QA Vofox')

WebUI.setText(findTestObject('Page_/input_ctl00adminContentPlaceHo_desc'), 'Duplication test')

WebUI.click(findTestObject('Page_/input_ButtonSubmit'))

WebUI.verifyElementText(findTestObject('Page_/span_Insertion Failed.Departme'), 'Insertion Failed.Department Already Exist')

WebUI.click(findTestObject('Page_/span_Close'))

WebUI.delay(1)

WebUI.verifyElementText(findTestObject('Object Repository/Page_/td_Manage Department'), 'Manage Department')

WebUI.click(findTestObject('Page_/input_btnAddNewDepartment'))

WebUI.verifyElementText(findTestObject('Page_/span_Add New Department'), 'Add New Department')

WebUI.click(findTestObject('Page_/input_ctl00adminContentPlaceHo'))

''', 'Test Cases/Manage Department/TCA094002', new TestCaseBinding('Test Cases/Manage Department/TCA094002',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
