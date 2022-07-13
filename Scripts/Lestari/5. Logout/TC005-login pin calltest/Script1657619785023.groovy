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
import java.util.regex.Matcher as Matcher
import java.util.regex.Pattern as Pattern
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.android.AndroidKeyCode as AndroidKeyCode

Mobile.startExistingApplication(GlobalVariable.APK, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Login/android.widget.Button - Login_pin'), 0)

TestData ExcelData = findTestData('lestari/Logout/DF005-Logout')

System.out.println('[Row Count] : ' + ExcelData.getRowNumbers())

for (int i = 1; i <= ExcelData.getRowNumbers(); i++) {
    System.out.println('[data files phone number] : ' + ExcelData.getValue(3, i))

    String pin = ExcelData.getValue(3, i)

    println('PinDariExcel ' + pin)

    String ButtonPin0 = Mobile.getText(findTestObject('Object Repository/TC007/android.widget.TextView - 0 pin'), 5, FailureHandling.OPTIONAL)

    String ButtonPin1 = Mobile.getText(findTestObject('Object Repository/TC007/android.widget.TextView - 1 pin'), 5, FailureHandling.OPTIONAL)

    String ButtonPin2 = Mobile.getText(findTestObject('Object Repository/TC007/android.widget.TextView - 2 pin'), 5, FailureHandling.OPTIONAL)

    String ButtonPin3 = Mobile.getText(findTestObject('Object Repository/TC007/android.widget.TextView - 3 pin'), 5, FailureHandling.OPTIONAL)

    String ButtonPin4 = Mobile.getText(findTestObject('Object Repository/TC007/android.widget.TextView - 4 pin'), 5, FailureHandling.OPTIONAL)

    String ButtonPin5 = Mobile.getText(findTestObject('Object Repository/TC007/android.widget.TextView - 5 pin'), 5, FailureHandling.OPTIONAL)

    String ButtonPin6 = Mobile.getText(findTestObject('Object Repository/TC007/android.widget.TextView - 6 pin'), 5, FailureHandling.OPTIONAL)

    String ButtonPin7 = Mobile.getText(findTestObject('Object Repository/TC007/android.widget.TextView - 7 pin'), 5, FailureHandling.OPTIONAL)

    String ButtonPin8 = Mobile.getText(findTestObject('Object Repository/TC007/android.widget.TextView - 8 pin'), 5, FailureHandling.OPTIONAL)

    String ButtonPin9 = Mobile.getText(findTestObject('Object Repository/TC007/android.widget.TextView - 9 pin'), 5, FailureHandling.OPTIONAL)

    println(ButtonPin1)

    println(ButtonPin2)

    println(ButtonPin3)

    for (int k = 0; k < pin.length(); k++) {
        if ((pin[k]) == ButtonPin0) {
            Mobile.tap(findTestObject('Object Repository/TC007/android.widget.TextView - 0 pin'), 5, FailureHandling.OPTIONAL)
        } else if ((pin[k]) == ButtonPin1) {
            Mobile.tap(findTestObject('Object Repository/TC007/android.widget.TextView - 1 pin'), 5, FailureHandling.OPTIONAL)
        } else if ((pin[k]) == ButtonPin2) {
            Mobile.tap(findTestObject('Object Repository/TC007/android.widget.TextView - 2 pin'), 5, FailureHandling.OPTIONAL)
        } else if ((pin[k]) == ButtonPin3) {
            Mobile.tap(findTestObject('Object Repository/TC007/android.widget.TextView - 3 pin'), 5, FailureHandling.OPTIONAL)
        } else if ((pin[k]) == ButtonPin4) {
            Mobile.tap(findTestObject('Object Repository/TC007/android.widget.TextView - 4 pin'), 5, FailureHandling.OPTIONAL)
        } else if ((pin[k]) == ButtonPin5) {
            Mobile.tap(findTestObject('Object Repository/TC007/android.widget.TextView - 5 pin'), 5, FailureHandling.OPTIONAL)
        } else if ((pin[k]) == ButtonPin6) {
            Mobile.tap(findTestObject('Object Repository/TC007/android.widget.TextView - 6 pin'), 5, FailureHandling.OPTIONAL)
        } else if ((pin[k]) == ButtonPin7) {
            Mobile.tap(findTestObject('Object Repository/TC007/android.widget.TextView - 7 pin'), 5, FailureHandling.OPTIONAL)
        } else if ((pin[k]) == ButtonPin8) {
            Mobile.tap(findTestObject('Object Repository/TC007/android.widget.TextView - 8 pin'), 5, FailureHandling.OPTIONAL)
        } else if ((pin[k]) == ButtonPin9) {
            Mobile.tap(findTestObject('Object Repository/TC007/android.widget.TextView - 9 pin'), 5, FailureHandling.OPTIONAL)
        }
    }
    
    Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

    if (pin != 123456) {
        Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

        Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Daftar/android.widget.Button - OK'), 5, FailureHandling.OPTIONAL)

        //        Mobile.tap(findTestObject('Object Repository/Daftar/android.widget.ImageView'), 5, FailureHandling.OPTIONAL)
        Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

        continue
    }
    
    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    //    S
    
}

Mobile.tap(findTestObject('Object Repository/Now 420/TC-001/android.widget.Button - Nanti'), 5, FailureHandling.OPTIONAL)

	Mobile.delay(5, FailureHandling.STOP_ON_FAILURE //driver.terminateApp('com.nobubank.nobuepay.walletsit')
		)

