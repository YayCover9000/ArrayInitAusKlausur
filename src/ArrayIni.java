public class ArrayIni {
    public static void main (String [] args) {
        int ziffer = 7;
        int [] Array = new int[5];
        ArrayIni.ini(Array, ziffer);
    }
    public static void ini (int[] ArrayFirst, int ziffer) {
        String zwischen = Integer.toString(ziffer);
        String zifferString = Integer.toString(ziffer);
        System.out.println("Ziffer To String: " + zifferString);
        for (int k = 0; k < ArrayFirst.length; k++) {
            zwischen += zifferString;
            System.out.println("Zwischen: " + zwischen);
        }

        if (ziffer > 0 && ziffer < 10) {
            for (int i = 0; i < ArrayFirst.length; i++) {
                ArrayFirst[i] = ziffer;
                for(int j = 0; j < ArrayFirst[i]; j++) {

                }
            }
            for (int e : ArrayFirst) {
                System.out.println("Ziffer: " + e);
            }
        } else {
            System.out.println("LEER");
        }

    }
}
