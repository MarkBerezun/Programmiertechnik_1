import java.util.function.ToDoubleBiFunction;

public class Main {

    public static void main(String[] args) {
        int i = 10;
        while (i > 0) {
            System.out.println(i);
            i = i - 2;
        }

        i = 10;
        do {
            System.out.println(i);
            i = i - 2;
        } while (i > 0);

        // TODO: 6/10/2021
        i = 10;
        for (int x = i; x > 0; x = x - 2) {
            System.out.println(x);
        }

        System.out.println();
        System.out.println();
        System.out.println();

        for (int x = 0; x < 100; x++) {
            if (x == 50) {
                break;
            }
            if (x % 9 != 0) {
                continue;
            } // end if
            System.out.println(x);
        } // end for

        System.out.println();
        System.out.println();

        int mz = 124;
        quersumme(mz);

        System.out.println();
        System.out.println();
        stern(5);

        System.out.println();
        System.out.println();
        baum(4);
    }

    // TODO: 6/11/2021
    public static void quersumme(int zahl){

        int quersumme = 0;

        while(zahl != 0){
            quersumme += zahl % 10;
            zahl = zahl/ 10;
        }

        System.out.println("Quersumme: " +quersumme);
    }

    public static void stern(int zahl){
        for(int i=0; i < zahl; i++){
            for (int y=0; y<=i; y++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void baum(int zahl){
        for(int i=0; i < zahl; i++){
            for (int y=0; y<=i; y++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
    }

}
