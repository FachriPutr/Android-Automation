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

Mobile.tap(findTestObject('langsung login/android.widget.Button - Login'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Now 420/TC-001/android.widget.TextView - Masukkan Pin'), 0)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

for (int i = 1; i < 7; i++) {
    Mobile.tap(findTestObject('TC007/android.widget.TextView - 1 pin'), 0)
}

Mobile.tap(findTestObject('Object Repository/Change Password/android.widget.ImageView-Sidemenu'), 0)

Mobile.tap(findTestObject('Object Repository/Change Password/android.widget.TextView - Ubah Password'), 0)

Mobile.tap(findTestObject('Object Repository/Change Password/android.widget.TextView - Password Saat Ini'), 0)

Mobile.setText(findTestObject('Object Repository/Change Password/android.widget.EditText-kolom isian password saat ini'), 
    'Fakhriaria27@', 0)

Mobile.tap(findTestObject('Object Repository/Change Password/android.widget.Button - Lanjut'), 0)

Mobile.tap(findTestObject('Object Repository/Change Password/android.widget.TextView - Buat Password Baru'), 0)

Mobile.comment('password tidak sama')

Mobile.tap(findTestObject('Object Repository/Change Password/android.widget.TextView - Password'), 0)

Mobile.setText(findTestObject('Object Repository/Change Password/android.widget.EditText-Kolom Password Baru'), 'Fakhriaria27@@', 
    0)

Mobile.tap(findTestObject('Object Repository/Change Password/android.widget.TextView - Konfirmasi Password'), 0)

Mobile.setText(findTestObject('Object Repository/Change Password/android.widget.EditText-Kolom Konfirmasi Password'), 'Fakhriaria27@Tes', 
    0)

Mobile.tap(findTestObject('Object Repository/Change Password/android.widget.ImageView-visible Password'), 0)

Mobile.tap(findTestObject('Object Repository/Change Password/android.widget.ImageView-visible konfirmasi password'), 0)

Mobile.tap(findTestObject('Change Password/android.widget.Button - Lanjut'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Change Password/android.widget.Button - OK'), 0)

Mobile.comment('password tidak Sesuai')

Mobile.tap(findTestObject('Object Repository/Change Password/android.widget.TextView - Password'), 0)

Mobile.setText(findTestObject('Object Repository/Change Password/android.widget.EditText-Kolom Password Baru'), '!@#$%^&*', 
    0)

Mobile.tap(findTestObject('Change Password/android.widget.Button - Lanjut'), 0)

Mobile.comment('password Berhasil rubah')

Mobile.tap(findTestObject('Object Repository/Change Password/android.widget.TextView - Password'), 0)

Mobile.setText(findTestObject('Object Repository/Change Password/android.widget.EditText-Kolom Password Baru'), 'Fakhriaria27@@', 
    0)

Mobile.tap(findTestObject('Object Repository/Change Password/android.widget.TextView - Konfirmasi Password'), 0)

Mobile.setText(findTestObject('Object Repository/Change Password/android.widget.EditText-Kolom Konfirmasi Password'), 'Fakhriaria27@@', 
    0)

Mobile.tap(findTestObject('Object Repository/Change Password/android.widget.ImageView-visible Password'), 0)

Mobile.tap(findTestObject('Object Repository/Change Password/android.widget.ImageView-visible konfirmasi password'), 0)

Mobile.tap(findTestObject('Change Password/android.widget.Button - Lanjut'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

