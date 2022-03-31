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

Mobile.tap(findTestObject('Object Repository/Now 420/TC-001/android.widget.TextView - Lewati'), 0)

Mobile.tap(findTestObject('Object Repository/Now 420/TC-001/android.widget.EditText-tap input no'), 0)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

//Masukan No Hp Disini
driver.pressKeyCode(AndroidKeyCode.KEYCODE_1)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_2)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_2)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_1)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_7)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_2)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_3)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_2)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_9)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_9)

driver.pressKeyCode(AndroidKeyCode.ENTER)

//Mobile.setText(findTestObject('Object Repository/Now 420/TC-001/android.widget.EditText- Input no login'), '5715527320', 0) //Set Text
Mobile.tap(findTestObject('Object Repository/Now 420/TC-001/android.widget.Button - Login'), 0)

Mobile.tap(findTestObject('Object Repository/Now 420/TC-001/android.widget.TextView - Masukkan Kode Verifikasi'), 0)

Mobile.tap(findTestObject('Object Repository/Now 420/TC-001/android.widget.EditText-tap input OTP'), 0)

//Mobile.setText(findTestObject('Object Repository/Now 420/TC-001/android.widget.EditText'), '999999', 0) //Set Text
//Masukan OTP Disini
driver.pressKeyCode(AndroidKeyCode.KEYCODE_9)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_9)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_9)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_9)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_9)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_9)

//Masukan pin disini
Mobile.tap(findTestObject('Now 420/TC-001/android.widget.TextView - 1 pin'), 0)

Mobile.tap(findTestObject('Now 420/TC-001/android.widget.TextView - 1 pin'), 0)

Mobile.tap(findTestObject('Now 420/TC-001/android.widget.TextView - 1 pin'), 0)

Mobile.tap(findTestObject('Now 420/TC-001/android.widget.TextView - 1 pin'), 0)

Mobile.tap(findTestObject('Now 420/TC-001/android.widget.TextView - 1 pin'), 0)

Mobile.tap(findTestObject('Now 420/TC-001/android.widget.TextView - 1 pin'), 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Now 420/TC-001/android.widget.Button - Nanti'), 0)

Mobile.tap(findTestObject('Neopay Transfer/android.widget.ImageView - invisible'), 0)

Mobile.tap(findTestObject('Neopay Transfer/android.widget.LinearLayout-Button Transfer'), 0)

Mobile.tap(findTestObject('Neopay Transfer/android.widget.TextView - Form Transfer'), 0)

Mobile.tap(findTestObject('Neopay Transfer/android.view.ViewGroup - Transfer Neopay'), 0)

Mobile.setText(findTestObject('Neopay Transfer/android.widget.EditText - Input No Ponsel'), '085715527777', 0)

Mobile.setText(findTestObject('Neopay Transfer/android.widget.EditText - input Nominal Transfer'), '9000000', 0)

Mobile.tap(findTestObject('Neopay Transfer/android.view.ViewGroup - tap sumber dana'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Neopay Transfer/android.widget.Button - Selanjutnya'), 0)

Mobile.tap(findTestObject('Neopay Transfer/android.widget.Button - Button OK'), 0)

Mobile.setText(findTestObject('Neopay Transfer/android.widget.EditText - input Nominal Transfer'), '5000', 0)

Mobile.tap(findTestObject('Neopay Transfer/android.view.ViewGroup - tap sumber dana'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Neopay Transfer/android.widget.Button - Selanjutnya'), 0)

Mobile.tap(findTestObject('Neopay Transfer/android.widget.Button - Button OK'), 0)

Mobile.closeApplication()

