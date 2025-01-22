package com.co.demoqa.tasks;

import com.co.demoqa.models.Credentials;
import com.co.demoqa.userinterfaces.FormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class CompleteForm implements Task {

    Credentials credentials;

    public CompleteForm(Credentials credentials) {
        this.credentials = credentials;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FormPage.BTNELEMENTS),
                Click.on(FormPage.BTNFORMS),
                Click.on(FormPage.BTNPRACTICEFORM),
                Enter.theValue(credentials.getName()).into(FormPage.TXTFIRSTNAME),
                Enter.theValue(credentials.getLastname()).into(FormPage.TXTLASTNAME),
                Enter.theValue(credentials.getEmail()).into(FormPage.TXTEMAIL),
                Click.on(FormPage.IMPUTGENDER),
                Enter.theValue(credentials.getMobile()).into(FormPage.TXTNUMBER),
                Enter.theValue(credentials.getSubjects()).into(FormPage.TXTLANGUAGE).thenHit(Keys.ENTER),
                Click.on(FormPage.INPUTHOBBIES),
                Enter.theValue(credentials.getAddress()).into(FormPage.TXTADRESS),
                Click.on(FormPage.BTNSUBMIT)
        );
    }

    public static CompleteForm enterForm(Credentials credentials){
        return Tasks.instrumented(CompleteForm.class, credentials);
    }
}
