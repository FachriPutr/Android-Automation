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

Mobile.callTestCase(findTestCase('Lestari/5. Logout/TC005-login pin calltest'), [('pin') : ''], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Ganti Password/android.widget.ImageView - Side Bar'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Ganti Password/android.widget.TextView - Ubah Password'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

TestData ExcelData = findTestData('Savvy2/Change Password/DF002-Ganti Password')

System.out.println('[Row Count] : ' + ExcelData.getRowNumbers())

for (int i = 1; i <= ExcelData.getRowNumbers(); i++) {
    System.out.println('[data files phonenumber] : ' + ExcelData.getValue(3, i))

    String OldValidPassword = ExcelData.getValue(3, i)

    String OldPassword = ExcelData.getValue(4, i)

    String Password = ExcelData.getValue(5, i)

    String KonfirmasiPassword = ExcelData.getValue(6, i)

    Mobile.tap(findTestObject('Ganti Password/android.widget.EditText-Password Saat Ini'), 5, FailureHandling.OPTIONAL)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.setText(findTestObject('Ganti Password/android.widget.EditText-Password Saat Ini'), OldPassword, 5, FailureHandling.OPTIONAL)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

    Mobile.hideKeyboard()

    Mobile.tap(findTestObject('Ganti Password/android.widget.Button - Lanjut'), 5, FailureHandling.OPTIONAL)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

    println('PasswordDariInput ' + OldPassword)

    println('PasswordDariExcel ' + OldValidPassword)

    println('ComparePassword ' + (OldPassword != OldValidPassword))

    String password_pattern = '^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;,?/*~$^+=<>]).{8,16}$'

    Pattern Oldpt = Pattern.compile(password_pattern)

    Matcher Oldm1 = Oldpt.matcher(OldPassword)

    boolean Oldp1 = Oldm1.find()

    println('hasil p1 >>> ' + Oldp1)

    if (!(Oldp1)) {
        Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

        continue
    }
    
    if (OldPassword != OldValidPassword) {
        println('hasil OldPassword != OldValidPassword >>> ')

        Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

        Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Transfer Bank Nobu Account/android.widget.Button - OK'), 5, FailureHandling.OPTIONAL)

        Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

        continue
    }
    
    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)
	
	Mobile.tap(findTestObject('Transfer Bank Nobu Account/android.widget.Button - OK'), 5, FailureHandling.OPTIONAL)

    Mobile.tap(findTestObject('Ganti Password/android.widget.EditText - Password Baru'), 5, FailureHandling.OPTIONAL)

    Mobile.setText(findTestObject('Ganti Password/android.widget.EditText - Password Baru'), Password, 5, FailureHandling.OPTIONAL)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Ganti Password/android.widget.EditText - Konfirmasi Password'), 5, FailureHandling.OPTIONAL)

    Mobile.setText(findTestObject('Ganti Password/android.widget.EditText - Konfirmasi Password'), KonfirmasiPassword, 5, 
        FailureHandling.OPTIONAL)

    Mobile.hideKeyboard()

    Mobile.tap(findTestObject('Ganti Password/android.widget.Button - Lanjut'), 5, FailureHandling.OPTIONAL)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

    println('PasswordDariInput' + Password)

    println('PasswordDariExcel' + Password)

    println(('ComparePassword' + Password) != KonfirmasiPassword)

//    String password_pattern =('^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;,?/*~$^+=<>]).{8,16}$')
    Pattern pt = Pattern.compile(password_pattern)

    Matcher m1 = pt.matcher(Password)

    Matcher m2 = pt.matcher(KonfirmasiPassword)

    boolean p1 = m1.find()

    boolean p2 = m2.find()

    println('hasil p1 >>> ' + p1)

    println('hasil p2 >>> ' + p2)

    if (!(p1) || !(p2)) {
        Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)
		Mobile.tap(findTestObject('Transfer Bank Nobu Account/android.widget.Button - OK'), 5, FailureHandling.OPTIONAL)

        continue
    }
    
    if (Password != KonfirmasiPassword) {
        Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)
		Mobile.tap(findTestObject('Transfer Bank Nobu Account/android.widget.Button - OK'), 5, FailureHandling.OPTIONAL)

        continue
    }
    
    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Transfer Bank Nobu Account/android.widget.Button - OK'), 5, FailureHandling.OPTIONAL)
	
	Mobile.tap(findTestObject('LinkageSaver/android.widget.ImageView - button back'), 5, FailureHandling.OPTIONAL)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)
}

