package ArrayMedJamie;

import java.util.ArrayList;

public class ScopeMedJamie {
    private ArrayList<Integer> hello; // Skal aldrig initialiseret

    public static void main(String[] args) {
        new ScopeMedJamie().run();
    }

    private void run() {
        hello = new ArrayList<>();  //her kan de blive initialiseres
        jamieSkalBlæreSig(12);

    }

    public void jamieSkalBlæreSig (int parameter){
      hello.add(parameter);


    }
}
