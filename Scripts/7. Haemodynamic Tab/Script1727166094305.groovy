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

Windows.startApplicationWithTitle(GlobalVariable.MC, '')

Windows.click(findWindowsObject('Object Repository/main/Haemodynamic Tab/Haemodynamics'))

Windows.click(findWindowsObject('main/Haemodynamic Tab/BP Systolic'))

Windows.setText(findWindowsObject('main/Haemodynamic Tab/BP Systolic'), '70')

Windows.click(findWindowsObject('main/Haemodynamic Tab/BP Diastolic'))

Windows.setText(findWindowsObject('main/Haemodynamic Tab/BP Diastolic'), '55')

Windows.doubleClick(findWindowsObject('main/Haemodynamic Tab/map'))

Windows.setText(findWindowsObject('main/Haemodynamic Tab/map'), '80')

Windows.click(findWindowsObject('main/Haemodynamic Tab/g 100ml'))

Windows.setText(findWindowsObject('main/Haemodynamic Tab/g 100ml'), '90')

Windows.click(findWindowsObject('Object Repository/main/Haemodynamic Tab/g dl'))

Windows.setText(findWindowsObject('Object Repository/main/Haemodynamic Tab/g dl'), '100')

Windows.click(findWindowsObject('Object Repository/main/Haemodynamic Tab/mmol l'))

Windows.setText(findWindowsObject('Object Repository/main/Haemodynamic Tab/mmol l'), '85')

Windows.doubleClick(findWindowsObject('Object Repository/main/Haemodynamic Tab/Heart rate'))

Windows.setText(findWindowsObject('Object Repository/main/Haemodynamic Tab/Heart rate'), '99')

Windows.doubleClick(findWindowsObject('Object Repository/main/Haemodynamic Tab/O2 cons'))

Windows.delay(5.000)

Windows.setText(findWindowsObject('Object Repository/main/Haemodynamic Tab/O2 cons'), '75')

Windows.click(findWindowsObject('Object Repository/main/Haemodynamic Tab/A (mmHg) row 1'))

Windows.setText(findWindowsObject('Object Repository/main/Haemodynamic Tab/A (mmHg) row 1'), '11')

Windows.click(findWindowsObject('Object Repository/main/Haemodynamic Tab/V (mmHg) row 1'))

Windows.setText(findWindowsObject('Object Repository/main/Haemodynamic Tab/V (mmHg) row 1'), '12')

Windows.click(findWindowsObject('Object Repository/main/Haemodynamic Tab/M (mmHg) row 1'))

Windows.setText(findWindowsObject('Object Repository/main/Haemodynamic Tab/M (mmHg) row 1'), '13')

Windows.click(findWindowsObject('Object Repository/main/Haemodynamic Tab/HR (bpm) row 1'))

Windows.setText(findWindowsObject('Object Repository/main/Haemodynamic Tab/HR (bpm) row 1'), '14')

Windows.click(findWindowsObject('Object Repository/main/Haemodynamic Tab/SO2 row 1'))

Windows.setText(findWindowsObject('Object Repository/main/Haemodynamic Tab/SO2 row 1'), '15')

Windows.click(findWindowsObject('Object Repository/main/Haemodynamic Tab/pO2 (mmHg) row 1'))

Windows.setText(findWindowsObject('Object Repository/main/Haemodynamic Tab/pO2 (mmHg) row 1'), '16')

Windows.click(findWindowsObject('Object Repository/main/Haemodynamic Tab/O2-cont row 1'))

Windows.setText(findWindowsObject('Object Repository/main/Haemodynamic Tab/O2-cont row 1'), '17')

Windows.click(findWindowsObject('Object Repository/main/Haemodynamic Tab/Save'))

Windows.click(findWindowsObject('Object Repository/main/Herzkatether 2024/Save and Close'))

