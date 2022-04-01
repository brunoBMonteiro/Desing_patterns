package estruturais.adapter;

import estruturais.adapter.adapters.SquarePegAdapters;
import estruturais.adapter.round.RoundHole;
import estruturais.adapter.round.RoundPeg;
import estruturais.adapter.square.SquarePeg;

/**
 * Em algum lugar no código do cliente...
 */
public class Demo {
    public static void main(String[] args) {
        // Redondo se encaixa redondo, nenhuma surpresa.
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)) {
            System.out.println("O pino redondo r5 se encaixa no furo redondo r5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);
        // buraco.fits(pequenoSqPeg); // Não compila.

        // Adaptador resolve o problema.
        SquarePegAdapters smallSqPegAdapter = new SquarePegAdapters(smallSqPeg);
        SquarePegAdapters largeSqPegAdapter = new SquarePegAdapters(largeSqPeg);
        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("O pino quadrado w2 se encaixa no furo redondo r5.");
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("O pino quadrado w20 não se encaixa no orifício redondo r5.");
        }
    }
}
