public class Triangolo implements Forma {
    private double base;
    private double altezza;
    public Triangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }
    @Override
    public void calcolaArea() {
        System.out.println("Area triangolo: " + (base * altezza) / 2);
    }
}
