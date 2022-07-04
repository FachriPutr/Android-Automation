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

//Mobile.startExistingApplication('com.nobubank.nobuepay.walletuat')
Mobile.tap(findTestObject('Object Repository/Now 420/TC-001/android.widget.TextView - Lewati'), 0)

Mobile.tap(findTestObject('Object Repository/Now 420/TC-001/android.widget.EditText-tap input no'), 0)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

//Masukan No Hp Disini
Mobile.setText(findTestObject('Object Repository/Now 420/TC-001/android.widget.EditText- Input no login'), '1221723299', 
    0 //Set Text
    )

Mobile.tap(findTestObject('Object Repository/Now 420/TC-001/android.widget.Button - Login'), 0)

Mobile.tap(findTestObject('Object Repository/Now 420/TC-001/android.widget.TextView - Masukkan Kode Verifikasi'), 0)

Mobile.tap(findTestObject('Object Repository/Now 420/TC-001/android.widget.EditText-tap input OTP'), 0)

//Masukan OTP Disini
for (int i = 1; i < 7; i++) {
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_9)
}

//Masukan pin disini
for (int i = 1; i < 7; i++) {
    Mobile.tap(findTestObject('Now 420/TC-001/android.widget.TextView - 1 pin'), 0)
}

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Now 420/TC-001/android.widget.Button - Nanti'), 0)

Mobile.tap(findTestObject('Object Repository/Transfer neopay lewat favorit/android.widget.TextView - button Transfer'), 
    0)

Mobile.tap(findTestObject('Object Repository/Transfer neopay lewat favorit/android.widget.TextView -menu  Favorit'), 0)

Mobile.tap(findTestObject('Object Repository/Transfer neopay lewat favorit/android.view.ViewGroup - pilih favorit'), 0)

Mobile.tap(findTestObject('tambah favorit/tambah favorit bank account/android.widget.EditText - input nominal transfer bank'), 
    0)

Mobile.setText(findTestObject('tambah favorit/tambah favorit bank account/android.widget.EditText - input nominal transfer bank'), 
    '200000', 0)

Mobile.scrollToText('Selanjutnya', FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.tap(findTestObject('tambah favorit/tambah favorit bank account/android.widget.Button - Selanjutnya'), 0)

Mobile.tap(findTestObject('Object Repository/Transfer neopay lewat favorit/android.widget.TextView - halaman Konfirmasi Transfer'), 
    0)

Mobile.tap(findTestObject('Object Repository/Transfer neopay lewat favorit/android.widget.Button - Konfirmasi'), 0)

//Masukan No Hp Disini
for (int i = 1; i < 7; i++) {
    Mobile.tap(findTestObject('Now 420/TC-001/android.widget.TextView - 1 pin'), 0)
}

Mobile.tap(findTestObject('Object Repository/Transfer neopay lewat favorit/android.widget.TextView - halaman Transaksi Berhasil'), 
    0)

Mobile.tap(findTestObject('Object Repository/Transfer neopay lewat favorit/android.widget.ImageView - x'), 0)

Mobile.closeApplication()

