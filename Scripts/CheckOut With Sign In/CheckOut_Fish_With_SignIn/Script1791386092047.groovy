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

def LoginStep = CustomKeywords.'login.Login.LoginStep'()

WebUI.waitForElementVisible(findTestObject('Pilihan Menu Kategori/Image/Fish_Click'), 10)

WebUI.click(findTestObject('Pilihan Menu Kategori/Image/Fish_Click'))

WebUI.verifyElementPresent(findTestObject('Pilih Product/Fish/Angelfish/ProductID_FI-SW-01_Click'), 5)

WebUI.click(findTestObject('Pilih Product/Fish/Angelfish/ProductID_FI-SW-01_Click'))

// click detail melalui Item ID
WebUI.verifyElementPresent(findTestObject('Pilih Product/Fish/Angelfish/ItemID_EST-1_Click'), 0)

WebUI.click(findTestObject('Pilih Product/Fish/Angelfish/ItemID_EST-1_Click'))

// verify deskripsi product
def DeskripsiProduct = [('Image') : 'Pilih Product/Fish/Angelfish/Image_Gambar', ('Deskripsi Image') : 'Pilih Product/Fish/Angelfish/DeskripsiImage_Text'
    , ('Item ID') : 'Pilih Product/Fish/Angelfish/ItemID_EST-1_Text', ('Nama Item') : 'Pilih Product/Fish/Angelfish/NamaItem_Text'
    , ('Nama Product') : 'Pilih Product/Fish/Angelfish/NamaProduct_Text', ('Stok') : 'Pilih Product/Fish/Angelfish/Stok_Text'
    , ('Harga') : 'Pilih Product/Fish/Angelfish/Harga_Text']

DeskripsiProduct.each({ def Deskripsi, def NamaField ->
        boolean isVisible = WebUI.waitForElementVisible(findTestObject(NamaField), 3, FailureHandling.OPTIONAL)

        if (isVisible) {
            WebUI.comment(Deskripsi + ' Tersedia')
        } else {
            WebUI.comment(Deskripsi + ' Tidak Tersedia')
        }
    })

// Checkout Product
WebUI.verifyElementPresent(findTestObject('Pilih Product/Fish/Angelfish/AddToCart_Button'), 5)

WebUI.click(findTestObject('Pilih Product/Fish/Angelfish/AddToCart_Button'))

WebUI.click(findTestObject('Pilih Product/Shopping Chart/ShoppingChart_Text'))

WebUI.click(findTestObject('Pilih Product/Shopping Chart/Quantity_Field'))

WebUI.setText(findTestObject('Pilih Product/Shopping Chart/Quantity_Field'), '1')

WebUI.verifyElementPresent(findTestObject('Pilih Product/Shopping Chart/CheckOut_Button'), 5)

WebUI.click(findTestObject('Pilih Product/Shopping Chart/CheckOut_Button'))

// Pengisian Payment Details dan Billing Address
WebUI.mouseOver(findTestObject('Pilih Product/Payment dan Billing/Payment Details/PaymentDetails_Text'))

