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

Windows.startApplication(GlobalVariable.MC)

Windows.click(findWindowsObject('main/Biopsie Tab/Biopsie Tab'))

Windows.doubleClick(findWindowsObject('main/Biopsie Tab/RadioButton-Biopsie-Yes'))

Windows.doubleClick(findWindowsObject('main/Biopsie Tab/ComboBox-Ort der Biopsie'))

Windows.setText(findWindowsObject('main/Biopsie Tab/ComboBox-Ort der Biopsie'), 'RV')

Windows.doubleClick(findWindowsObject('main/Biopsie Tab/Anzahl'))

Windows.setText(findWindowsObject('main/Biopsie Tab/Anzahl'), '123')

Windows.doubleClick(findWindowsObject('main/Biopsie Tab/ComboBox-Versendung'))

Windows.setText(findWindowsObject('main/Biopsie Tab/ComboBox-Versendung'), 'Test ABC')

Windows.click(findWindowsObject('main/Biopsie Tab/CheckBox-Transradial'))

Windows.click(findWindowsObject('main/Biopsie Tab/Generate FInding Text'))

