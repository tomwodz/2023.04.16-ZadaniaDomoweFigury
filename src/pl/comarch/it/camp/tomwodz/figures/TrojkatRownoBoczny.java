package pl.comarch.it.camp.tomwodz.figures;

public class TrojkatRownoBoczny extends TrojkatRownoRamienny {

    public TrojkatRownoBoczny(int id, double[] tab) {
        super(id, tab);
        this.name = getClass().getSimpleName();
        this.area = Double.toString(area());
        this.circuit = Double.toString(circuit());
    }

}
