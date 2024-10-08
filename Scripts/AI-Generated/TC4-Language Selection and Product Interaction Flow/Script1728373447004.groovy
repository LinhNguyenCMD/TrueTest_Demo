import truetest.custom.TrueTestScripts
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on button LanguageDE"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_LanguageDE'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 2-Click on button LanguageDE.png')

"Step 3: Click on link languageSelection (LanguageES)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_languageSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_languageSelection', ['link_languageSelection_internalText': link_languageSelection_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 3-Click on link languageSelection LanguageES.png')

"Step 4: Click on button LanguageES"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_LanguageES'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 4-Click on button LanguageES.png')

"Step 5: Click on link languageSelection (LanguageTR)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_languageSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_languageSelection', ['link_languageSelection_internalText': link_languageSelection_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 5-Click on link languageSelection LanguageTR.png')

"Step 6: Click on link productItems (ProductThorHammer) -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_productItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_productItems', ['link_productItems_dataTest': link_productItems_dataTest, 'link_productItems_product_id': link_productItems_product_id]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 6-Click on link productItems ProductThorHammer - Navigate to page product.png')

"Step 7: Click on button favoritesCartActions (AddToCart)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_favoritesCartActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_favoritesCartActions', ['button_favoritesCartActions_dataTest': button_favoritesCartActions_dataTest]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 7-Click on button favoritesCartActions AddToCart.png')

"Step 8: Click on link MoreInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_MoreInfo'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 8-Click on link MoreInfo.png')

"Step 9: Click on button favoritesCartActions (AddToFavorites)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_favoritesCartActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_favoritesCartActions', ['button_favoritesCartActions_dataTest': button_favoritesCartActions_dataTest_1]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 9-Click on button favoritesCartActions AddToFavorites.png')

"Step 10: Click on button favoritesCartActions (AddToFavorites)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_favoritesCartActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_favoritesCartActions', ['button_favoritesCartActions_dataTest': button_favoritesCartActions_dataTest_2]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 10-Click on button favoritesCartActions AddToFavorites.png')

"Step 11: Click on link Cart -> Navigate to page '/checkout'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_Cart'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 11-Click on link Cart - Navigate to page checkout.png')

"Step 12: Click on link ThorHammerQuantity"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/link_ThorHammerQuantity'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 12-Click on link ThorHammerQuantity.png')

"Step 13: Click on fa ThorHammerQuantity"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/fa_ThorHammerQuantity'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 13-Click on fa ThorHammerQuantity.png')

"Step 14: Click on td QuantityCell"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/td_QuantityCell'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 14-Click on td QuantityCell.png')

"Step 15: Click on button LanguageTR -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_LanguageTR'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 15-Click on button LanguageTR - Navigate to page .png')

"Step 16: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Language Selection and Product Interaction Flow_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}