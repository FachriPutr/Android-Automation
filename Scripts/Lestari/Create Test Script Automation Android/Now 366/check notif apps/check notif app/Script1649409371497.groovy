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

Mobile.tap(findTestObject('Object Repository/Now 420/TC-001/android.widget.TextView - Lewati'), 0)

Mobile.tap(findTestObject('Object Repository/Now 420/TC-001/android.widget.EditText-tap input no'), 0)

Mobile.setText(findTestObject('Object Repository/Now 420/TC-001/android.widget.EditText- Input no login'), '7805629916', 
    0 //Set Text
    )

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

////Masukan No Hp Disini
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
//driver.pressKeyCode(AndroidKeyCode.KEYCODE_2)
//
//driver.pressKeyCode(AndroidKeyCode.KEYCODE_0)
//
//driver.pressKeyCode(AndroidKeyCode.ENTER)
Mobile.tap(findTestObject('Object Repository/Now 420/TC-001/android.widget.Button - Login'), 0)

Mobile.tap(findTestObject('Object Repository/Now 420/TC-001/android.widget.TextView - Masukkan Kode Verifikasi'), 0)

Mobile.tap(findTestObject('Object Repository/Now 420/TC-001/android.widget.EditText-tap input OTP'), 0)

for (int i = 1; i < 7; i++) {
    driver.pressKeyCode(AndroidKeyCode.KEYCODE_9)
}

Mobile.tap(findTestObject('Now 420/TC-001/android.widget.TextView - Masukkan Pin'), 0)

for (int i = 1; i < 7; i++) {
    Mobile.tap(findTestObject('TC007/android.widget.TextView - 1 pin'), 0)
}

//Mobile.tap(findTestObject('Object Repository/Now 420/TC-001/android.widget.TextView - Masukkan Pin'), 0)
//Masukan Pin Disini
Mobile.tap(findTestObject('Object Repository/Now 420/TC-001/android.widget.Button - Nanti'), 0)

Mobile.tap(findTestObject('check notif app/android.widget.ImageView - button check notiff'), 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\\\asset katalon\\\\NOW-417 [Android] Create TestScript First Downloader - New Flow/Now 420/TC001-1.png', 
    FailureHandling.STOP_ON_FAILURE)

driver.terminateApp('com.nobubank.nobuepay.walletuat')

