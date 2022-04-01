package estruturais.adapter.adapters;

import estruturais.adapter.round.RoundPeg;
import estruturais.adapter.square.SquarePeg;

/**
 * Adaptador permite encaixar pinos quadrados em furos redondos.
 */
public class SquarePegAdapters extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapters(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result;
        // Calcule um raio de círculo mínimo, que pode caber neste pino.
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}