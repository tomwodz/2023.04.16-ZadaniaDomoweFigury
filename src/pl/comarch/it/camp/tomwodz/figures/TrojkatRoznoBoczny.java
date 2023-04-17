package pl.comarch.it.camp.tomwodz.figures;

public class TrojkatRoznoBoczny extends Figures {

    public TrojkatRoznoBoczny(int id,  double[] tab) {
        super(id, tab);
        this.name = getClass().getSimpleName();
        this.area = Double.toString(area());
        this.circuit = Double.toString(circuit());
    }

    public double circuit(){
        return super.circuit(tab);
    }
    public double area(){
        double p = super.circuit(tab);
        double area = Math.sqrt((p * (p-tab[0]) * (p-tab[1]) * (p-tab[2])));
        return area;
    }

    public TrojkatRoznoBoczny() {
    }
}
