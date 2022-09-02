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

Mobile.tap(findTestObject('Daftar/android.widget.TextView - Lewati (1)'), 5, FailureHandling.OPTIONAL)

TestData ExcelData = findTestData('LinkageLoadtestUAT')

System.out.println('[Row Count] : ' + ExcelData.getRowNumbers())

for (int i = 1; i <= ExcelData.getRowNumbers(); i++) {
    System.out.println('[data files phonenumber] : ' + ExcelData.getValue(6, i))

    Mobile.tap(findTestObject('LinkageSaver/android.widget.Button - Daftar'), 5, FailureHandling.OPTIONAL)

    Mobile.tap(findTestObject('LinkageSaver/android.widget.Button - Ya'), 5, FailureHandling.OPTIONAL)

    String NomorRekening = ExcelData.getValue(3, i)

    String NomorKartuDebit = ExcelData.getValue(4, i)

    String PinKartuDebit = ExcelData.getValue(5, i)

    String OTP = ExcelData.getValue(6, i)

    String Buatpin = ExcelData.getValue(7, i)

    String KonfirmasiPin = ExcelData.getValue(8, i)

    String Password = ExcelData.getValue(9, i)

    String KonfirmasiPassword = ExcelData.getValue(10, i)

    Mobile.setText(findTestObject('LinkageSaver/android.widget.EditText - Input Nomor rekening'), NomorRekening, 5, FailureHandling.OPTIONAL)

    //Mobile.tap(findTestObject('Linkage Saver(4)/XCUIElementTypeOther'), 0)
    String a = NomorKartuDebit.substring(0, 4)

    String b = NomorKartuDebit.substring(4, 8)

    String c = NomorKartuDebit.substring(8, 12)

    String d = NomorKartuDebit.substring(12, 16)

    Mobile.setText(findTestObject('LinkageSaver/android.widget.EditText - input kolom 1 No debit'), a, 5, FailureHandling.OPTIONAL)

    Mobile.setText(findTestObject('LinkageSaver/android.widget.EditText - input kolom 2 No debit'), b, 5, FailureHandling.OPTIONAL)

    Mobile.setText(findTestObject('LinkageSaver/android.widget.EditText - input kolom 3 No debit'), c, 5, FailureHandling.OPTIONAL)

    Mobile.setText(findTestObject('LinkageSaver/android.widget.EditText - input kolom 4 No debit'), d, 5, FailureHandling.OPTIONAL)

    String e = PinKartuDebit.substring(0)

    String f = PinKartuDebit.substring(1)

    String g = PinKartuDebit.substring(2)

    String h = PinKartuDebit.substring(3)

    String l = PinKartuDebit.substring(4)

    String o = PinKartuDebit.substring(5)

    Mobile.setText(findTestObject('LinkageSaver/android.widget.EditText- Input Pin Debit 1'), e, 5, FailureHandling.OPTIONAL)

    Mobile.setText(findTestObject('LinkageSaver/android.widget.EditText- Input Pin Debit 2'), f, 5, FailureHandling.OPTIONAL)

    Mobile.setText(findTestObject('LinkageSaver/android.widget.EditText- Input Pin Debit 3'), g, 5, FailureHandling.OPTIONAL)

    Mobile.setText(findTestObject('LinkageSaver/android.widget.EditText- Input Pin Debit 4'), h, 5, FailureHandling.OPTIONAL)

    Mobile.setText(findTestObject('LinkageSaver/android.widget.EditText- Input Pin Debit 5'), l, 5, FailureHandling.OPTIONAL)

    Mobile.setText(findTestObject('LinkageSaver/android.widget.EditText- Input Pin Debit 6'), o, 5, FailureHandling.OPTIONAL)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('LinkageSaver/android.widget.Button - Selanjutnya'), 5, FailureHandling.OPTIONAL)

    if ((((((NomorRekening.length() < 11) || NomorRekening.isEmpty()) || (NomorKartuDebit.length() < 16)) || NomorKartuDebit.isEmpty()) || 
    (PinKartuDebit.length() < 6)) || PinKartuDebit.isEmpty()) {
        Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

        Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

        Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('LinkageSaver/android.widget.Button - OK'), 5, FailureHandling.OPTIONAL)

        Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

//        Mobile.tap(findTestObject('LinkageSaver/android.widget.ImageView - back'), 5, FailureHandling.OPTIONAL)

        Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

        continue
    }
    
    boolean btnPopUp = Mobile.verifyElementVisible(findTestObject('LinkageSaver/android.widget.Button - OK'), 5, FailureHandling.OPTIONAL)

    if (btnPopUp) {
        //mobile tap ok
        Mobile.tap(findTestObject('LinkageSaver/android.widget.Button - OK'), 5, FailureHandling.OPTIONAL)

        Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

//        Mobile.tap(findTestObject('LinkageSaver/android.widget.ImageView - back'), 5, FailureHandling.OPTIONAL)

        Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

        continue
    }
    
    //println('KodeOTP ' + OTP)
    println('KodeOTP999999 ')

    Mobile.getText(findTestObject('LinkageSaver/android.widget.EditText - input OTP'), 5, FailureHandling.OPTIONAL)

    Mobile.setText(findTestObject('LinkageSaver/android.widget.EditText - input OTP'), OTP, 5, FailureHandling.OPTIONAL)

    Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

    Mobile.hideKeyboard()

    //Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
    //Mobile.getText(findTestObject('Register/New Folder (4)/XCUIElementTypeKey - 1'), 0)
    // Mobile.setText(findTestObject('Register/New Folder (4)/XCUIElementTypeKey - 1'), OTP, 0)
    Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

    if ((OTP.length() > 6) || (OTP != '999999')) {
        println('screenshot')

        println('KodeOTP8888888 ')

        Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('LinkageSaver/android.widget.Button - OK'), 5, FailureHandling.OPTIONAL)

//        Mobile.tap(findTestObject('LinkageSaver/android.widget.ImageView - back'), 5, FailureHandling.OPTIONAL)

        Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

        continue
    }
    
    println('PinDariExcel ' + Buatpin)

    String ButtonPin0 = Mobile.getText(findTestObject('TC007/android.widget.TextView - 0 pin'), 5, FailureHandling.OPTIONAL)

    String ButtonPin1 = Mobile.getText(findTestObject('TC007/android.widget.TextView - 1 pin'), 5, FailureHandling.OPTIONAL)

    String ButtonPin2 = Mobile.getText(findTestObject('TC007/android.widget.TextView - 2 pin'), 5, FailureHandling.OPTIONAL)

    String ButtonPin3 = Mobile.getText(findTestObject('TC007/android.widget.TextView - 3 pin'), 5, FailureHandling.OPTIONAL)

    String ButtonPin4 = Mobile.getText(findTestObject('TC007/android.widget.TextView - 4 pin'), 5, FailureHandling.OPTIONAL)

    String ButtonPin5 = Mobile.getText(findTestObject('TC007/android.widget.TextView - 5 pin'), 5, FailureHandling.OPTIONAL)

    String ButtonPin6 = Mobile.getText(findTestObject('TC007/android.widget.TextView - 6 pin'), 5, FailureHandling.OPTIONAL)

    String ButtonPin7 = Mobile.getText(findTestObject('TC007/android.widget.TextView - 7 pin'), 5, FailureHandling.OPTIONAL)

    String ButtonPin8 = Mobile.getText(findTestObject('TC007/android.widget.TextView - 8 pin'), 5, FailureHandling.OPTIONAL)

    String ButtonPin9 = Mobile.getText(findTestObject('TC007/android.widget.TextView - 9 pin'), 5, FailureHandling.OPTIONAL)

    println(ButtonPin1)

    println(ButtonPin2)

    println(ButtonPin3)

    for (int k = 0; k < Buatpin.length(); k++) {
        if ((Buatpin[k]) == ButtonPin0) {
            Mobile.tap(findTestObject('TC007/android.widget.TextView - 0 pin'), 5, FailureHandling.OPTIONAL)
        } else if ((Buatpin[k]) == ButtonPin1) {
            Mobile.tap(findTestObject('TC007/android.widget.TextView - 1 pin'), 5, FailureHandling.OPTIONAL)
        } else if ((Buatpin[k]) == ButtonPin2) {
            Mobile.tap(findTestObject('TC007/android.widget.TextView - 2 pin'), 5, FailureHandling.OPTIONAL)
        } else if ((Buatpin[k]) == ButtonPin3) {
            Mobile.tap(findTestObject('TC007/android.widget.TextView - 3 pin'), 5, FailureHandling.OPTIONAL)
        } else if ((Buatpin[k]) == ButtonPin4) {
            Mobile.tap(findTestObject('TC007/android.widget.TextView - 4 pin'), 5, FailureHandling.OPTIONAL)
        } else if ((Buatpin[k]) == ButtonPin5) {
            Mobile.tap(findTestObject('TC007/android.widget.TextView - 5 pin'), 5, FailureHandling.OPTIONAL)
        } else if ((Buatpin[k]) == ButtonPin6) {
            Mobile.tap(findTestObject('TC007/android.widget.TextView - 6 pin'), 5, FailureHandling.OPTIONAL)
        } else if ((Buatpin[k]) == ButtonPin7) {
            Mobile.tap(findTestObject('TC007/android.widget.TextView - 7 pin'), 5, FailureHandling.OPTIONAL)
        } else if ((Buatpin[k]) == ButtonPin8) {
            Mobile.tap(findTestObject('TC007/android.widget.TextView - 8 pin'), 5, FailureHandling.OPTIONAL)
        } else if ((Buatpin[k]) == ButtonPin9) {
            Mobile.tap(findTestObject('TC007/android.widget.TextView - 9 pin'), 5, FailureHandling.OPTIONAL)
        }
    }
    
    for (int j = 0; j < KonfirmasiPin.length(); j++) {
        if ((KonfirmasiPin[j]) == ButtonPin0) {
            Mobile.tap(findTestObject('TC007/android.widget.TextView - 0 pin'), 5, FailureHandling.OPTIONAL)
        } else if ((KonfirmasiPin[j]) == ButtonPin1) {
            Mobile.tap(findTestObject('TC007/android.widget.TextView - 1 pin'), 5, FailureHandling.OPTIONAL)
        } else if ((KonfirmasiPin[j]) == ButtonPin2) {
            Mobile.tap(findTestObject('TC007/android.widget.TextView - 2 pin'), 5, FailureHandling.OPTIONAL)
        } else if ((KonfirmasiPin[j]) == ButtonPin3) {
            Mobile.tap(findTestObject('TC007/android.widget.TextView - 3 pin'), 5, FailureHandling.OPTIONAL)
        } else if ((KonfirmasiPin[j]) == ButtonPin4) {
            Mobile.tap(findTestObject('TC007/android.widget.TextView - 4 pin'), 5, FailureHandling.OPTIONAL)
        } else if ((KonfirmasiPin[j]) == ButtonPin5) {
            Mobile.tap(findTestObject('TC007/android.widget.TextView - 5 pin'), 5, FailureHandling.OPTIONAL)
        } else if ((KonfirmasiPin[j]) == ButtonPin6) {
            Mobile.tap(findTestObject('TC007/android.widget.TextView - 6 pin'), 5, FailureHandling.OPTIONAL)
        } else if ((KonfirmasiPin[j]) == ButtonPin7) {
            Mobile.tap(findTestObject('TC007/android.widget.TextView - 7 pin'), 5, FailureHandling.OPTIONAL)
        } else if ((KonfirmasiPin[j]) == ButtonPin8) {
            Mobile.tap(findTestObject('TC007/android.widget.TextView - 8 pin'), 5, FailureHandling.OPTIONAL)
        } else if ((KonfirmasiPin[j]) == ButtonPin9) {
            Mobile.tap(findTestObject('TC007/android.widget.TextView - 9 pin'), 5, FailureHandling.OPTIONAL)
        }
    }
    
    if (Buatpin != KonfirmasiPin) {
        Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

//        Mobile.tap(findTestObject('LinkageSaver/android.widget.ImageView - back'), 0, FailureHandling.OPTIONAL)

        continue
    }
    
    Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

    //Mobile.tap(findTestObject('New Folder (3)/XCUIElementTypeButton - ic now eye closed'), 0, FailureHandling.OPTIONAL)
    Mobile.tap(findTestObject('Object Repository/LinkageSaver/android.widget.EditText - Password'), 0, FailureHandling.OPTIONAL)

    Mobile.setText(findTestObject('Object Repository/LinkageSaver/android.widget.EditText - Password'), Password, 0, FailureHandling.OPTIONAL)

    Mobile.hideKeyboard()

    //Mobile.scrollToText(KonfirmasiPassword, FailureHandling.OPTIONAL)
    Mobile.tap(findTestObject('Object Repository/LinkageSaver/android.widget.EditText - konfirmasi password'), 0, FailureHandling.OPTIONAL)

    Mobile.setText(findTestObject('Object Repository/LinkageSaver/android.widget.EditText - konfirmasi password'), KonfirmasiPassword, 
        0, FailureHandling.OPTIONAL)

    Mobile.hideKeyboard()

    //Mobile.tap(findTestObject('RegisterFirstDownloader/OR0012-ButtonMata'), 0, FailureHandling.OPTIONAL)
    //    Mobile.tap(findTestObject('RegisterFirstDownloader/OR004-ButtonDone'), 5, FailureHandling.OPTIONAL)
    Mobile.tap(findTestObject('Daftar/android.widget.Button - Lanjut (1)'), 5, FailureHandling.OPTIONAL)

    println('PasswordDariInput' + Password)

    println('PasswordDariExcel ' + Password)

    println(('ComparePassword' + Password) != KonfirmasiPassword)

    String password_pattern = '^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;,?/*~$^+=<>]).{8,16}$'

    Pattern pt = Pattern.compile(password_pattern)

    Matcher m1 = pt.matcher(Password)

    Matcher m2 = pt.matcher(KonfirmasiPassword)

    boolean p1 = m1.find()

    boolean p2 = m2.find()

    println('hasil p1 >>> ' + p1)

    println('hasil p2 >>> ' + p2)

    if (!(p1) || !(p2)) {
        Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

        continue
    }
    
    if (Password != KonfirmasiPassword) {
        Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

        continue
    }
    
    Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
	
    Mobile.tap(findTestObject('Object Repository/LinkageSaver/android.widget.Button - Lanjut'), 5, FailureHandling.OPTIONAL)
	
	Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
	
	Mobile.tap(findTestObject('Object Repository/LinkageSaver/android.widget.Button - Lanjut'), 5, FailureHandling.OPTIONAL)
	
	Mobile.tap(findTestObject('Object Repository/Now 420/TC-001/android.widget.Button - Nanti'), 5, FailureHandling.OPTIONAL)

    Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)
}

