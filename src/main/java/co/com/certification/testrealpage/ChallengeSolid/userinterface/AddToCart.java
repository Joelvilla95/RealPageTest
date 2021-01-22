package co.com.certification.sophos.ChallengeSolid.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddToCart
{
    public static final Target ScrollAddToCart = Target.the("Scroll add to cart").located(By.xpath("//*[@id=\"center_column\"]/div/div/div[3]/h1"));
    public static final Target ClickAddToCart = Target.the("Click on add to cart").located(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
    public static final Target ClickProceedCheck = Target.the("Proceed to checkout").located(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span/i"));

}
