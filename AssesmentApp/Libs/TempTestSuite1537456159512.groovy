import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/VAA0043-Manage Employees Department')

suiteProperties.put('name', 'VAA0043-Manage Employees Department')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("E:\\Git Assessment App Katalon\\AssesmentApp\\Reports\\VAA0043-Manage Employees Department\\20180920_203919\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/VAA0043-Manage Employees Department', suiteProperties, [new TestCaseBinding('Test Cases/Manage Employees Department/TCA095001', 'Test Cases/Manage Employees Department/TCA095001',  null), new TestCaseBinding('Test Cases/Manage Employees Department/TCA095002', 'Test Cases/Manage Employees Department/TCA095002',  null), new TestCaseBinding('Test Cases/Manage Employees Department/TCA095003', 'Test Cases/Manage Employees Department/TCA095003',  null)])
