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

Mobile.tap(findTestObject('Transfer Bank Nobu Account/android.widget.LinearLayout - Button Transfer'), 0)

Mobile.tap(findTestObject('Transfer Bank Nobu Account/android.view.ViewGroup - Button Transfer Bank'), 0)

TestData ExcelData = findTestData('savvy/Transfer BiFast/DF005.4-Transfer BIFast')

System.out.println('[Row Count] : ' + ExcelData.getRowNumbers())

//int limitTrfMin = GlobalVariable.limitTrfMin
//
//int limitTrfMax = GlobalVariable.limitTrfMax
//
//int limitTrfMaxPlus = GlobalVariable.limitTrfMaxPlus
for (int i = 1; i <= ExcelData.getRowNumbers(); i++) {
    // System.out.println('[data files phonenumber] : ' + ExcelData.getValue(3, i))
    String NomorRekening = ExcelData.getValue(3, i)

    System.out.println('NomorRekening : ' + NomorRekening)

    int AmountTransfer = Integer.parseInt(ExcelData.getValue(4, i))

    String NominalTansfer = ExcelData.getValue(4, i)

    System.out.println('NominalTransfer : ' + NominalTansfer)

    String pin = ExcelData.getValue(5, i)

    System.out.println('pin : ' + pin)

    String BankTujuan = ExcelData.getValue(6, i)

    Mobile.scrollToText('Bank Tujuan', FailureHandling.OPTIONAL)

    Mobile.tap(findTestObject('Transfer Bank Nobu Account/android.widget.TextView - Pilih Bank Tujuan'), 5, FailureHandling.OPTIONAL)
	
	Mobile.tap(findTestObject('Object Repository/Transfer BIFast/android.widget.AutoCompleteTextView - Cari Bank Tujuan'), 0)
	
	Mobile.setText(findTestObject('Object Repository/Transfer BIFast/android.widget.AutoCompleteTextView - Cari Bank Tujuan (1)'),
		BankTujuan, 5, FailureHandling.OPTIONAL)
	
//	Mobile.tap(findTestObject('Object Repository/Transfer BIFast/android.widget.TextView - BANK DIGITAL BCA (1)'), 0)

//    Mobile.tap(findTestObject('Transfer BIFast/android.view.ViewGroup - Cari bank Tujuan'), 5, FailureHandling.OPTIONAL)
//
//    Mobile.setText(findTestObject('Transfer BIFast/android.view.ViewGroup - Cari bank Tujuan'), BankTujuan, 5, FailureHandling.OPTIONAL)

    Mobile.tap(findTestObject('Transfer BIFast/android.widget.TextView - BANK DIGITAL BCA'), 5, FailureHandling.OPTIONAL)

    //    Mobile.tap(findTestObject('Transfer Bank Nobu Account/android.view.ViewGroup - Bank Nobu'), 5, FailureHandling.OPTIONAL)
    Mobile.tap(findTestObject('Transfer Bank Nobu Account/android.widget.EditText - Input NO Rekening'), 5, FailureHandling.OPTIONAL)

    Mobile.setText(findTestObject('Transfer Bank Nobu Account/android.widget.EditText - Input NO Rekening'), NomorRekening, 
        5, FailureHandling.OPTIONAL)

    Mobile.hideKeyboard()

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Transfer Bank Nobu Account/android.widget.EditText - Input Nominal Transfer'), 5, FailureHandling.OPTIONAL)

    Mobile.setText(findTestObject('Transfer Bank Nobu Account/android.widget.EditText - Input Nominal Transfer'), NominalTansfer, 
        5, FailureHandling.OPTIONAL)

    Mobile.hideKeyboard()

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    //    Mobile.tap(findTestObject('Transfer Bank Nobu Account/android.view.ViewGroup - Pilih Tipe Transfer'), 5, FailureHandling.OPTIONAL)
    //
    //    Mobile.tap(findTestObject('Transfer Bank Nobu Account/android.widget.FrameLayout - BI Fast'), 5, FailureHandling.OPTIONAL)
    Mobile.scrollToText('Selanjutnya', FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Transfer Bank Nobu Account/android.widget.Button - Selanjutnya'), 5, FailureHandling.OPTIONAL)

    Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

    Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

    boolean btnPopUp = Mobile.verifyElementVisible(findTestObject('Transfer Bank Nobu Account/android.widget.Button - OK'), 
        5, FailureHandling.OPTIONAL)

    if (btnPopUp) {
        //mobile tap ok
        Mobile.tap(findTestObject('Transfer Bank Nobu Account/android.widget.Button - OK'), 5, FailureHandling.OPTIONAL)

        Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

        Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

        //Mobile.tap(findTestObject('New Folder (6)/XCUIElementTypeButton - ic now back (1)'), 5, FailureHandling.OPTIONAL)
        //Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
        continue
    }
    
    Mobile.tap(findTestObject('Transfer Neopay/android.widget.Button - Konfirmasi'), 5, FailureHandling.OPTIONAL)

    println('PinDariExcel ' + pin)

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

    println(ButtonPin1)

    println(ButtonPin2)

    println(ButtonPin3)

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
    
    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

    if (pin != 123456) {
        Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

        Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Transfer Bank Nobu Account/android.widget.Button - OK'), 2, FailureHandling.OPTIONAL)

        Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)
		
		Mobile.tap(findTestObject('Transfer Bank Nobu Account/android.widget.Button - Lihat Detail'), 2, FailureHandling.OPTIONAL)
		
		Mobile.scrollToText('Sembunyikan', FailureHandling.OPTIONAL)
		
		Mobile.tap(findTestObject('Transfer Bank Nobu Account/android.widget.Button - Sembunyikan Detail'), 5, FailureHandling.OPTIONAL)

        Mobile.tap(findTestObject('LinkageSaver/android.widget.ImageView - button back'), 0, FailureHandling.OPTIONAL)

        Mobile.pressBack()

        Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

        continue
    }
}

