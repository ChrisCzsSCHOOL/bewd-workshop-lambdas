package nl.han.bewd.lambdas.reisOpdr;

import nl.han.bewd.lambdas.reisOpdr.reis.*;

public class Main {
    /*
    Een Reis wordt gemaakt met een enkel vervoermiddel. De reistijd kan door middel van een simulatie van de
    reis worden berekend. Hierbij kan onderscheid gemaakt worden of de reis tijdens de spits of buiten de spits is.
     */
    public static void main(String[] args) {
        System.out.println("Buiten spits met fiets");
        Reis mijnReis = new Reis(false);
        VervoerStrategy vervoer = new GravitySlingshotStrategy();

        VervoerStrategy slingshotVervoer = (isReisTijdensSpits) -> {
            if (isReisTijdensSpits) {
                return 2;
            } else {
                return 1;
            }
        };
        mijnReis.simuleerReis(slingshotVervoer);

        System.out.println("Tijdens de spits");
        mijnReis.setSpits(true);
        mijnReis.simuleerReis(slingshotVervoer);                // Met de Gravity slingshot.
        mijnReis.simuleerReis(new AutoVervoerStrategy());      // Met de auto.
        mijnReis.simuleerReis(new OVVervoerStrategy());        // Met het ov.
        mijnReis.simuleerReis(new FietsVervoerStrategy());     // Met de Fiets.

        System.out.println("Met <nieuw> vervoer (Stap 2)  ");
        System.out.println("TODO:");

        System.out.println("Met <nieuw> vervoer, lambda edition! (Stap 5)");
        System.out.println("TODO:");
    }
}