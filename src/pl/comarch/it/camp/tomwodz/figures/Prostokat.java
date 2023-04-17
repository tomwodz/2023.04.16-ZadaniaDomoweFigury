package pl.comarch.it.camp.tomwodz.figures;

import java.util.Arrays;

public class Prostokat extends Figures{

    public Prostokat(int id, double[] tab) {
        super(id, tab);
        this.name = getClass().getSimpleName();
        this.area = Double.toString(area());
        this.circuit = Double.toString(circuit());
    }

    public double circuit(){return super.circuit(tab);}

    public double area() {
        Arrays.sort(tab);
        return tab[0] * tab[2];
    }

}
