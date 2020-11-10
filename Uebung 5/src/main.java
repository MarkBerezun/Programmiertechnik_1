public class main {
    public static void main(String[] args) {

        // Aufgabe 1
        //System.out.println(fibonacci_iterativ(25));
        //System.out.println(fibonacci_rekursiv(25));

        // Aufgabe 2
        //System.out.println("Die Zahl hat " + ziffern_zaehlen(9) + " Ziffern.");

        // Aufgabe 3
        //System.out.println(ggT_rekursiv(10839, 24531));

        // Aufgabe 4
        //System.out.println(umgek_String("Mark"));

        // Aufgabe 5
        //System.out.println(quersumme(121212));
    }

    // Aufgabe 1
    static int fibonacci_iterativ(int zahl){
        if(zahl <= 1) {
            return zahl;
        }
        int x = 1;
        int v_x = 1;

        for (int i=2; i<zahl; i++){
            int temp = x;
            x+= v_x;
            v_x = temp;
        }
        return x;
    }

    static int fibonacci_rekursiv(int zahl) {
        if ((zahl == 0) || (zahl == 1)) {
            return zahl;
        }
        else {
            return fibonacci_rekursiv(zahl-1) + fibonacci_rekursiv(zahl-2);
        }
    }


    // Aufgabe 2
    static int ziffern_zaehlen(int zahl){
        if (zahl == 0) {
            return 0;
        }
        else {
            return 1 + ziffern_zaehlen(zahl/10);
        }
    }


    // Aufgabe 3
    static int ggT_iterativ(int a, int b){
        while(b > 0)
        {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    static int ggT_rekursiv(int a, int b){
        if (b==0){
            return a;
        }
        else{
            return ggT_rekursiv(b, a % b);
        }
    }


    // Aufgabe 4
    static String umgek_String(String s){
        if(s == ""){
            return s;
        }else{
            return umgek_String(s.substring(1)) + s.charAt(0);
        }
    }


    // Aufgabe 5
    static int quersumme(int zahl){
        if(zahl < 10){
            return zahl;
        }else{
            return quersumme(zahl/10) + zahl%10;
        }
    }


}
