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

"Step 2: Click on label handTools (hammer)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_handTools"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_handTools', ['label_handTools_internalText': label_handTools_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Click on label handTools hammer.png')

"Step 3: Click on checkbox categorySelection (categoryId)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/checkbox_categorySelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/checkbox_categorySelection', ['checkbox_categorySelection_dataTest': checkbox_categorySelection_dataTest]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on checkbox categorySelection categoryId.png')

"Step 4: Click on checkbox categorySelection (categoryId2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/checkbox_categorySelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/checkbox_categorySelection', ['checkbox_categorySelection_dataTest': checkbox_categorySelection_dataTest_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on checkbox categorySelection categoryId2.png')

"Step 5: Click on link productDetails (product01J912Hfj8Hwacjhvxhbe9Hrh5) -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_productDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_productDetails', ['link_productDetails_dataTest': link_productDetails_dataTest, 'link_productDetails_product_id': link_productDetails_product_id]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on link productDetails product01J912Hfj8Hwacjhvxhbe9Hrh5 - Navigate to page product.png')

"Step 6: Click on fa quantityControl (increaseQuantity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/fa_quantityControl"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/fa_quantityControl', ['fa_quantityControl_dataTest': fa_quantityControl_dataTest]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on fa quantityControl increaseQuantity.png')

"Step 7: Click on fa quantityControl (decreaseQuantity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/fa_quantityControl"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/fa_quantityControl', ['fa_quantityControl_dataTest': fa_quantityControl_dataTest_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on fa quantityControl decreaseQuantity.png')

"Step 8: Click on fa quantityControl (decreaseQuantity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/fa_quantityControl"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/fa_quantityControl', ['fa_quantityControl_dataTest': fa_quantityControl_dataTest_2]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on fa quantityControl decreaseQuantity.png')

"Step 9: Click on button increaseQuantity"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_increaseQuantity'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on button increaseQuantity.png')

"Step 10: Click on button increaseQuantity"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_increaseQuantity'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Click on button increaseQuantity.png')

"Step 11: Click on button cartActions (addToFavourites)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_cartActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_cartActions', ['button_cartActions_dataTest': button_cartActions_dataTest]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Click on button cartActions addToFavourites.png')

"Step 12: Click on button cartActions (addToCart)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_cartActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_cartActions', ['button_cartActions_dataTest': button_cartActions_dataTest_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Click on button cartActions addToCart.png')

"Step 13: Click on link moreInformation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_moreInformation'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 13-Click on link moreInformation.png')

"Step 14: Click on link checkout -> Navigate to page '/checkout'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_checkout'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 14-Click on link checkout - Navigate to page checkout.png')

"Step 15: Click on input quantityForAdjustableWrench"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/input_quantityForAdjustableWrench'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 15-Click on input quantityForAdjustableWrench.png')

"Step 16: Enter input value in input quantityForAdjustableWrench"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/input_quantityForAdjustableWrench'), input_quantityForAdjustableWrench)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 16-Enter input value in input quantityForAdjustableWrench.png')

"Step 17: Click on aw step itemQuantityPriceTotal"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/aw_step_itemQuantityPriceTotal'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 17-Click on aw step itemQuantityPriceTotal.png')

"Step 18: Click on aw step itemQuantityPriceTotal"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/aw_step_itemQuantityPriceTotal'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 18-Click on aw step itemQuantityPriceTotal.png')

"Step 19: Click on span object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/span_object'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 19-Click on span object.png')

"Step 20: Click on td object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/td_object'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 20-Click on td object.png')

"Step 21: Click on td object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/td_object'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 21-Click on td object.png')

"Step 22: Click on button proceedToCheckout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 22-Click on button proceedToCheckout.png')

"Step 23: Login into Application"

TrueTestScripts.login()

"Step 24: Click on fa navCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/fa_navCart'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 24-Click on fa navCart.png')

"Step 25: Click on fa navCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/fa_navCart'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 25-Click on fa navCart.png')

"Step 26: Click on link checkout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/link_checkout'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 26-Click on link checkout.png')

"Step 27: Click on link categories"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/link_categories'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 27-Click on link categories.png')

"Step 28: Click on link handTools -> Navigate to page 'category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/link_handTools'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 28-Click on link handTools - Navigate to page category.png')

"Step 29: Click on link product01J912Hfethf1T3Xes6H5Bkk98 -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_product01J912Hfethf1T3Xes6H5Bkk98'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 29-Click on link product01J912Hfethf1T3Xes6H5Bkk98 - Navigate to page product.png')

"Step 30: Click on link home -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_home'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 30-Click on link home - Navigate to page .png')

"Step 31: Click on div filters"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_filters'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 31-Click on div filters.png')

"Step 32: Click on checkbox categorySelection (categoryId3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/checkbox_categorySelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/checkbox_categorySelection', ['checkbox_categorySelection_dataTest': checkbox_categorySelection_dataTest_2]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 32-Click on checkbox categorySelection categoryId3.png')

"Step 33: Click on span sliderMax"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_sliderMax'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 33-Click on span sliderMax.png')

"Step 34: Click on span sliderMax"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_sliderMax'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 34-Click on span sliderMax.png')

"Step 35: Click on span sliderMax"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_sliderMax'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 35-Click on span sliderMax.png')

"Step 36: Click on fa priceRange"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/fa_priceRange'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 36-Click on fa priceRange.png')

"Step 37: Click on label toolBrands (forgeFlexTools)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_toolBrands"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_toolBrands', ['label_toolBrands_internalText': label_toolBrands_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 37-Click on label toolBrands forgeFlexTools.png')

"Step 38: Click on label toolBrands (mightyCraftHardware)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_toolBrands"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_toolBrands', ['label_toolBrands_internalText': label_toolBrands_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 38-Click on label toolBrands mightyCraftHardware.png')

"Step 39: Click on label handTools (toolBelts) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_handTools"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_handTools', ['label_handTools_internalText': label_handTools_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 39-Click on label handTools toolBelts - Navigate to page .png')

"Step 40: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Search and Adjust Quantity of Hand Tools in Tool Kit_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}