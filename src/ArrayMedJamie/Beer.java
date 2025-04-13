package ArrayMedJamie;

public class Beer {
    private String navn; //attributten
    private double alkoholProcent;
    private double pris;

    public Beer(String navn, double alkoholProcent, double pris) { //Parametre
        this.navn = navn;
        setAlkoholProcent(alkoholProcent);
        this.pris = pris; // this refererer til attributten og ikke til parameteren

    }

    public double getAlkoholProcent() {
        return alkoholProcent;
    }

    public void setAlkoholProcent(double alkoholProcent) {
        if (alkoholProcent < 0){
            this.alkoholProcent = 0;
        } else if (alkoholProcent > 100){
            this.alkoholProcent = 100;
        } else {
            this.alkoholProcent = alkoholProcent;
        }
    }

    @Override
    public String toString() {
        return "Beer{" +
                "navn='" + navn + '\'' +
                ", alkoholProcent=" + alkoholProcent +
                ", pris=" + pris +
                '}';
    }
}
