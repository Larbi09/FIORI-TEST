
/*
 ID==INT-PP-002_002
 DESCRIPTION== Creation of WORK CENTER with duplicated name
 Author== ArBe
 */


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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://vhcouqs4ci.sap.coficab.com:44300/sap/saml2/sp/acs/110')

WebUI.click(findTestObject('Object Repository/INT-PP-002/Creation/Duplicated work center name/Page_Home/span_All_searchFieldInShell-button-img'))

WebUI.setText(findTestObject('Object Repository/INT-PP-002/Creation/Duplicated work center name/Page_Home/input_All_search'), 
    'CR01')

WebUI.sendKeys(findTestObject('Object Repository/INT-PP-002/Creation/Duplicated work center name/Page_Home/input_All_search'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/INT-PP-002/Creation/Duplicated work center name/Page_Search for CR01/div_Create Work Center'))

WebUI.click(findTestObject('Object Repository/INT-PP-002/Creation/Duplicated work center name/Page_Create Work Center Initial Screen/span_W_ls-inputfieldhelpbutton'))

WebUI.click(findTestObject('Object Repository/INT-PP-002/Creation/Duplicated work center name/Page_Create Work Center Initial Screen/div_'))

WebUI.click(findTestObject('Object Repository/INT-PP-002/Creation/Duplicated work center name/Page_Create Work Center Initial Screen/div_OKEmphasized'))

WebUI.setText(findTestObject('Object Repository/INT-PP-002/Creation/Duplicated work center name/Page_Create Work Center Initial Screen/input_W_InputField'), 
    'TEST')

WebUI.setText(findTestObject('Object Repository/INT-PP-002/Creation/Duplicated work center name/Page_Create Work Center Initial Screen/input_W_InputField_1'), 
    '')

WebUI.click(findTestObject('Object Repository/INT-PP-002/Creation/Duplicated work center name/Page_Create Work Center Initial Screen/input_W_InputField_1'))

WebUI.click(findTestObject('Object Repository/INT-PP-002/Creation/Duplicated work center name/Page_Create Work Center Initial Screen/span_W_ls-inputfieldhelpbutton_1'))

WebUI.click(findTestObject('Object Repository/INT-PP-002/Creation/Duplicated work center name/Page_Create Work Center Initial Screen/div_OKEmphasized_1'))

WebUI.click(findTestObject('Object Repository/INT-PP-002/Creation/Duplicated work center name/Page_Create Work Center Initial Screen/div_Next screenEmphasized'))

