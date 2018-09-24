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


suiteProperties.put('id', 'Test Suites/VAA0040-Admin_login')

suiteProperties.put('name', 'VAA0040-Admin_login')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("E:\\VofoxQA\\AssesmentApp_Katalon\\AssesmentApp\\Reports\\VAA0040-Admin_login\\20180918_144641\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/VAA0040-Admin_login', suiteProperties, [new TestCaseBinding('Test Cases/Admin_Login/TCA091001', 'Test Cases/Admin_Login/TCA091001',  null), new TestCaseBinding('Test Cases/Admin_Login/TCA091002', 'Test Cases/Admin_Login/TCA091002',  null), new TestCaseBinding('Test Cases/Admin_Login/TCA091003', 'Test Cases/Admin_Login/TCA091003',  null), new TestCaseBinding('Test Cases/Admin_Login/TCA091004', 'Test Cases/Admin_Login/TCA091004',  null), new TestCaseBinding('Test Cases/Admin_Login/TCA091005', 'Test Cases/Admin_Login/TCA091005',  null), new TestCaseBinding('Test Cases/Admin_Login/TCA091006', 'Test Cases/Admin_Login/TCA091006',  null), new TestCaseBinding('Test Cases/Admin_Login/TCA091007', 'Test Cases/Admin_Login/TCA091007',  null), new TestCaseBinding('Test Cases/Admin_Login/TCA091008', 'Test Cases/Admin_Login/TCA091008',  null)])
