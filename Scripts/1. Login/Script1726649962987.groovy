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
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import dev.failsafe.internal.util.Assert
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Windows.startApplicationWithTitle(GlobalVariable.MC, '')

if(GlobalVariable.isError)
{
	if(Windows.waitForElementPresent(findWindowsObject('Object Repository/main/PopUpError/TextBoxError'),60,FailureHandling.OPTIONAL)) {
		GlobalVariable.Message = Windows.getText(findWindowsObject('Object Repository/main/PopUpError/TextBoxError'))
		KeywordUtil.markError(GlobalVariable.Message)
		
	}
	
	
}else {
	
	Windows.setText(findWindowsObject('User name'), 'mc2')
	
	Windows.doubleClick(findWindowsObject('Password'))
	
	Windows.setText(findWindowsObject('Password'), 'MC2_admin')
	Windows.click(findWindowsObject('Login'))
}






