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

Mobile.callTestCase(findTestCase('Savvy/6. Add favorit Nobu bank Account/TC006-Transfer Nobu Acount Call test'), [('NomorRekening') : ''
        , ('NominalTransfer') : '', ('pin') : ''], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('add favorit Neopay/android.widget.TextView - Transaksi Berhasil'), 5)

Mobile.tap(findTestObject('add favorit Neopay/android.widget.RelativeLayout - Tambah Ke favorit'), 5)

Mobile.tap(findTestObject('add favorit Neopay/android.widget.TextView - Berhasil ditambahkan ke Favorit'), 5)

Mobile.tap(findTestObject('add favorit Neopay/android.widget.Button - Lihat Favorit'), 5)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

