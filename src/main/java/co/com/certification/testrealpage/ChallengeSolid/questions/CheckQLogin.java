package co.com.certification.sophos.ChallengeSolid.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Value;

import static co.com.certification.sophos.ChallengeSolid.userinterface.QuestionWeb.*;

public class CheckQLogin implements Question<Boolean>
{
    String word2;
    String word;

    public CheckQLogin(String word,String word2)
    {
        this.word2 = word2;
        this.word = word;
    }

    public static CheckQLogin is(String questionv,  String cantidad)
    {
        return new CheckQLogin(questionv, cantidad);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String text = Text.of(VerifyItems).viewedBy(actor).asString();
        String text1 = Value.of(VerifyStock).viewedBy(actor).asString();
        Boolean CheckerPag;
        CheckerPag = false;
        if (word.equals(text ) && (word2.equals(text1)))
        {
            CheckerPag = true;
        }

        return CheckerPag;
    }
}
