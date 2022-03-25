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

Mobile.tap(findTestObject('Now-418/android.widget.Button - Ya'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText'), 0)



//5715527336
//5715527320
AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKeyCode(AndroidKeyCode.KEYCODE_1)
driver.pressKeyCode(AndroidKeyCode.KEYCODE_6)
driver.pressKeyCode(AndroidKeyCode.KEYCODE_4)
driver.pressKeyCode(AndroidKeyCode.KEYCODE_6)
driver.pressKeyCode(AndroidKeyCode.KEYCODE_9)
driver.pressKeyCode(AndroidKeyCode.KEYCODE_4)
driver.pressKeyCode(AndroidKeyCode.KEYCODE_8)
driver.pressKeyCode(AndroidKeyCode.KEYCODE_7)
driver.pressKeyCode(AndroidKeyCode.KEYCODE_1)
driver.pressKeyCode(AndroidKeyCode.KEYCODE_3)
driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.pressBack()

//Mobile.setText(findTestObject('Object Repository/TC004/android.widget.EditText-inputno'), '5715527320', 0)
Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/TC004/android.widget.Button - Selanjutnya'), 0)

Mobile.tap(findTestObject('Object Repository/TC004/android.widget.TextView - Masukkan Kode Verifikasi'), 0)

Mobile.tap(findTestObject('Object Repository/TC004/android.widget.EditText-tap-otp'), 0)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_9)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_9)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_9)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_9)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_9)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_9)

//
//driver.pressKeyCode(AndroidKeyCode.KEYCODE_7)
//
//driver.pressKeyCode(AndroidKeyCode.KEYCODE_3)
//
//driver.pressKeyCode(AndroidKeyCode.KEYCODE_2)
//
//driver.pressKeyCode(AndroidKeyCode.KEYCODE_0)
//driver.pressKeyCode(AndroidKeyCode.ENTER)
//Mobile.setText(findTestObject('Object Repository/TC004/android.widget.EditText'), '123321', 0)
Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('TC007/android.widget.TextView - Buat PIN Baru'), 0)

Mobile.tap(findTestObject('TC007/android.widget.TextView - 1 pin'), 0)

Mobile.tap(findTestObject('TC007/android.widget.TextView - 2 pin'), 0)

Mobile.tap(findTestObject('TC007/android.widget.TextView - 3 pin'), 0)

Mobile.tap(findTestObject('TC007/android.widget.TextView - 4 pin'), 0)

Mobile.tap(findTestObject('TC007/android.widget.TextView - 5 pin'), 0)

Mobile.tap(findTestObject('TC007/android.widget.TextView - 6 pin'), 0)

//
//Mobile.tap(findTestObject('TC007/android.widget.TextView - 7 pin'), 0)
//
//Mobile.tap(findTestObject('TC007/android.widget.TextView - 8 pin'), 0)
//
//Mobile.tap(findTestObject('TC007/android.widget.TextView - 9 pin'), 0)
//
//Mobile.tap(findTestObject('TC007/android.widget.TextView - 0 pin'), 0)
//
//Mobile.tap(findTestObject('TC007/android.widget.ImageView-backspacepin'), 0)
Mobile.tap(findTestObject('TC007/android.widget.TextView - Konfirmasi PIN Baru'), 0)

Mobile.tap(findTestObject('TC007/android.widget.TextView - 1 pin'), 0)

Mobile.tap(findTestObject('TC007/android.widget.TextView - 2 pin'), 0)

Mobile.tap(findTestObject('TC007/android.widget.TextView - 3 pin'), 0)

Mobile.tap(findTestObject('TC007/android.widget.TextView - 4 pin'), 0)

Mobile.tap(findTestObject('TC007/android.widget.TextView - 5 pin'), 0)

Mobile.tap(findTestObject('TC007/android.widget.TextView - 6 pin'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('TC008/android.widget.TextView - Buat Password Baru'), 0)

Mobile.tap(findTestObject('TC008/android.widget.TextView - Password'), 0)

Mobile.setText(findTestObject('TC008/android.widget.EditText-input password'), '@Testing123', 0)

//driver.pressKeyCode(AndroidKeyCode.KEYCODE_T)
//
//driver.pressKeyCode(AndroidKeyCode.KEYCODE_E)
//
//driver.pressKeyCode(AndroidKeyCode.KEYCODE_S)
//
//driver.pressKeyCode(AndroidKeyCode.KEYCODE_T)
//
//driver.pressKeyCode(AndroidKeyCode.KEYCODE_I)
//
//driver.pressKeyCode(AndroidKeyCode.KEYCODE_N)
//
//driver.pressKeyCode(AndroidKeyCode.KEYCODE_G)
//
//driver.pressKeyCode(AndroidKeyCode.KEYCODE_1)
//
//driver.pressKeyCode(AndroidKeyCode.KEYCODE_2)
//
//driver.pressKeyCode(AndroidKeyCode.KEYCODE_3)
Mobile.tap(findTestObject('TC008/android.widget.ImageView-visible password'), 0)

//Mobile.tap(findTestObject('TC008/android.widget.ImageView-invisible password'), 0)
Mobile.tap(findTestObject('TC008/android.widget.TextView - Konfirmasi Password'), 0)

Mobile.setText(findTestObject('TC008/android.widget.EditText- input konfirmasi password'), '@Testing321', 0)

//driver.pressKeyCode(AndroidKeyCode.KEYCODE_T)
//
//driver.pressKeyCode(AndroidKeyCode.KEYCODE_E)
//
//driver.pressKeyCode(AndroidKeyCode.KEYCODE_S)
//
//driver.pressKeyCode(AndroidKeyCode.KEYCODE_T)
//
//driver.pressKeyCode(AndroidKeyCode.KEYCODE_I)
//
//driver.pressKeyCode(AndroidKeyCode.KEYCODE_N)
//
//driver.pressKeyCode(AndroidKeyCode.KEYCODE_G)
//
//driver.pressKeyCode(AndroidKeyCode.KEYCODE_3)
//
//driver.pressKeyCode(AndroidKeyCode.KEYCODE_2)
//
//driver.pressKeyCode(AndroidKeyCode.KEYCODE_1)
Mobile.tap(findTestObject('TC008/android.widget.ImageView-visible konfirmasi password'), 0)

//Mobile.tap(findTestObject('TC008/android.widget.ImageView-invisible konfirmasi password'), 0)
//Mobile.pressBack()
Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\\\asset katalon\\\\NOW-417 [Android] Create TestScript First Downloader - New Flow/TC009-1.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('TC008/android.widget.Button - Lanjut'), 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

//Mobile.takeScreenshot('D:\\\\asset katalon\\\\NOW-417 [Android] Create TestScript First Downloader - New Flow/TC008-2.png', 
//    FailureHandling.STOP_ON_FAILURE)
driver.terminateApp('com.nobubank.nobuepay.walletsit')

