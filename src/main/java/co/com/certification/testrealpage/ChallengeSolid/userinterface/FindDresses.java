package co.com.certification.sophos.ChallengeSolid.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FindDresses
{
    public static final Target MoveMouseDresses = Target.the("Move Mouse Dresses").located(By.xpath("(//a[@class=\"sf-with-ul\"])[4]"));
    public static final Target MoveMouseEveningD = Target.the("Move mouse evening dresses").located(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[2]/a"));


}
