package NkUpdate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UpdateNaukariHome1 {

	@FindBy(xpath = "//div[@class='container dashboard']//div[@class='other-info-wrapper']//a[@href='/mnjuser/profile']")
	private WebElement updateBtn;
	@FindBy(xpath = "//div[@class='chatbot_DrawerContentWrapper']")
	private WebElement chatbot;
	@FindBy(xpath = "//div[@class='chatbot_DrawerContentWrapper']/div/div[contains(@class,'crossIcon')]")
	private WebElement closeChatbotBtn;

	public UpdateNaukariHome1(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void clickOnUpdateProfile(WebDriverWait wait) throws InterruptedException {
//		Thread.sleep(2000);
		
//		wait.until(ExpectedConditions.visibilityOf(chatbot));
//		
//		if (!chatbot.isDisplayed()) {
//			closeChatbotBtn.click();
//		} else {
			Thread.sleep(2000);
			updateBtn.click();
		//}
	}

}
