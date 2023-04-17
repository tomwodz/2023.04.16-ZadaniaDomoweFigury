package pl.comarch.it.camp.tomwodz.figures;

public class Czworokat extends Figures{

    public Czworokat(int id, double[] tab) {
        super(id, tab);
        this.name = getClass().getSimpleName();
        this.area = "Brak";//Double.toString(area());
        this.circuit = Double.toString(circuit());
    }

    public double circuit(){return super.circuit(tab);}

    public double area() {
        return 0;
    }

}
