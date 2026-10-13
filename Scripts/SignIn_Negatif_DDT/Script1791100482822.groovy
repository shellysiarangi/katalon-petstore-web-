import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(GlobalVariable.base_url)

WebUI.verifyElementPresent(findTestObject('SignIn/SignIn_Click'), 5)

WebUI.click(findTestObject('SignIn/SignIn_Click'))

WebUI.verifyElementPresent(findTestObject('SignIn/Username_Field'), 5)

WebUI.setText(findTestObject('SignIn/Username_Field'), username)

WebUI.verifyElementPresent(findTestObject('SignIn/Password_Field'), 5)

WebUI.setText(findTestObject('SignIn/Password_Field'), password)

WebUI.click(findTestObject('SignIn/Login_Click'))

if (testType == 'P') {
    WebUI.verifyElementPresent(findTestObject('SignOut/SignOut_Click'), 0)
} else if ((testType == 'NU') || (testType == 'NP')) {
    WebUI.verifyTextPresent(expected, false)
}

WebUI.closeBrowser()

