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

Mobile.tap(findTestObject('Object Repository/transfer via SKN RTOL RTGS/android.view.ViewGroup - bank'), 0)

Mobile.tap(findTestObject('Object Repository/transfer via SKN RTOL RTGS/android.widget.TextView - Pilih Bank Tujuan'), 0)

Mobile.tap(findTestObject('Object Repository/transfer via SKN RTOL RTGS/android.widget.TextView - BANK BNI'), 0)

Mobile.setText(findTestObject('Object Repository/transfer via SKN RTOL RTGS/android.widget.EditText -rekening tujuan Cth 1234567890'), 
    '123456789', 0)

Mobile.setText(findTestObject('Object Repository/transfer via SKN RTOL RTGS/android.widget.EditText - nominal transfer'), 
    '90000000', 0)

Mobile.tap(findTestObject('Object Repository/transfer via SKN RTOL RTGS/android.widget.TextView - Lihat Semua sumber dana'), 
    0)

Mobile.tap(findTestObject('Object Repository/transfer via SKN RTOL RTGS/android.view.ViewGroup - sumber dana payroll'), 
    0)

Mobile.tap(findTestObject('Object Repository/transfer via SKN RTOL RTGS/android.view.ViewGroup - sumber dana giro'), 0)

Mobile.tap(findTestObject('Object Repository/transfer via SKN RTOL RTGS/android.view.ViewGroup - sumber dana Nobu ( tabungan utama )'), 
    0)

Mobile.tap(findTestObject('Object Repository/transfer via SKN RTOL RTGS/android.widget.Button - Simpan Perubahan'), 0)

Mobile.tap(findTestObject('Object Repository/transfer via SKN RTOL RTGS/android.widget.TextView -tiper transfer'), 0)

Mobile.tap(findTestObject('transfer via SKN RTOL RTGS/android.widget.ImageView - tombol X Pilih tipe transfer'), 0)

Mobile.setText(findTestObject('Object Repository/transfer via SKN RTOL RTGS/android.widget.EditText - nominal transfer'),
	'200000000', 0)

//Mobile.tap(findTestObject('Object Repository/transfer via SKN RTOL RTGS/android.view.ViewGroup - Bi fast'), 0)
//Mobile.tap(findTestObject('Object Repository/transfer via SKN RTOL RTGS/android.view.ViewGroup - RTOL'), 0)
//Mobile.tap(findTestObject('Object Repository/transfer via SKN RTOL RTGS/android.view.ViewGroup - SKN'), 0)

Mobile.tap(findTestObject('Object Repository/transfer via SKN RTOL RTGS/android.view.ViewGroup - RTGS'), 0)

Mobile.scrollToText('Selanjutnya')

Mobile.tap(findTestObject('Object Repository/transfer via SKN RTOL RTGS/android.widget.Button - Selanjutnya'), 0)

Mobile.tap(findTestObject('Object Repository/transfer via SKN RTOL RTGS/android.widget.TextView - laman Konfirmasi Transfer'), 
    0)

Mobile.tap(findTestObject('Object Repository/transfer via SKN RTOL RTGS/android.widget.Button - Konfirmasi'), 0)

for (int i = 1; i < 7; i++) {
    Mobile.tap(findTestObject('Object Repository/transfer via SKN RTOL RTGS/android.widget.TextView - 1'), 0)
}

Mobile.tap(findTestObject('Object Repository/transfer via SKN RTOL RTGS/android.widget.TextView - Transaksi Berhasil'), 
    0)

Mobile.tap(findTestObject('Object Repository/transfer via SKN RTOL RTGS/android.widget.ImageView - tombol X'), 0)

Mobile.closeApplication()

