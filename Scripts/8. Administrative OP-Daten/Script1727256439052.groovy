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

Windows.click(findWindowsObject('main/Administrative OP-Daten/Administrative OP-Daten'))

Windows.click(findWindowsObject('main/Administrative OP-Daten/Allergies-No'))

Windows.click(findWindowsObject('main/Administrative OP-Daten/Nuchtern-checkbox'))

Windows.click(findWindowsObject('main/Administrative OP-Daten/Parameterubernahme Hamodynamik-No'))

Windows.click(findWindowsObject('main/Administrative OP-Daten/Systolischer Bludtruck mmHg'))

Windows.setText(findWindowsObject('main/Administrative OP-Daten/Systolischer Bludtruck mmHg'), '100')

Windows.click(findWindowsObject('main/Administrative OP-Daten/Herzfrequenz Schlage-min'))

Windows.setText(findWindowsObject('main/Administrative OP-Daten/Herzfrequenz Schlage-min'), '99')

Windows.click(findWindowsObject('main/Administrative OP-Daten/Diastolischer Bludtruck mmhg'))

Windows.setText(findWindowsObject('main/Administrative OP-Daten/Diastolischer Bludtruck mmhg'), '80')

Windows.click(findWindowsObject('main/Administrative OP-Daten/Aukflarung erfolgt - Yes'))

Windows.click(findWindowsObject('main/Administrative OP-Daten/Date of intervention'))

Windows.setText(findWindowsObject('main/Administrative OP-Daten/Date of intervention'), '25/09/2024')

Windows.click(findWindowsObject('main/Administrative OP-Daten/Begin Prozedur'))

Windows.setText(findWindowsObject('main/Administrative OP-Daten/Begin Prozedur'), '10:40')

Windows.click(findWindowsObject('main/Administrative OP-Daten/Dosis Flaschen Produkt'))

Windows.setText(findWindowsObject('main/Administrative OP-Daten/Dosis Flaschen Produkt'), '10')

Windows.click(findWindowsObject('main/Administrative OP-Daten/Kontrasmittelmenge'))

Windows.setText(findWindowsObject('main/Administrative OP-Daten/Kontrasmittelmenge'), '25')

Windows.click(findWindowsObject('main/Administrative OP-Daten/Ende Prozedur'))

Windows.setText(findWindowsObject('main/Administrative OP-Daten/Ende Prozedur'), '13:20')

Windows.click(findWindowsObject('main/Administrative OP-Daten/Dauer'))

Windows.setText(findWindowsObject('main/Administrative OP-Daten/Dauer'), '10')

