import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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



WebUI.click(findTestObject('Page_/a_ Manage HR Department'))

WebUI.verifyElementText(findTestObject('Page_/td_Manage HR Department'), 'Manage HR Department')

WebUI.verifyElementText(findTestObject('Object Repository/Page_/span_HR Name  HR Number'), 'HR Name / HR Number')

WebUI.verifyElementClickable(findTestObject('Page_/HR_Dep_searchtext'))

WebUI.setText(findTestObject('Object Repository/Page_/HR_Dep_searchtext'), '@#$#@$')

WebUI.click(findTestObject('Object Repository/Page_/HR_Dep _search'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_/span_Your search string contai'), 'Your search string contains illegal characters.')

WebUI.setText(findTestObject('Object Repository/Page_/HR_Dep_searchtext'), 'abcd')

WebUI.click(findTestObject('Object Repository/Page_/HR_Dep _search'))

WebUI.click(findTestObject('Object Repository/Page_/th_HR Name'))

WebUI.click(findTestObject('Object Repository/Page_/th_HR Number'))

WebUI.click(findTestObject('Object Repository/Page_/th_Email'))

WebUI.click(findTestObject('Object Repository/Page_/td_Sorry No HR Users Found...'))

WebUI.setText(findTestObject('Object Repository/Page_/HR_Dep_searchtext'), 'test')

WebUI.click(findTestObject('Object Repository/Page_/HR_Dep _search'))

def text = WebUI.getText(findTestObject('Object Repository/Page_/span_demoHR test'))

if (!(text.contains('test'))) {
    KeywordUtil.markFailed('Message does not contain expected text.')
}

WebUI.click(findTestObject('Object Repository/Page_/HR_Dep_pop_btn'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_/span_Pop_title'), 'Select Departments')

//WebUI.verifyElementText(findTestObject('Object Repository/Page_/td_Department'), 'Department')

//WebUI.verifyElementText(findTestObject('Object Repository/Page_/td_Assigned HR'), 'Assigned HR')

//WebUI.click(findTestObject('Page_/input_chkDept'))

//WebUI.click(findTestObject('Object Repository/Page_/HR_Dep_pop_submit'))

//WebUI.verifyElementText(findTestObject('Page_/p_Department(s) assignedunassi'), 'Department(s) assigned/unassigned successfully.')

WebUI.click(findTestObject('Page_/span_Close_after depts assigned'))

//WebUI.closeBrowser()

