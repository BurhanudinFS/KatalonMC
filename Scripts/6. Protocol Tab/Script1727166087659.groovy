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

Windows.startApplicationWithTitle('C:\\Program Files (x86)\\MC310801\\MediConnect2\\MediConnect2.exe', '')

WebUI.delay(5.00)

Windows.click(findWindowsObject('Object Repository/main/Protocol Tab/Protocol Tab'))

Windows.click(findWindowsObject('Object Repository/main/Protocol Tab/Add Medication'))

Windows.setText(findWindowsObject('Object Repository/main/Protocol Tab/Editing control-Medication'), 'Aspirin 100 tablet')

Windows.sendKeys(findWindowsObject('Object Repository/main/Protocol Tab/Add Medication'), Keys.chord(Keys.ENTER))

Windows.click(findWindowsObject('main/Protocol Tab/Dosage-value row 1'))

Windows.setText(findWindowsObject('main/Protocol Tab/Dosage-value row 1'), '10.00')

Windows.click(findWindowsObject('Object Repository/main/Protocol Tab/Medication Type row 1'))

Windows.setText(findWindowsObject('Object Repository/main/Protocol Tab/Medication Type row 1'), 'At admission')

Windows.sendKeys(findWindowsObject('Object Repository/main/Protocol Tab/Add Medication'), Keys.chord(Keys.ENTER))

Windows.doubleClick(findWindowsObject('Object Repository/main/Protocol Tab/Add laboratory'))

Windows.setText(findWindowsObject('Object Repository/main/Protocol Tab/Editing control-laboratory'), 'Activated coagulation time (ACT)')

Windows.sendKeys(findWindowsObject('Object Repository/main/Protocol Tab/Editing control-laboratory'), Keys.chord(Keys.ENTER))

Windows.click(findWindowsObject('main/Protocol Tab/Dosage-value row 1'))

Windows.setText(findWindowsObject('main/Protocol Tab/Dosage-value row 1'), '20.00')

Windows.click(findWindowsObject('Object Repository/main/Protocol Tab/Add event'))

Windows.setText(findWindowsObject('Object Repository/main/Protocol Tab/Editing control-Event'), 'TEE')

Windows.sendKeys(findWindowsObject('Object Repository/main/Protocol Tab/Editing control-Event'), Keys.chord(Keys.ENTER))

Windows.click(findWindowsObject('main/Protocol Tab/Dosage-value row 1'))

Windows.setText(findWindowsObject('main/Protocol Tab/Dosage-value row 1'), '30.00')

Windows.click(findWindowsObject('Object Repository/main/Protocol Tab/Save'))

WebUI.delay(3)

Windows.click(findWindowsObject('Object Repository/main/Protocol Tab/Confirm correctness'))

