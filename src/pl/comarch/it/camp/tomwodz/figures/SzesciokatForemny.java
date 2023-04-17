package pl.comarch.it.camp.tomwodz.figures;

public class SzesciokatForemny extends Pieciokat{

    public SzesciokatForemny(int id, double[] tab) {
        super(id, tab);
        this.name = getClass().getSimpleName();
        this.area = Double.toString(area());
        this.circuit = Double.toString(circuit());
    }

    public double circuit(){return super.circuit(tab);}

    public double area() {
        return (3 * Math.pow(tab[0],2) * Math.sqrt(3)) / 2;
    }

}
