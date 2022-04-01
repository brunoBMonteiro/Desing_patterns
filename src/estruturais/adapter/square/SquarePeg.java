package estruturais.adapter.square;

/**
    Square Pegs não são compatíveis com Round Holes (eles foram implementados pela equipe
    de desenvolvimento anterior). Mas temos que integrá-los ao nosso programa.
 */
public class SquarePeg {
    private double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getSquare() {
        double result;
        result = Math.pow(this.width, 2);
        return result;
    }
}
