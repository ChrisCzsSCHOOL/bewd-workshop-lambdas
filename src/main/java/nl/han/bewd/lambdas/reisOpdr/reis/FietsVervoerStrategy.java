package nl.han.bewd.lambdas.reisOpdr.reis;

// Fietsend maakt het niet uit of het spits is.
public class FietsVervoerStrategy implements VervoerStrategy {
    @Override
    public int berekenReistijd(boolean isReisTijdensSpits) {
        return 40;
    }
}
