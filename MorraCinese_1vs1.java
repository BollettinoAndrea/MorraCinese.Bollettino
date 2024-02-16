import java.util.Scanner;
public class MorraCinese_1vs1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci primo giocatore: ");
        String g1 = scanner.nextLine();
        System.out.println("inserisci secondo giocatore: ");
        String g2 = scanner.nextLine();

//----------------------------------------------------------------------------------------------------------------------

        System.out.println(g1 + ", inserisci mossa (forbice, carta, sasso): ");
        String m1 = scanner.nextLine().toLowerCase();
        System.out.println(g2 + ", inserisci mossa (forbice, carta, sasso): ");
        String m2 = scanner.nextLine().toLowerCase();

//----------------------------------------------------------------------------------------------------------------------

        if (!m1.equals("forbice") && !m1.equals("carta") && !m1.equals("sasso") ||
                !m2.equals("forbice") && !m2.equals("carta") && !m2.equals("sasso")) {
            System.out.println("errore!");
        } else {
            if (m1.equals(m2)) {
                System.out.println("pareggio!");
            } else if ((m1.equals("forbice") && m2.equals("carta")) ||
                    (m1.equals("carta") && m2.equals("sasso")) ||
                    (m1.equals("sasso") && m2.equals("forbice"))) {
                System.out.println("il vincitore e' " + g1 + "!");
            } else {
                System.out.println("il vincitore e' " + g2 + "!");
            }
        }
    }
}