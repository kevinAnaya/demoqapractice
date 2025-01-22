package com.co.demoqa.questions;

import com.co.demoqa.userinterfaces.FormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class CompareText implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(FormPage.COMPARETEXT).viewedBy(actor).asString();
    }

    public static CompareText compare(){
        return new CompareText();
    }
}
