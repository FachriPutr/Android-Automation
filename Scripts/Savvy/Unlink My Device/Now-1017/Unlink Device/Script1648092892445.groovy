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

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

//Mobile.tap(findTestObject('Object Repository/Now 420/TC-001/android.widget.Button - Nanti'), 0)
Mobile.tap(findTestObject('Object Repository/Now 420/TC-001/android.widget.ImageView- tap garis 3'), 0)

Mobile.tap(findTestObject('Now-1017/android.widget.TextView - Hapus Perangkat'), 0)

Mobile.tap(findTestObject('Now-1017/android.widget.TextView - Hapus Perangkat Ini'), 0)

Mobile.tap(findTestObject('Now-1017/android.widget.Button - Lanjutkan'), 0)

Mobile.tap(findTestObject('Now-1017/android.widget.Button - Hapus Perangkat'), 0)

Mobile.tap(findTestObject('Now-1017/android.widget.TextView - Masukkan Pin'), 0)

//Masukan pin disini
for (int i = 1; i < 7; i++) {
    Mobile.tap(findTestObject('TC007/android.widget.TextView - 1 pin'), 0)
}

Mobile.tap(findTestObject('Now-1017/android.widget.Button - OK hapus perangkat'), 0)

Mobile.tap(findTestObject('Now-1017/android.widget.TextView - Selamat Datang menu awal'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

driver.terminateApp('com.nobubank.nobuepay.walletuat')

