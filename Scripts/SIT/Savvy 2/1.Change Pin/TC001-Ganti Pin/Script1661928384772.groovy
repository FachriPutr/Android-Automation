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

Mobile.callTestCase(findTestCase('Savvy2/1.Change Pin/TC001-Login Sukses calltest'), [('NomorHandphone') : '', ('OTP') : ''
        , ('pin') : ''], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Ganti Pin/android.widget.ImageView - Side menu'), 5, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Ganti Pin/android.widget.LinearLayout - Ubah Pin'), 5, FailureHandling.OPTIONAL)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

TestData ExcelData = findTestData('Savvy2/Change Pin/DF001-Ganti Pin')

System.out.println('[Row Count] : ' + ExcelData.getRowNumbers())

for (int i = 1; i <= ExcelData.getRowNumbers(); i++) {
    System.out.println('[data files phonenumber] : ' + ExcelData.getValue(3, i))

    String OldValidPin = ExcelData.getValue(3, i)

    String OldPin = ExcelData.getValue(4, i)

    String pin = ExcelData.getValue(5, i)

    String KonfirmasiPin = ExcelData.getValue(6, i)

    println('PinDariExcel ' + OldPin)

    String ButtonPin0 = Mobile.getText(findTestObject('Neopay Transfer/android.widget.TextView - pin 0'), 5, FailureHandling.OPTIONAL)

    String ButtonPin1 = Mobile.getText(findTestObject('Neopay Transfer/android.widget.TextView - pin 1'), 5, FailureHandling.OPTIONAL)

    String ButtonPin2 = Mobile.getText(findTestObject('Neopay Transfer/android.widget.TextView - pin 2'), 5, FailureHandling.OPTIONAL)

    String ButtonPin3 = Mobile.getText(findTestObject('Neopay Transfer/android.widget.TextView - pin 3'), 5, FailureHandling.OPTIONAL)

    String ButtonPin4 = Mobile.getText(findTestObject('Neopay Transfer/android.widget.TextView - pin 4'), 5, FailureHandling.OPTIONAL)

    String ButtonPin5 = Mobile.getText(findTestObject('Neopay Transfer/android.widget.TextView - pin 5'), 5, FailureHandling.OPTIONAL)

    String ButtonPin6 = Mobile.getText(findTestObject('Neopay Transfer/android.widget.TextView - pin 6'), 5, FailureHandling.OPTIONAL)

    String ButtonPin7 = Mobile.getText(findTestObject('Neopay Transfer/android.widget.TextView - pin 7'), 5, FailureHandling.OPTIONAL)

    String ButtonPin8 = Mobile.getText(findTestObject('Neopay Transfer/android.widget.TextView - pin 8'), 5, FailureHandling.OPTIONAL)

    String ButtonPin9 = Mobile.getText(findTestObject('Neopay Transfer/android.widget.TextView - pin 9'), 5, FailureHandling.OPTIONAL)

    for (int k = 0; k < OldPin.length(); k++) {
        if ((OldPin[k]) == ButtonPin0) {
            Mobile.tap(findTestObject('Neopay Transfer/android.widget.TextView - pin 0'), 0, FailureHandling.OPTIONAL)
        } else if ((OldPin[k]) == ButtonPin1) {
            Mobile.tap(findTestObject('Neopay Transfer/android.widget.TextView - pin 1'), 0, FailureHandling.OPTIONAL)
        } else if ((OldPin[k]) == ButtonPin2) {
            Mobile.tap(findTestObject('Neopay Transfer/android.widget.TextView - pin 2'), 0, FailureHandling.OPTIONAL)
        } else if ((OldPin[k]) == ButtonPin3) {
            Mobile.tap(findTestObject('Neopay Transfer/android.widget.TextView - pin 3'), 0, FailureHandling.OPTIONAL)
        } else if ((OldPin[k]) == ButtonPin4) {
            Mobile.tap(findTestObject('Neopay Transfer/android.widget.TextView - pin 4'), 0, FailureHandling.OPTIONAL)
        } else if ((OldPin[k]) == ButtonPin5) {
            Mobile.tap(findTestObject('Neopay Transfer/android.widget.TextView - pin 5'), 0, FailureHandling.OPTIONAL)
        } else if ((OldPin[k]) == ButtonPin6) {
            Mobile.tap(findTestObject('Neopay Transfer/android.widget.TextView - pin 6'), 0, FailureHandling.OPTIONAL)
        } else if ((OldPin[k]) == ButtonPin7) {
            Mobile.tap(findTestObject('Neopay Transfer/android.widget.TextView - pin 7'), 0, FailureHandling.OPTIONAL)
        } else if ((OldPin[k]) == ButtonPin8) {
            Mobile.tap(findTestObject('Neopay Transfer/android.widget.TextView - pin 8'), 0, FailureHandling.OPTIONAL)
        } else if ((OldPin[k]) == ButtonPin9) {
            Mobile.tap(findTestObject('Neopay Transfer/android.widget.TextView - pin 9'), 0, FailureHandling.OPTIONAL)
        }
    }
    
    Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

    if (OldPin != OldValidPin) {
        Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

        Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('LinkageSaver/android.widget.Button - OK'), 2, FailureHandling.OPTIONAL)

        Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

        Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

        continue
    }
    
    Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

    for (int k = 0; k < pin.length(); k++) {
        if ((pin[k]) == ButtonPin0) {
            Mobile.tap(findTestObject('Neopay Transfer/android.widget.TextView - pin 0'), 5, FailureHandling.OPTIONAL)
        } else if ((pin[k]) == ButtonPin1) {
            Mobile.tap(findTestObject('Neopay Transfer/android.widget.TextView - pin 1'), 5, FailureHandling.OPTIONAL)
        } else if ((pin[k]) == ButtonPin2) {
            Mobile.tap(findTestObject('Neopay Transfer/android.widget.TextView - pin 2'), 5, FailureHandling.OPTIONAL)
        } else if ((pin[k]) == ButtonPin3) {
            Mobile.tap(findTestObject('Neopay Transfer/android.widget.TextView - pin 3'), 5, FailureHandling.OPTIONAL)
        } else if ((pin[k]) == ButtonPin4) {
            Mobile.tap(findTestObject('Neopay Transfer/android.widget.TextView - pin 4'), 5, FailureHandling.OPTIONAL)
        } else if ((pin[k]) == ButtonPin5) {
            Mobile.tap(findTestObject('Neopay Transfer/android.widget.TextView - pin 5'), 5, FailureHandling.OPTIONAL)
        } else if ((pin[k]) == ButtonPin6) {
            Mobile.tap(findTestObject('Neopay Transfer/android.widget.TextView - pin 6'), 5, FailureHandling.OPTIONAL)
        } else if ((pin[k]) == ButtonPin7) {
            Mobile.tap(findTestObject('Neopay Transfer/android.widget.TextView - pin 7'), 5, FailureHandling.OPTIONAL)
        } else if ((pin[k]) == ButtonPin8) {
            Mobile.tap(findTestObject('Neopay Transfer/android.widget.TextView - pin 8'), 5, FailureHandling.OPTIONAL)
        } else if ((pin[k]) == ButtonPin9) {
            Mobile.tap(findTestObject('Neopay Transfer/android.widget.TextView - pin 9'), 5, FailureHandling.OPTIONAL)
        }
    }
    
    Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

    for (int j = 0; j < KonfirmasiPin.length(); j++) {
        if ((KonfirmasiPin[j]) == ButtonPin0) {
            Mobile.tap(findTestObject('Neopay Transfer/android.widget.TextView - pin 0'), 5, FailureHandling.OPTIONAL)
        } else if ((KonfirmasiPin[j]) == ButtonPin1) {
            Mobile.tap(findTestObject('Neopay Transfer/android.widget.TextView - pin 1'), 5, FailureHandling.OPTIONAL)
        } else if ((KonfirmasiPin[j]) == ButtonPin2) {
            Mobile.tap(findTestObject('Neopay Transfer/android.widget.TextView - pin 2'), 5, FailureHandling.OPTIONAL)
        } else if ((KonfirmasiPin[j]) == ButtonPin3) {
            Mobile.tap(findTestObject('Neopay Transfer/android.widget.TextView - pin 3'), 5, FailureHandling.OPTIONAL)
        } else if ((KonfirmasiPin[j]) == ButtonPin4) {
            Mobile.tap(findTestObject('Neopay Transfer/android.widget.TextView - pin 4'), 5, FailureHandling.OPTIONAL)
        } else if ((KonfirmasiPin[j]) == ButtonPin5) {
            Mobile.tap(findTestObject('Neopay Transfer/android.widget.TextView - pin 5'), 5, FailureHandling.OPTIONAL)
        } else if ((KonfirmasiPin[j]) == ButtonPin6) {
            Mobile.tap(findTestObject('Neopay Transfer/android.widget.TextView - pin 6'), 5, FailureHandling.OPTIONAL)
        } else if ((KonfirmasiPin[j]) == ButtonPin7) {
            Mobile.tap(findTestObject('Neopay Transfer/android.widget.TextView - pin 7'), 5, FailureHandling.OPTIONAL)
        } else if ((KonfirmasiPin[j]) == ButtonPin8) {
            Mobile.tap(findTestObject('Neopay Transfer/android.widget.TextView - pin 8'), 5, FailureHandling.OPTIONAL)
        } else if ((KonfirmasiPin[j]) == ButtonPin9) {
            Mobile.tap(findTestObject('Neopay Transfer/android.widget.TextView - pin 9'), 5, FailureHandling.OPTIONAL)
        }
    }
    
    println('pin >>> ' + pin)

    println('KonfirmasiPin >>> ' + KonfirmasiPin)

    if (pin != KonfirmasiPin) {
        Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

        Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('LinkageSaver/android.widget.Button - OK'), 2, FailureHandling.OPTIONAL)

        Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

        Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

        continue
    }
    
    Mobile.tap(findTestObject('LinkageSaver/android.widget.Button - OK'), 2, FailureHandling.OPTIONAL)
}

