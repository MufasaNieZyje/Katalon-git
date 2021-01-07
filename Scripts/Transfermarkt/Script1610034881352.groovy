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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.transfermarkt.pl/profil/registrieren')

WebUI.click(findTestObject('Object Repository/Page_Zarejestruj  Transfermarkt/button_Uzgodni'))

WebUI.setText(findTestObject('Object Repository/Page_Zarejestruj  Transfermarkt/input_Zarejestruj si teraz darmowo_Register_60537b'), 
    Ksywka)

WebUI.setText(findTestObject('Object Repository/Page_Zarejestruj  Transfermarkt/input_Zrozumiaem_RegisterFormvorname'), 
    Imie)

WebUI.setText(findTestObject('Object Repository/Page_Zarejestruj  Transfermarkt/input_Imi_RegisterFormnachname'), Nazwisko)

WebUI.setText(findTestObject('Object Repository/Page_Zarejestruj  Transfermarkt/input_Zrozumiaem_RegisterFormemail'), Email)

WebUI.setText(findTestObject('Object Repository/Page_Zarejestruj  Transfermarkt/input_E-mail_RegisterFormemail2'), Remail)

WebUI.setText(findTestObject('Object Repository/Page_Zarejestruj  Transfermarkt/input_Powtrz e-mail_RegisterFormpasswort1'), 
    haslo)

WebUI.setText(findTestObject('Object Repository/Page_Zarejestruj  Transfermarkt/input_Zrozumiaem_RegisterFormpasswort2'), 
    Rhaslo)

WebUI.click(findTestObject('Object Repository/Page_Zarejestruj  Transfermarkt/input_Powtrz haso_RegisterFormnutzungsbedin_b536e5'))

WebUI.click(findTestObject('Object Repository/Page_Zarejestruj  Transfermarkt/input_tu_yt0'))

WebUI.verifyElementText(findTestObject(null), 'Zostań czlonkiem największej społeczności pilkarskiej na świecie!')

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.transfermarkt.pl/profil/registrieren')

WebUI.click(findTestObject('Object Repository/Page_Zarejestruj  Transfermarkt/button_Uzgodni (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Zarejestruj  Transfermarkt/input_Zarejestruj si teraz darmowo_Register_60537b'), 
    Ksywka)

WebUI.setText(findTestObject('Object Repository/Page_Zarejestruj  Transfermarkt/input_Zrozumiaem_RegisterFormvorname'), 
    Imie)

WebUI.setText(findTestObject('Object Repository/Page_Zarejestruj  Transfermarkt/input_Imi_RegisterFormnachname'), Nazwisko)

WebUI.setText(findTestObject('Object Repository/Page_Zarejestruj  Transfermarkt/input_Zrozumiaem_RegisterFormemail'), Email)

WebUI.setText(findTestObject('Object Repository/Page_Zarejestruj  Transfermarkt/input_E-mail_RegisterFormemail2'), Remail)

WebUI.setText(findTestObject('Object Repository/Page_Zarejestruj  Transfermarkt/input_Powtrz e-mail_RegisterFormpasswort1'), 
    haslo)

WebUI.setText(findTestObject('Object Repository/Page_Zarejestruj  Transfermarkt/input_Zrozumiaem_RegisterFormpasswort2'), 
    Rhaslo)

WebUI.click(findTestObject('Object Repository/Page_Zarejestruj  Transfermarkt/input_Powtrz haso_RegisterFormnutzungsbedin_b536e5'))

WebUI.click(findTestObject('Object Repository/Page_Zarejestruj  Transfermarkt/input_tu_yt0'))

WebUI.click(findTestObject('Object Repository/Page_Zarejestruj  Transfermarkt/p_Zosta czlonkiem najwikszej spoecznoci pil_4f93c4'))

