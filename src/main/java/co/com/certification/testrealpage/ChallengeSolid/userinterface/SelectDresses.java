package co.com.certification.sophos.ChallengeSolid.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelectDresses
{
    public static final Target ScrollPicture = Target.the("Scroll picture").located(By.xpath("//span[@class=\"cat-name\"]"));
    public static final Target MoveMouseItem = Target.the("Click more").located(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img"));
    public static final Target MoveMouseMore = Target.the("Move mouse and click").located(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[2]/span"));
}
