package pl.comarch.it.camp.tomwodz.figures;

import java.util.Arrays;

public class Kolo extends Figures {

    public Kolo(int id, double[] tab) {
        super(id, tab);
        this.name = getClass().getSimpleName();
        this.area = Double.toString(area());
        this.circuit = Double.toString(circuit());
    }

    public double circuit() {
        return 2 * Math.PI * tab[0];
    }

    public double area() {
        return Math.pow(tab[0], 2) * Math.PI;
    }

    public Kolo() {
    }
}
