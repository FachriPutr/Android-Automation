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

Mobile.tap(findTestObject('Object Repository/Linkage Saver/android.widget.TextView - Lewati'), 0)

Mobile.tap(findTestObject('Object Repository/Linkage Saver/android.widget.Button - Daftar'), 0)

Mobile.tap(findTestObject('Object Repository/Linkage Saver/android.widget.Button - Ya'), 0)

Mobile.tap(findTestObject('Object Repository/Linkage Saver/android.widget.TextView - Nomor Rekening'), 0)

//no rekening salah, no kartu benar, dan pin benar
Mobile.setText(findTestObject('Object Repository/Linkage Saver/android.widget.EditText - input Nomor rekening'), '10110235077', 
    0)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

Mobile.tap(findTestObject('Object Repository/Linkage Saver/android.widget.EditText - input kolom 1'), 0)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_5)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_3)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_6)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_8)

//for (int i = 1; i < 5; i++) {
//	driver.pressKeyCode(AndroidKeyCode.KEYCODE_1)
//}
Mobile.tap(findTestObject('Object Repository/Linkage Saver/android.widget.EditText - input kolom 2'), 0)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_9)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_7)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_3)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_0)

//for (int i = 1; i < 5; i++) {
//	driver.pressKeyCode(AndroidKeyCode.KEYCODE_2)
//}
Mobile.tap(findTestObject('Object Repository/Linkage Saver/android.widget.EditText - input kolom 3'), 0)

for (int i = 1; i < 5; i++) {
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_0)
}

//for (int i = 1; i < 5; i++) {
//	driver.pressKeyCode(AndroidKeyCode.KEYCODE_9)
//}
Mobile.tap(findTestObject('Object Repository/Linkage Saver/android.widget.EditText - input kolom 4'), 0)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_1)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_5)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_9)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_7)

Mobile.pressBack()

//for (int i = 1; i < 5; i++) {
//	driver.pressKeyCode(AndroidKeyCode.KEYCODE_1)
//}
Mobile.tap(findTestObject('Object Repository/Linkage Saver/android.widget.TextView - PIN Kartu Debit'), 0)

Mobile.setText(findTestObject('Object Repository/Linkage Saver/android.widget.EditText - pin kolom 1'), '0', 0)

Mobile.setText(findTestObject('Object Repository/Linkage Saver/android.widget.EditText - pin kolom 2'), '8', 0)

Mobile.setText(findTestObject('Object Repository/Linkage Saver/android.widget.EditText - pin kolom 3'), '1', 0)

Mobile.setText(findTestObject('Object Repository/Linkage Saver/android.widget.EditText - pin kolom 4'), '1', 0)

Mobile.setText(findTestObject('Object Repository/Linkage Saver/android.widget.EditText - pin kolom 5'), '1', 0)

Mobile.setText(findTestObject('Object Repository/Linkage Saver/android.widget.EditText - pin kolom 6'), '0', 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Linkage Saver/android.widget.Button - Selanjutnya'), 0)

Mobile.tap(findTestObject('Neopay Transfer/android.widget.Button - Button OK'), 0)

//no rekening dan pin benar , no kartu salah
Mobile.clearText(findTestObject('Object Repository/Linkage Saver/android.widget.EditText - input Nomor rekening'), 0, FailureHandling.STOP_ON_FAILURE // clear text
    )

Mobile.setText(findTestObject('Object Repository/Linkage Saver/android.widget.EditText - input Nomor rekening'), '10110235013', 
    0)

Mobile.clearText(findTestObject('Object Repository/Linkage Saver/android.widget.EditText - input kolom 1'), 0, FailureHandling.STOP_ON_FAILURE // clear text
    )

Mobile.tap(findTestObject('Object Repository/Linkage Saver/android.widget.EditText - input kolom 1'), 0)

for (int i = 1; i < 5; i++) {
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_1)
}

Mobile.clearText(findTestObject('Object Repository/Linkage Saver/android.widget.EditText - input kolom 2'), 0, FailureHandling.STOP_ON_FAILURE // clear text
    )

Mobile.tap(findTestObject('Object Repository/Linkage Saver/android.widget.EditText - input kolom 2'), 0)

for (int i = 1; i < 5; i++) {
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_2)
}

Mobile.clearText(findTestObject('Object Repository/Linkage Saver/android.widget.EditText - input kolom 3'), 0, FailureHandling.STOP_ON_FAILURE // clear text
    )

Mobile.tap(findTestObject('Object Repository/Linkage Saver/android.widget.EditText - input kolom 3'), 0)

for (int i = 1; i < 5; i++) {
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_9)
}

Mobile.clearText(findTestObject('Object Repository/Linkage Saver/android.widget.EditText - input kolom 4'), 0, FailureHandling.STOP_ON_FAILURE // clear text
    )

Mobile.tap(findTestObject('Object Repository/Linkage Saver/android.widget.EditText - input kolom 4'), 0)

for (int i = 1; i < 5; i++) {
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_1)
}

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Linkage Saver/android.widget.TextView - PIN Kartu Debit'), 0)

Mobile.setText(findTestObject('Object Repository/Linkage Saver/android.widget.EditText - pin kolom 1'), '0', 0)

Mobile.setText(findTestObject('Object Repository/Linkage Saver/android.widget.EditText - pin kolom 2'), '8', 0)

Mobile.setText(findTestObject('Object Repository/Linkage Saver/android.widget.EditText - pin kolom 3'), '1', 0)

Mobile.setText(findTestObject('Object Repository/Linkage Saver/android.widget.EditText - pin kolom 4'), '1', 0)

Mobile.setText(findTestObject('Object Repository/Linkage Saver/android.widget.EditText - pin kolom 5'), '1', 0)

Mobile.setText(findTestObject('Object Repository/Linkage Saver/android.widget.EditText - pin kolom 6'), '0', 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Linkage Saver/android.widget.Button - Selanjutnya'), 0)

Mobile.tap(findTestObject('Neopay Transfer/android.widget.Button - Button OK'), 0)

//no rekening dan no kartu benar dan pin salah
Mobile.clearText(findTestObject('Object Repository/Linkage Saver/android.widget.EditText - input kolom 1'), 0, FailureHandling.STOP_ON_FAILURE // clear text
    )

Mobile.tap(findTestObject('Object Repository/Linkage Saver/android.widget.EditText - input kolom 1'), 0)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_5)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_3)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_6)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_8)

Mobile.clearText(findTestObject('Object Repository/Linkage Saver/android.widget.EditText - input kolom 2'), 0, FailureHandling.STOP_ON_FAILURE // clear text
    )

Mobile.tap(findTestObject('Object Repository/Linkage Saver/android.widget.EditText - input kolom 2'), 0)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_9)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_7)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_3)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_0)

Mobile.clearText(findTestObject('Object Repository/Linkage Saver/android.widget.EditText - input kolom 3'), 0, FailureHandling.STOP_ON_FAILURE // clear text
    )

Mobile.tap(findTestObject('Object Repository/Linkage Saver/android.widget.EditText - input kolom 3'), 0)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_0)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_0)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_0)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_0)

Mobile.clearText(findTestObject('Object Repository/Linkage Saver/android.widget.EditText - input kolom 4'), 0, FailureHandling.STOP_ON_FAILURE // clear text
    )

Mobile.tap(findTestObject('Object Repository/Linkage Saver/android.widget.EditText - input kolom 4'), 0)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_1)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_5)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_9)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_7)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Linkage Saver/android.widget.TextView - PIN Kartu Debit'), 0)

Mobile.clearText(findTestObject('Object Repository/Linkage Saver/android.widget.EditText - pin kolom 1'), 0, FailureHandling.STOP_ON_FAILURE // clear text
    )

Mobile.setText(findTestObject('Object Repository/Linkage Saver/android.widget.EditText - pin kolom 1'), '1', 0)

Mobile.clearText(findTestObject('Object Repository/Linkage Saver/android.widget.EditText - pin kolom 2'), 0, FailureHandling.STOP_ON_FAILURE // clear text
    )

Mobile.setText(findTestObject('Object Repository/Linkage Saver/android.widget.EditText - pin kolom 2'), '2', 0)

Mobile.clearText(findTestObject('Object Repository/Linkage Saver/android.widget.EditText - pin kolom 3'), 0, FailureHandling.STOP_ON_FAILURE // clear text
    )

Mobile.setText(findTestObject('Object Repository/Linkage Saver/android.widget.EditText - pin kolom 3'), '3', 0)

Mobile.clearText(findTestObject('Object Repository/Linkage Saver/android.widget.EditText - pin kolom 4'), 0, FailureHandling.STOP_ON_FAILURE // clear text
    )

Mobile.setText(findTestObject('Object Repository/Linkage Saver/android.widget.EditText - pin kolom 4'), '4', 0)

Mobile.clearText(findTestObject('Object Repository/Linkage Saver/android.widget.EditText - pin kolom 5'), 0, FailureHandling.STOP_ON_FAILURE // clear text
    )

Mobile.setText(findTestObject('Object Repository/Linkage Saver/android.widget.EditText - pin kolom 5'), '4', 0)

Mobile.clearText(findTestObject('Object Repository/Linkage Saver/android.widget.EditText - pin kolom 6'), 0, FailureHandling.STOP_ON_FAILURE // clear text
    )

Mobile.setText(findTestObject('Object Repository/Linkage Saver/android.widget.EditText - pin kolom 6'), '6', 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Linkage Saver/android.widget.Button - Selanjutnya'), 0)

Mobile.tap(findTestObject('Neopay Transfer/android.widget.Button - Button OK'), 0)

//semua benar
Mobile.tap(findTestObject('Object Repository/Linkage Saver/android.widget.TextView - PIN Kartu Debit'), 0)

Mobile.setText(findTestObject('Object Repository/Linkage Saver/android.widget.EditText - pin kolom 1'), '0', 0)

Mobile.setText(findTestObject('Object Repository/Linkage Saver/android.widget.EditText - pin kolom 2'), '8', 0)

Mobile.setText(findTestObject('Object Repository/Linkage Saver/android.widget.EditText - pin kolom 3'), '1', 0)

Mobile.setText(findTestObject('Object Repository/Linkage Saver/android.widget.EditText - pin kolom 4'), '1', 0)

Mobile.setText(findTestObject('Object Repository/Linkage Saver/android.widget.EditText - pin kolom 5'), '1', 0)

Mobile.setText(findTestObject('Object Repository/Linkage Saver/android.widget.EditText - pin kolom 6'), '0', 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Linkage Saver/android.widget.Button - Selanjutnya'), 0)

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

driver.terminateApp('com.nobubank.nobuepay.walletuat')

