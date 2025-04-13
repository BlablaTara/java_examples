package StringMetoderJamie;

public class MitTal {
    private double tal;


    public MitTal(double tal) {
        this.tal = tal;
    }

    public boolean slårMitTalDetModtagendeTal (double tal2){ //Behøver kun at stå, når den modtager andet end selve klassens attribut
        if (this.tal > tal2 ) {
            return true;
        }
        return false;
    }

    public double hvadErMitTalPlusDetModtagendeTal(double tal){
        double sum;
        sum = this.tal + tal;
        return sum;
    }


}
