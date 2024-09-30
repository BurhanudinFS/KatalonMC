import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.security.Timestamp

import javax.xml.bind.annotation.XmlElementDecl.GLOBAL

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

//try {
	Windows.startApplicationWithTitle(GlobalVariable.MC, '')
	Windows.click(findWindowsObject('Object Repository/main/Patient/Import'))
	GlobalVariable.FileName ='20240926-1246'
	Windows.setText(findWindowsObject('Object Repository/main/PopUpOpenFile/TextBoxFileName'), GlobalVariable.FileName, FailureHandling.STOP_ON_FAILURE)
	Windows.click(findWindowsObject('Object Repository/main/PopUpOpenFile/ButtonOpen'))
	Windows.delay(50)
	Windows.click(findWindowsObject('Object Repository/main/Patient/PopUpImport/Continue'))
	Windows.delay(120)
	
	Windows.click(findWindowsObject('Object Repository/main/PopUpFormMessage/ButtonOk'))
	
	
/*	
	}catch(Exception e) {
		GlobalVariable.isError = true
		if(Windows.waitForElementNotPresent(findWindowsObject('Object Repository/main/PopUpError/WindowsPopUpError'),GlobalVariable.WaitingTime,FailureHandling.OPTIONAL)) {
			GlobalVariable.Message  = e.getMessage()
		}
		else {
			GlobalVariable.Message = Windows.getText(findWindowsObject('Object Repository/main/PopUpError/TextBoxError'))
			KeywordUtil.markError(GlobalVariable.Message)
		}
	}*/