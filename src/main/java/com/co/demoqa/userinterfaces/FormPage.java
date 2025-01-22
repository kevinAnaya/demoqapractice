package com.co.demoqa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class FormPage {

    public static  final Target BTNELEMENTS = Target.the("elements")
            .locatedBy("//*[@id=\"app\"]/div/div/div/div[1]/div/div/div[1]/span/div");

    public static  final Target BTNFORMS = Target.the("forms")
            .locatedBy("//*[@id=\"app\"]/div/div/div/div[1]/div/div/div[2]/span/div");

    public static  final Target BTNPRACTICEFORM = Target.the("forms")
            .locatedBy("//*[@id=\"app\"]/div/div/div/div[1]/div/div/div[2]/div");

    public static  final Target TXTFIRSTNAME = Target.the("first name")
            .locatedBy("//input[@id=\"firstName\"]");

    public static  final Target TXTLASTNAME = Target.the("last name")
            .locatedBy("//input[@id=\"lastName\"]");

    public static  final Target TXTEMAIL = Target.the("email")
            .locatedBy("//input[@id=\"userEmail\"]");

    public static final Target IMPUTGENDER = Target.the("gender")
            .locatedBy("//label[@for=\"gender-radio-1\"]");

    public static final Target INPUTHOBBIES = Target.the("hobbies")
            .locatedBy("//label[@for=\"hobbies-checkbox-1\"]");

    public static  final Target TXTNUMBER = Target.the("namber")
            .locatedBy("//input[@id=\"userNumber\"]");

    //public static  final Target TXTLANGUAGE = Target.the("language") .locatedBy("//*[@id=\"subjectsContainer\"]/div/div[1]");

    public static  final Target TXTADRESS = Target.the("first name")
            .locatedBy("//textarea[@id=\"currentAddress\"]");


    public static  final Target BTNSUBMIT = Target.the("first name")
            .locatedBy("//button[@id=\"submit\"]");

    public static  final Target COMPARETEXT = Target.the("text")
            .locatedBy("//*[@id=\"example-modal-sizes-title-lg\"]");

}
