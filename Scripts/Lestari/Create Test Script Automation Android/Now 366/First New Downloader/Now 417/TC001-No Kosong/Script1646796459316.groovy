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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.android.AndroidKeyCode as AndroidKeyCode

Mobile.startExistingApplication('com.nobubank.nobuepay.walletsit')

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Lewati'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Daftar'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Tidak-1'), 0)

Mobile.tap(findTestObject('android.widget.Button - Tidak-2'), 0)

Mobile.tap(findTestObject('enchan first downloader/android.widget.TextView - Nomor Handphone'), 0)

Mobile.tap(findTestObject('enchan first downloader/android.widget.EditText -  input no HP'), 0)

Mobile.setText(findTestObject('enchan first downloader/android.widget.EditText -  input no HP'), '7887579892', 0)

Mobile.tap(findTestObject('enchan first downloader/android.widget.TextView - Alamat Email'), 0)

Mobile.setText(findTestObject('enchan first downloader/android.widget.EditText - input  email'), 'testerqaocean@gmail.com', 
    0)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKeyCode(AndroidKeyCode.KEYCODE_ENTER)

Mobile.pressBack()

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\asset katalon\\NOW-417 [Android] Create TestScript First Downloader - New Flow/TC001-1.png', 
    FailureHandling.STOP_ON_FAILURE)

driver.terminateApp('com.nobubank.nobuepay.walletsit')

