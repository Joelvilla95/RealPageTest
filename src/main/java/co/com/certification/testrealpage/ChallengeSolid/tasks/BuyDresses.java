package co.com.certification.sophos.ChallengeSolid.tasks;

import co.com.certification.sophos.ChallengeSolid.userinterface.AddToCart;
import co.com.certification.sophos.ChallengeSolid.userinterface.FindDresses;
import co.com.certification.sophos.ChallengeSolid.userinterface.QuestionWeb;
import co.com.certification.sophos.ChallengeSolid.userinterface.SelectDresses;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Scroll;

public class BuyDresses implements Task
{

    public static BuyDresses WebSite() {
        return Tasks.instrumented(BuyDresses.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
                MoveMouse.to(FindDresses.MoveMouseDresses),
                MoveMouse.to(FindDresses.MoveMouseEveningD).andThen((actions -> actions.click() )),
                Scroll.to(SelectDresses.ScrollPicture),
                MoveMouse.to(SelectDresses.MoveMouseItem),
                MoveMouse.to(SelectDresses.MoveMouseMore).andThen((actions -> actions.click())),
                Scroll.to(AddToCart.ScrollAddToCart),
                Click.on(AddToCart.ClickAddToCart),
                Click.on(AddToCart.ClickProceedCheck),
                Scroll.to(QuestionWeb.ScrollFinalPage)

        );
    }
}
