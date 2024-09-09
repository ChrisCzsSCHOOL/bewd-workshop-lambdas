package nl.han.bewd.lambdas.reis;

public class GravitySlingshotStrategy implements VervoerStrategy {
    @Override
    public int berekenReistijd(boolean isReisTijdensSpits) {
        return 1; //  veel sneller dan fiets, spits maakt niks uit.
    }
}
