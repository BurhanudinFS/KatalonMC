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
Date todaysDate = new Date();
def formattedDate = todaysDate.format("ddMMyyyyHHmm");
GlobalVariable.FileName = 'CustomerFileName' + formattedDate
Windows.click(findWindowsObject('Object Repository/main/Patient/Refresh'))
	
Windows.click(findWindowsObject('Object Repository/main/Patient/Table/Patient ID row 2 Checkbox'))
Windows.click(findWindowsObject('Object Repository/main/Patient/Export'))
Windows.setText(findWindowsObject('Object Repository/main/PopUpSaveFile/TextBoxFileName'), GlobalVariable.FileName, FailureHandling.STOP_ON_FAILURE)
Windows.click(findWindowsObject('Object Repository/main/PopUpSaveFile/ButtonSaveFile'))
Windows.click(findWindowsObject('Object Repository/main/Patient/PopUpExport/ButtonContinue'))
if(Windows.waitForElementNotPresent(findWindowsObject('Object Repository/main/PopUpLoading/WindowLoading'), GlobalVariable.WaitingTime,FailureHandling.OPTIONAL))
{
	Windows.click(findWindowsObject('Object Repository/main/PopUpFormMessage/ButtonOk'))
}
