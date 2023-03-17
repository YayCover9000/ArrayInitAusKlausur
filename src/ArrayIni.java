import java.util.Scanner;
public class ArrayIni {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        int ziffer = scanner.nextInt();
        int [] Array = new int[5];
        ArrayIni.ini(Array, ziffer);
    }
    public static void ini (int[] ArrayFirst, int ziffer) {

        if (ziffer > 0 && ziffer < 10) {
            // Cast ziffer to String
            String zwischen = Integer.toString(ziffer);
            String zifferString = Integer.toString(ziffer);
            int backToInt;
            //System.out.println("Ziffer To String: " + zifferString);
            // Gibt Stzring plus Ziffer als String aus bis Array voll
            ArrayFirst[0] = ziffer;
            for (int k = 1; k < ArrayFirst.length; k++) {
                zwischen += zifferString;
                //System.out.println("Zwischen: " + zwischen);
                // casts String to Int
                backToInt = Integer.parseInt(zwischen);
                //System.out.println("backToInt: " + backToInt);
                ArrayFirst[k] = backToInt;
                //System.out.println("Ziffer als Int ausgabe: " + ArrayFirst[k]);
            }

            for (int e : ArrayFirst) {
                System.out.println("Ziffer: " + e);
            }
        } else {
            System.out.println("Falsche Eingabe");
        }
    }
}
