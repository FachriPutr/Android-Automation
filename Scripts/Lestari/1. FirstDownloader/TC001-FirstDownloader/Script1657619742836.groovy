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

Mobile.tap(findTestObject('Daftar/android.widget.TextView - Lewati (1)'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Daftar/android.widget.Button - Daftar (1)'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Daftar/android.widget.Button - Tidak-1 (1)'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Daftar/android.widget.Button - Tidak-2'), 0)

TestData ExcelData = findTestData('FirstDownloader/DF001-FirstDownlaoder')

System.out.println('[Row Count] : ' + ExcelData.getRowNumbers())

for (int i = 1; i <= ExcelData.getRowNumbers(); i++) {
    System.out.println('[data files phone number] : ' + ExcelData.getValue(3, i))

    String NomorHandphone = ExcelData.getValue(3, i)

    String AlamatEmail = ExcelData.getValue(4, i)

    String OTP = ExcelData.getValue(5, i)

    String NamaLengkap = ExcelData.getValue(6, i)

    String pin = ExcelData.getValue(7, i)

    String KonfirmasiPin = ExcelData.getValue(8, i)

    String Password = ExcelData.getValue(9, i)

    String KonfirmasiPassword = ExcelData.getValue(10, i)

    Mobile.tap(findTestObject('Daftar/android.widget.EditNomerHp'), 5, FailureHandling.OPTIONAL)

    Mobile.setText(findTestObject('Daftar/android.widget.EditNomerHp'), NomorHandphone, 5, FailureHandling.OPTIONAL)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Daftar/android.widget.EditTextEmail'), 5, FailureHandling.OPTIONAL)

    Mobile.setText(findTestObject('Daftar/android.widget.EditTextEmail'), AlamatEmail, 5, FailureHandling.OPTIONAL)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.hideKeyboard()

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('TC005/android.widget.Button - Selanjutnya'), 5, FailureHandling.OPTIONAL)

    println(' noHandphone >> ' + NomorHandphone)

    boolean textInvalidHP = Mobile.verifyElementVisible(findTestObject('Object Repository/Daftar/android.widget.TextView - Masukkan nomor handphone yang sesuai'), 
        5, FailureHandling.OPTIONAL)

    boolean textInvalidEmail = Mobile.verifyElementVisible(findTestObject('Object Repository/Daftar/android.widget.TextView - Masukkan format email yang sesuai'), 
        5, FailureHandling.OPTIONAL)

    println('invalidEmail >>> ' + textInvalidEmail)

    //Mobile.tap(findTestObject('RegisterFirstDownloader/OR004-ButtonDone'), 5, FailureHandling.OPTIONAL)
    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    if (textInvalidHP || textInvalidEmail) {
        println('screenshot')

        Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

        continue
    }
    
    boolean btnPopUp = Mobile.verifyElementVisible(findTestObject('Object Repository/Daftar/android.widget.Button - OK'), 
        5, FailureHandling.OPTIONAL)

    if (btnPopUp) {
        //mobile tap ok
        Mobile.tap(findTestObject('Object Repository/Daftar/android.widget.Button - OK'), 5, FailureHandling.OPTIONAL)

        Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

        Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

        //Mobile.tap(findTestObject('New Folder (6)/XCUIElementTypeButton - ic now back (1)'), 5, FailureHandling.OPTIONAL)
        //Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
        continue
    }
    
    Mobile.tap(findTestObject('Object Repository/Daftar/android.widget.EditTextOTP'), 5, FailureHandling.OPTIONAL)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.setText(findTestObject('Object Repository/Daftar/android.widget.EditTextOTP'), OTP, 5, FailureHandling.OPTIONAL)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    boolean btnPopUpOTP = Mobile.verifyElementVisible(findTestObject('Object Repository/Daftar/android.widget.Button - OK'), 
        5, FailureHandling.OPTIONAL)

    if (btnPopUpOTP) {
        //mobile tap ok
        Mobile.tap(findTestObject('Object Repository/Daftar/android.widget.Button - OK'), 5, FailureHandling.OPTIONAL)

        Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

        Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Object Repository/Daftar/android.widget.ImageView'), 5, FailureHandling.OPTIONAL)

        Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

        continue
    }
	
	println('FullName ' + NamaLengkap)
	
	Mobile.tap(findTestObject('Object Repository/Daftar/android.widget.EditTextNamaLengkap'), 5, FailureHandling.OPTIONAL)
	
    Mobile.setText(findTestObject('Object Repository/Daftar/android.widget.EditTextNamaLengkap'), NamaLengkap, 5, FailureHandling.OPTIONAL)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    String InputNama = Mobile.getText(findTestObject('Object Repository/Daftar/android.widget.EditTextNamaLengkap'), 5, 
        FailureHandling.OPTIONAL)

    println('NamaDariInput' + InputNama)

    println('NamaDariExcel ' + NamaLengkap)

    println(('CompareNama' + InputNama) != NamaLengkap)

    println('CompareNama2' + InputNama.equals(NamaLengkap))

    Pattern p = Pattern.compile('[^a-z ]', Pattern.CASE_INSENSITIVE)

    Matcher m = p.matcher(NamaLengkap)

    boolean b = m.find()

    if (b) {
        // next code
        Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

        continue
    }
	
		Mobile.hideKeyboard()
	
		Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
	
		Mobile.tap(findTestObject('TC005/android.widget.Button - Selanjutnya'), 5, FailureHandling.OPTIONAL)
		
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
			
			for (int j = 0; j < KonfirmasiPin.length(); j++) {
				if ((KonfirmasiPin[j]) == ButtonPin0) {
					Mobile.tap(findTestObject('Object Repository/TC007/android.widget.TextView - 0 pin'), 5, FailureHandling.OPTIONAL)
				} else if ((KonfirmasiPin[j]) == ButtonPin1) {
					Mobile.tap(findTestObject('Object Repository/TC007/android.widget.TextView - 1 pin'), 5, FailureHandling.OPTIONAL)
				} else if ((KonfirmasiPin[j]) == ButtonPin2) {
					Mobile.tap(findTestObject('Object Repository/TC007/android.widget.TextView - 2 pin'), 5, FailureHandling.OPTIONAL)
				} else if ((KonfirmasiPin[j]) == ButtonPin3) {
					Mobile.tap(findTestObject('Object Repository/TC007/android.widget.TextView - 3 pin'), 5, FailureHandling.OPTIONAL)
				} else if ((KonfirmasiPin[j]) == ButtonPin4) {
					Mobile.tap(findTestObject('Object Repository/TC007/android.widget.TextView - 4 pin'), 5, FailureHandling.OPTIONAL)
				} else if ((KonfirmasiPin[j]) == ButtonPin5) {
					Mobile.tap(findTestObject('Object Repository/TC007/android.widget.TextView - 5 pin'), 5, FailureHandling.OPTIONAL)
				} else if ((KonfirmasiPin[j]) == ButtonPin6) {
					Mobile.tap(findTestObject('Object Repository/TC007/android.widget.TextView - 6 pin'), 5, FailureHandling.OPTIONAL)
				} else if ((KonfirmasiPin[j]) == ButtonPin7) {
					Mobile.tap(findTestObject('Object Repository/TC007/android.widget.TextView - 7 pin'), 5, FailureHandling.OPTIONAL)
				} else if ((KonfirmasiPin[j]) == ButtonPin8) {
					Mobile.tap(findTestObject('Object Repository/TC007/android.widget.TextView - 8 pin'), 5, FailureHandling.OPTIONAL)
				} else if ((KonfirmasiPin[j]) == ButtonPin9) {
					Mobile.tap(findTestObject('Object Repository/TC007/android.widget.TextView - 9 pin'), 5, FailureHandling.OPTIONAL)
				}
			}
			
			Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)
		
			if (pin != KonfirmasiPin) {
				Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
		
				Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)
				
				Mobile.tap(findTestObject('Object Repository/Daftar/android.widget.ImageView'), 5, FailureHandling.OPTIONAL)
				
				Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
		
				continue
			}
			
				Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
			
				Mobile.tap(findTestObject('Object Repository/Daftar/android.widget.EditTextPassword'), 5, FailureHandling.OPTIONAL)
			
				Mobile.setText(findTestObject('Object Repository/Daftar/android.widget.EditTextPassword'), Password, 5, FailureHandling.OPTIONAL)
				
				Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
				
				Mobile.tap(findTestObject('Object Repository/Daftar/android.widget.EditTextKonfirmasiPassword'), 5, FailureHandling.OPTIONAL)
			
				Mobile.setText(findTestObject('Object Repository/Daftar/android.widget.EditTextKonfirmasiPassword'), KonfirmasiPassword,
					5, FailureHandling.OPTIONAL)
				
				Mobile.hideKeyboard()
				
				Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
				
				Mobile.tap(findTestObject('Object Repository/Daftar/android.widget.Button - Lanjut'), 5, FailureHandling.OPTIONAL)
				
					Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
				
					Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)
				
					println('PasswordDariInput' + Password)
				
					println('PasswordDariExcel ' + Password)
				
					println(('ComparePassword' + Password) != KonfirmasiPassword)
					
					
					String password_pattern = '^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;,?/*~$^+=<>]).{8,16}$';
					 
					Pattern pt = Pattern.compile(password_pattern);
					
					Matcher m1 = pt.matcher(Password);
					Matcher m2 = pt.matcher(KonfirmasiPassword);
					
					boolean p1 = m1.find();
					boolean p2 = m2.find();
					
					println("hasil p1 >>> "+ p1)
					println("hasil p2 >>> "+ p2)
					
					if(!p1 || !p2) {
						Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)
						
						continue
						
					}
				
					if (Password != KonfirmasiPassword) {
						Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)
				
						//Mobile.tap(findTestObject('Register/New Folder (7)/XCUIElementTypeButton - Lanjut'), 5, FailureHandling.OPTIONAL)
						//Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)
						continue
					}
					
					Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
					
					Mobile.tap(findTestObject('Object Repository/Daftar/android.widget.Button - Lanjut'), 5, FailureHandling.OPTIONAL)
					
					Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
					
					Mobile.tap(findTestObject('Object Repository/Now 420/TC-001/android.widget.Button - Nanti'), 5, FailureHandling.OPTIONAL)
					
					Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
					
		
					//driver.terminateApp('com.nobubank.nobuepay.walletsit')
}

