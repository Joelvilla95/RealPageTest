package co.com.certification.sophos.ChallengeSolid.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class QuestionWeb
{
    public static final Target ScrollFinalPage = Target.the("Scroll final page").located(By.id("cart_title"));
    public static final Target VerifyItems = Target.the("Verify Items").located(By.id("total_price"));
    public static final Target VerifyStock = Target.the("VerifyStock").located(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr/td[5]/input[2]"));

}
