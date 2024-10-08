import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on link productDetails (product01J912Hffqhpregzkrs9Hw6Er2) -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_productDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_productDetails', ['link_productDetails_dataTest': link_productDetails_dataTest, 'link_productDetails_product_id': link_productDetails_product_id]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 2-Click on link productDetails product01J912Hffqhpregzkrs9Hw6Er2 - Navigate to page product.png')

"Step 3: Click on link pliersMoreInformation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_pliersMoreInformation'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 3-Click on link pliersMoreInformation.png')

"Step 4: Click on button cartActions (addToFavourites)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_cartActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_cartActions', ['button_cartActions_dataTest': button_cartActions_dataTest]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Click on button cartActions addToFavourites.png')

"Step 5: Click on div unauthorizedToast"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_unauthorizedToast'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 5-Click on div unauthorizedToast.png')

"Step 6: Click on button languageEn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_languageEn'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 6-Click on button languageEn.png')

"Step 7: Click on link languageSelection (languageEn)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_languageSelection'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 7-Click on link languageSelection languageEn.png')

"Step 8: Click on button languageEn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_languageEn'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 8-Click on button languageEn.png')

"Step 9: Click on link languageSelection (languageFr)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/link_languageSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_languageSelection', ['link_languageSelection_internalText': link_languageSelection_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 9-Click on link languageSelection languageFr.png')

"Step 10: Click on div pliersForgeFlexTools"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_pliersForgeFlexTools'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 10-Click on div pliersForgeFlexTools.png')

"Step 11: Click on button languageFr"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_languageFr'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 11-Click on button languageFr.png')

"Step 12: Click on link languageSelection (languageTr)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/link_languageSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_languageSelection', ['link_languageSelection_internalText': link_languageSelection_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 12-Click on link languageSelection languageTr.png')

"Step 13: Click on p productDescription"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/p_productDescription'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 13-Click on p productDescription.png')

"Step 14: Click on button languageTr"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_languageTr'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 14-Click on button languageTr.png')

"Step 15: Click on link languageSelection (languageDe)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/link_languageSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_languageSelection', ['link_languageSelection_internalText': link_languageSelection_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 15-Click on link languageSelection languageDe.png')

"Step 16: Click on link home -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_home'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 16-Click on link home - Navigate to page .png')

"Step 17: Click on link navigation (nextPage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_navigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_navigation', ['link_navigation_internalLabel': link_navigation_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 17-Click on link navigation nextPage.png')

"Step 18: Click on link pageNavigation (page5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_pageNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_pageNavigation', ['link_pageNavigation_internalLabel': link_pageNavigation_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 18-Click on link pageNavigation page5.png')

"Step 19: Click on item nextPage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/item_nextPage'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 19-Click on item nextPage.png')

"Step 20: Click on link pageNavigation (page3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_pageNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_pageNavigation', ['link_pageNavigation_internalLabel': link_pageNavigation_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 20-Click on link pageNavigation page3.png')

"Step 21: Click on link navigation (previousPage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_navigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_navigation', ['link_navigation_internalLabel': link_navigation_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 21-Click on link navigation previousPage.png')

"Step 22: Click on link pageNavigation (page1)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_pageNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_pageNavigation', ['link_pageNavigation_internalLabel': link_pageNavigation_internalLabel_2]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 22-Click on link pageNavigation page1.png')

"Step 23: Click on link pageNavigation (page1)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_pageNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_pageNavigation', ['link_pageNavigation_internalLabel': link_pageNavigation_internalLabel_3]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 23-Click on link pageNavigation page1.png')

"Step 24: Click on label toolBrands (QA AUTO 2k5UC)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_toolBrands"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_toolBrands', ['label_toolBrands_internalText': label_toolBrands_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 24-Click on label toolBrands QA AUTO 2k5UC.png')

"Step 25: Click on label toolBrands (QA AUTO 2k5UC)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_toolBrands"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_toolBrands', ['label_toolBrands_internalText': label_toolBrands_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 25-Click on label toolBrands QA AUTO 2k5UC.png')

"Step 26: Click on label handTools (hammer)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_handTools"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_handTools', ['label_handTools_internalText': label_handTools_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 26-Click on label handTools hammer.png')

"Step 27: Click on label handTools (handSaw)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_handTools"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_handTools', ['label_handTools_internalText': label_handTools_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 27-Click on label handTools handSaw.png')

"Step 28: Click on label handTools (hammer)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_handTools"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_handTools', ['label_handTools_internalText': label_handTools_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 28-Click on label handTools hammer.png')

"Step 29: Click on label handTools (chisels)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_handTools"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_handTools', ['label_handTools_internalText': label_handTools_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 29-Click on label handTools chisels.png')

"Step 30: Click on label handTools (handSaw)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_handTools"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_handTools', ['label_handTools_internalText': label_handTools_internalText_4]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 30-Click on label handTools handSaw.png')

"Step 31: Click on label handTools (handSaw)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_handTools"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_handTools', ['label_handTools_internalText': label_handTools_internalText_5]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 31-Click on label handTools handSaw.png')

"Step 32: Click on checkbox categorySelection (categoryId4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/checkbox_categorySelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/checkbox_categorySelection', ['checkbox_categorySelection_dataTest': checkbox_categorySelection_dataTest]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 32-Click on checkbox categorySelection categoryId4.png')

"Step 33: Click on link productDetails (product01J912Hfksbtp1Nyp1T62Jscv2) -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_productDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_productDetails', ['link_productDetails_dataTest': link_productDetails_dataTest_1, 'link_productDetails_product_id': link_productDetails_product_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 33-Click on link productDetails product01J912Hfksbtp1Nyp1T62Jscv2 - Navigate to page product.png')

"Step 34: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Explore Product Details and Language Options for Hand Tools_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}