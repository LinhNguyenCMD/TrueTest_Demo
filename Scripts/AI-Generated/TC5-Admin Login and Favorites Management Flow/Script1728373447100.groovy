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

"Step 2: Click on button LanguageTR"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_LanguageTR'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 2-Click on button LanguageTR.png')

"Step 3: Click on link languageSelection (LanguageEN)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_languageSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_languageSelection', ['link_languageSelection_internalText': link_languageSelection_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 3-Click on link languageSelection LanguageEN.png')

"Step 4: Click on link SignIn2 -> Navigate to page 'auth/login'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_SignIn2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 4-Click on link SignIn2 - Navigate to page authlogin.png')

"Step 5: Login into Application"

TrueTestScripts.login()

"Step 6: Click on link Home -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_dashboard/link_Home'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 6-Click on link Home - Navigate to page .png')

"Step 7: Click on link productItems (ProductCombinationPliers) -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_productItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_productItems', ['link_productItems_dataTest': link_productItems_dataTest, 'link_productItems_product_id': link_productItems_product_id]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 7-Click on link productItems ProductCombinationPliers - Navigate to page product.png')

"Step 8: Click on fa IncreaseQuantity"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/fa_IncreaseQuantity'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 8-Click on fa IncreaseQuantity.png')

"Step 9: Click on button favoritesCartActions (AddToFavorites2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_favoritesCartActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_favoritesCartActions', ['button_favoritesCartActions_dataTest': button_favoritesCartActions_dataTest]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 9-Click on button favoritesCartActions AddToFavorites2.png')

"Step 10: Click on link Categories"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_Categories'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 10-Click on link Categories.png')

"Step 11: Click on button LanguageEN"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_LanguageEN'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 11-Click on button LanguageEN.png')

"Step 12: Click on div HomeCategories"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_HomeCategories'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 12-Click on div HomeCategories.png')

"Step 13: Click on link SignIn -> Navigate to page 'auth/login'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_SignIn'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 13-Click on link SignIn - Navigate to page authlogin.png')

"Step 14: Login into Application"

TrueTestScripts.login()

"Step 15: Click on link Favorites -> Navigate to page 'account/favorites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/account?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_account/link_Favorites'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 15-Click on link Favorites - Navigate to page accountfavorites.png')

"Step 16: Click on button DeleteFavorite"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/account/favorites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_account_favorites/button_DeleteFavorite'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 16-Click on button DeleteFavorite.png')

"Step 17: Click on link Home -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/account/favorites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_account_favorites/link_Home'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 17-Click on link Home - Navigate to page .png')

"Step 18: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Admin Login and Favorites Management Flow_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}