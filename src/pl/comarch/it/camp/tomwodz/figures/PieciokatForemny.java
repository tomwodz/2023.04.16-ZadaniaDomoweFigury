package pl.comarch.it.camp.tomwodz.figures;

public class PieciokatForemny extends Pieciokat{

    public PieciokatForemny(int id, double[] tab) {
        super(id, tab);
        this.name = getClass().getSimpleName();
        this.area = Double.toString(area());
        this.circuit = Double.toString(circuit());
    }

    public double circuit(){return super.circuit(tab);}

    public double area() {
        return (Math.pow(tab[0],2))/4 * Math.sqrt(25 + 10 * Math.sqrt(5));
    }

}
