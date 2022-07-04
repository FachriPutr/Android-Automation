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

Mobile.startExistingApplication('com.nobubank.nobuepay.walletuat')

Mobile.tap(findTestObject('Object Repository/TC004/android.widget.TextView - Lewati'), 0)

Mobile.tap(findTestObject('Object Repository/TC004/android.widget.Button - Daftar'), 0)

Mobile.tap(findTestObject('Object Repository/TC004/android.widget.Button - Tidak-1'), 0)

Mobile.tap(findTestObject('Now-418/android.widget.Button - Ya'), 0)

Mobile.tap(findTestObject('enchan first downloader/android.widget.TextView - Nomor Handphone'), 0)

Mobile.tap(findTestObject('enchan first downloader/android.widget.EditText -  input no HP'), 0)

Mobile.setText(findTestObject('enchan first downloader/android.widget.EditText -  input no HP'), '1646948713', 0)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

//driver.pressKeyCode(AndroidKeyCode.KEYCODE_5)
//
//driver.pressKeyCode(AndroidKeyCode.KEYCODE_7)
//
//driver.pressKeyCode(AndroidKeyCode.KEYCODE_1)
//
//driver.pressKeyCode(AndroidKeyCode.KEYCODE_5)
//
//driver.pressKeyCode(AndroidKeyCode.KEYCODE_5)
//
//driver.pressKeyCode(AndroidKeyCode.KEYCODE_2)
//
//driver.pressKeyCode(AndroidKeyCode.KEYCODE_7)
//
//driver.pressKeyCode(AndroidKeyCode.KEYCODE_3)
//
//driver.pressKeyCode(AndroidKeyCode.KEYCODE_3)
//
//driver.pressKeyCode(AndroidKeyCode.KEYCODE_6)
//
//driver.pressKeyCode(AndroidKeyCode.ENTER)
//
//
Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Selanjutnya'), 0)

Mobile.tap(findTestObject('Object Repository/TC004/android.widget.TextView - Masukkan Kode Verifikasi'), 0)

Mobile.tap(findTestObject('Object Repository/TC004/android.widget.EditText-tap-otp'), 0)

for (int i = 1; i < 7; i++) {
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_9)
}

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('TC007/android.widget.TextView - Buat PIN Baru'), 0)

for (int i = 1; i < 7; i++) {
    Mobile.tap(findTestObject('TC007/android.widget.TextView - 1 pin'), 0)
}

Mobile.tap(findTestObject('TC007/android.widget.TextView - Konfirmasi PIN Baru'), 0)

for (int i = 1; i < 7; i++) {
    Mobile.tap(findTestObject('TC007/android.widget.TextView - 1 pin'), 0)
}

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('TC008/android.widget.TextView - Buat Password Baru'), 0)

Mobile.tap(findTestObject('TC008/android.widget.TextView - Password'), 0)

Mobile.setText(findTestObject('TC008/android.widget.EditText-input password'), 'Fakhriaria27@', 0)

Mobile.tap(findTestObject('TC008/android.widget.ImageView-visible password'), 0)

Mobile.tap(findTestObject('TC008/android.widget.ImageView-invisible password'), 0)

Mobile.tap(findTestObject('TC008/android.widget.TextView - Konfirmasi Password'), 0)

Mobile.setText(findTestObject('TC008/android.widget.EditText- input konfirmasi password'), 'Fakhriaria27@', 0)

Mobile.tap(findTestObject('TC008/android.widget.ImageView-visible konfirmasi password'), 0)

Mobile.tap(findTestObject('TC008/android.widget.ImageView-invisible konfirmasi password'), 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('TC010/android.widget.Button - Lanjut'), 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Now-1017/android.widget.Button - Nanti'), 0)

//Mobile.takeScreenshot('D:\\asset katalon\\NOW-417 [Android] Create TestScript First Downloader - New Flow\\ScreenShot\\Linkage Neopay Unregister\\1.png',
//    FailureHandling.STOP_ON_FAILURE)
Mobile.tap(findTestObject('Now-418/android.widget.Button - Isi Saldo'), 0)

Mobile.tap(findTestObject('Now-418/android.view.ViewGroup - tampilan maksimal limit'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

//Mobile.takeScreenshot('D:\\asset katalon\\NOW-417 [Android] Create TestScript First Downloader - New Flow\\ScreenShot\\Linkage Neopay Unregister\\2.png',
//    FailureHandling.STOP_ON_FAILURE)
driver.terminateApp('com.nobubank.nobuepay.walletuat')

