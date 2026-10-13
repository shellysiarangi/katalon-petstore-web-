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

WebUI.verifyElementPresent(findTestObject('Register/Register_Click'), 5)

WebUI.click(findTestObject('Register/Register_Click'))

WebUI.mouseOver(findTestObject('Register/01. User Information/UserInfo_Text'))

WebUI.click(findTestObject('Register/01. User Information/UserID_Field'))

WebUI.setText(findTestObject('Register/01. User Information/UserID_Field'), '1234')

WebUI.setText(findTestObject('Register/01. User Information/Password_Field'), '11223344')

WebUI.setText(findTestObject('Register/01. User Information/RepeatPassword_Field'), '11223344')

WebUI.mouseOver(findTestObject('Register/02. Account Information/AccountInfo_Text'))

WebUI.click(findTestObject('Register/02. Account Information/FirstName_Field'))

WebUI.setText(findTestObject('Register/02. Account Information/FirstName_Field'), 'Katalon')

WebUI.setText(findTestObject('Register/02. Account Information/LastName_Field'), 'Web')

WebUI.setText(findTestObject('Register/02. Account Information/Email_Field'), 'katalon@web.co.id')

WebUI.setText(findTestObject('Register/02. Account Information/Phone_Field'), '081234567890')

WebUI.setText(findTestObject('Register/02. Account Information/Address1_Field'), 'Jl. Jakarta 1')

WebUI.setText(findTestObject('Register/02. Account Information/Address2_Field'), 'Jl. Jakarta 2')

WebUI.setText(findTestObject('Register/02. Account Information/City_Field'), 'Jakarta')

WebUI.setText(findTestObject('Register/02. Account Information/State_Field'), '1')

WebUI.setText(findTestObject('Register/02. Account Information/Zip_Field'), '1')

WebUI.setText(findTestObject('Register/02. Account Information/Country_Field'), 'Indonesia')

WebUI.mouseOver(findTestObject('Register/03. Profile Information/ProfilInfo_Text'))

WebUI.click(findTestObject('Register/03. Profile Information/Language_Dropdown'))

WebUI.selectOptionByValue(findTestObject('Register/03. Profile Information/Language_Dropdown'), 'english', false)

WebUI.click(findTestObject('Register/03. Profile Information/Category_Dropdown'))

WebUI.selectOptionByValue(findTestObject('Register/03. Profile Information/Category_Dropdown'), 'CATS', false)

WebUI.click(findTestObject('Register/03. Profile Information/MyList_Checkbox'))

WebUI.click(findTestObject('Register/03. Profile Information/MyBanner_Checkbox'))

WebUI.click(findTestObject('Register/Save_Click'))

WebUI.closeBrowser()

