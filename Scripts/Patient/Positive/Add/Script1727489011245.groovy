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
Windows.click(findWindowsObject('Object Repository/main/Patient/Add Patient'))
//Windows.setText(findWindowsObject('Object Repository/main/Patient/FormAdd/TextBoxBMI'), '100')
Windows.setText(findWindowsObject('Object Repository/main/Patient/FormAdd/TextBoxComment'), 'Patinet new register using automate')
Windows.setText(findWindowsObject('Object Repository/main/Patient/FormAdd/TextBoxCountry'), 'Country register automate')
Windows.setText(findWindowsObject('Object Repository/main/Patient/FormAdd/TextBoxDateOfBirth'), '11/09/2024')
Windows.setText(findWindowsObject('Object Repository/main/Patient/FormAdd/TextBoxEmail'), 'emailemail')
Windows.setText(findWindowsObject('Object Repository/main/Patient/FormAdd/TextBoxEmergencyContact'), 'Contact Emergency')
Windows.setText(findWindowsObject('Object Repository/main/Patient/FormAdd/TextBoxFirstName'), 'Patient New')
Windows.setText(findWindowsObject('Object Repository/main/Patient/FormAdd/TextBoxLastName'), 'Last Name Patinet')
Windows.setText(findWindowsObject('Object Repository/main/Patient/FormAdd/TextBoxNameAffix'), 'Affix Name')
Windows.setText(findWindowsObject('Object Repository/main/Patient/FormAdd/TextBoxPatientID'), '12xxxxPatient')
Windows.setText(findWindowsObject('Object Repository/main/Patient/FormAdd/TextBoxPhoneNumber1'), '641212212')
Windows.setText(findWindowsObject('Object Repository/main/Patient/FormAdd/TextBoxPhoneNumber2'), 'as454554')
Windows.setText(findWindowsObject('Object Repository/main/Patient/FormAdd/TextBoxPosition'), 'Top')
Windows.setText(findWindowsObject('Object Repository/main/Patient/FormAdd/TextBoxWarning'), 'WarningBox')
Windows.setText(findWindowsObject('Object Repository/main/Patient/FormAdd/TextBoxWeight'), '100')
Windows.setText(findWindowsObject('Object Repository/main/Patient/FormAdd/TextBoxPostCode'), '15555')
Windows.setText(findWindowsObject('Object Repository/main/Patient/FormAdd/TextBoxSalutation'), 'Salutation ')
Windows.setText(findWindowsObject('Object Repository/main/Patient/FormAdd/TextBoxSize'), '100')
Windows.setText(findWindowsObject('Object Repository/main/Patient/FormAdd/TextBoxStatusInfo'), 'Status Info OK')
Windows.setText(findWindowsObject('Object Repository/main/Patient/FormAdd/TextBoxStreet'), 'Street 75 No.7555')

Windows.setText(findWindowsObject('Object Repository/main/Patient/FormAdd/ComboBoxCitizenShip'), 'Indonesian')
Windows.sendKeys(findWindowsObject('Object Repository/main/Patient/FormAdd/ComboBoxCitizenShip'), Keys.chord(Keys.ENTER))

Windows.setText(findWindowsObject('Object Repository/main/Patient/FormAdd/ComboBoxElectronicPatientFile'), 'Yes')
Windows.sendKeys(findWindowsObject('Object Repository/main/Patient/FormAdd/ComboBoxElectronicPatientFile'), Keys.chord(Keys.ENTER))

Windows.setText(findWindowsObject('Object Repository/main/Patient/FormAdd/ComboBoxLanguage'), 'English')
Windows.sendKeys(findWindowsObject('Object Repository/main/Patient/FormAdd/ComboBoxLanguage'), Keys.chord(Keys.ENTER))

Windows.setText(findWindowsObject('Object Repository/main/Patient/FormAdd/ComboBoxMaritalStatus'), 'Single')
Windows.sendKeys(findWindowsObject('Object Repository/main/Patient/FormAdd/ComboBoxMaritalStatus'), Keys.chord(Keys.ENTER))


Windows.setText(findWindowsObject('Object Repository/main/Patient/FormAdd/ComboBoxSex'), 'Male')
Windows.sendKeys(findWindowsObject('Object Repository/main/Patient/FormAdd/ComboBoxSex'), Keys.chord(Keys.ENTER))


Windows.setText(findWindowsObject('Object Repository/main/Patient/FormAdd/ComboBoxTitle'), 'Prof.')
Windows.sendKeys(findWindowsObject('Object Repository/main/Patient/FormAdd/ComboBoxTitle'), Keys.chord(Keys.ENTER))

Windows.setText(findWindowsObject('Object Repository/main/Patient/FormAdd/ComboBoxVIPIndicator'), 'Yes')
Windows.sendKeys(findWindowsObject('Object Repository/main/Patient/FormAdd/ComboBoxVIPIndicator'), Keys.chord(Keys.ENTER))

Windows.click(findWindowsObject('Object Repository/main/Patient/FormAdd/ButtonSave'))
