import java.util.Scanner;
import java.util.Random;
public class MorraCinese_vsComputer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int mComputerInt = random.nextInt(3);
        String mComputer = "";
        switch (mComputerInt) {
            case 0:
                mComputer = "forbice";
                break;
            case 1:
                mComputer = "carta";
                break;
            case 2:
                mComputer = "sasso";
                break;
        }

        System.out.println("inserisci la tua mossa (forbice, carta, sasso): ");
        String mUtente = scanner.nextLine().toLowerCase();

        System.out.println("Il computer ha scelto: " + mComputer);

        if (mUtente.equals(mComputer)) {
            System.out.println("pareggio!");
        } else if ((mUtente.equals("forbice") && mComputer.equals("carta")) ||
                (mUtente.equals("carta") && mComputer.equals("sasso")) ||
                (mUtente.equals("sasso") && mComputer.equals("forbice"))) {
            System.out.println("hai vinto!");
        } else if (!mUtente.equals("forbice") && !mUtente.equals("carta") && !mUtente.equals("sasso")) {
            System.out.println("errore!");
        } else {
            System.out.println("hai perso!");
        }
    }
}