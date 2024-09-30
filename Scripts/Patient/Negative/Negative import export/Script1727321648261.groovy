import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.lang.reflect.Array

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
import internal.GlobalVariable
import net.bytebuddy.implementation.bytecode.Throw

import org.openqa.selenium.Keys as Keys

//try {
	Windows.startApplicationWithTitle(GlobalVariable.MC, '')
	
	Windows.click(findWindowsObject('Object Repository/main/Patient/Refresh'))
	Windows.click(findWindowsObject('Object Repository/main/Patient/Table/Patient ID row 1'))
	Windows.click(findWindowsObject('Object Repository/main/Patient/Export'))
	Windows.setText(findWindowsObject('Object Repository/main/PopUpSaveFile/TextBoxFileName'), 'CustomerFileName', FailureHandling.STOP_ON_FAILURE)
	Windows.click(findWindowsObject('Object Repository/main/PopUpSaveFile/ButtonSaveFile'))
	GlobalVariable.Message = Windows.getText(findWindowsObject('Object Repository/main/PopUpError/TextBoxError'))
	KeywordUtil.markFailed(GlobalVariable.Message)
	Windows.click(findWindowsObject('Object Repository/main/PopUpError/ButtonOk'))
	
	
	Windows.setText(findWindowsObject('Object Repository/main/Patient/TextBoxFind'),'gud')
	Windows.click(findWindowsObject('Object Repository/main/Patient/ButtonFind'))
	
	Windows.click(findWindowsObject('Object Repository/main/Patient/Table/Patient ID row 1 Checkbox'))
	Windows.click(findWindowsObject('Object Repository/main/Patient/Delete Patient'))
	Windows.click(findWindowsObject('Object Repository/main/PopUpConfrim/ButtonYes'))
	

	Windows.click(findWindowsObject('Object Repository/main/Patient/Import'))
	Windows.setText(findWindowsObject('Object Repository/main/PopUpOpenFile/TextBoxFileName'), '20240926-1246', FailureHandling.STOP_ON_FAILURE)
	Windows.click(findWindowsObject('Object Repository/main/PopUpOpenFile/ButtonOpen'))
	Windows.delay(50)
	
	Windows.click(findWindowsObject('Object Repository/main/Patient/PopUpImport/Open file'))
	Windows.setText(findWindowsObject('Object Repository/main/PopUpOpenFile/TextBoxFileName'), '20240926-1031', FailureHandling.STOP_ON_FAILURE)
	Windows.click(findWindowsObject('Object Repository/main/PopUpOpenFile/ButtonOpen'))
	Windows.delay(20)

	Windows.click(findWindowsObject('Object Repository/main/PopUpFormMessage/ButtonOk'))
	Windows.click(findWindowsObject('Object Repository/main/Patient/PopUpImport/Continue'))
	GlobalVariable.Message = Windows.getText(findWindowsObject('Object Repository/main/PopUpError/TextBoxError'))
	KeywordUtil.markError(GlobalVariable.Message)
	Windows.click(findWindowsObject('Object Repository/main/PopUpError/ButtonOk'))
	Windows.click(findWindowsObject('Object Repository/main/Patient/PopUpImport/Close'))
		
	
	/*
	Array fileName =new Array('20240926-1031','20240926-1030')
	fileName.each {item->
		Windows.click(findWindowsObject('Object Repository/main/PopUpOpenFile/ButtonOpen'))
		findWindowsObject('Object Repository/main/Patient/PopUpImport/Open file')
		Windows.setText(findWindowsObject('Object Repository/main/PopUpOpenFile/TextBoxFileName'), item, FailureHandling.STOP_ON_FAILURE)
		Windows.delay(10)
	}

	
	Windows.click(findWindowsObject('Object Repository/main/Patient/PopUpImport/Continue'))
	Windows.click(findWindowsObject('Object Repository/main/PopUpError/ButtonOk'))
	*/
	
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
	