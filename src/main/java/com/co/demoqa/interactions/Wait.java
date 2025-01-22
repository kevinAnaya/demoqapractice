package com.co.demoqa.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class Wait implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static Wait waitOn(){

        return Tasks.instrumented(Wait.class);
    }
}
