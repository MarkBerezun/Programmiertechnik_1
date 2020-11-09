public class main {
    public static void main(String[] args) {
            //fibonacci_iterativ(20);
        System.out.println(fibonacci_iterativ(25));
        System.out.println(fibonacci_rekursiv(25));
    }

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

    static  int fibonacci_rekursiv(int zahl) {
        if ((zahl == 0) || (zahl == 1)) {
            return zahl;
        }
        else {
            return fibonacci_rekursiv(zahl-1) + fibonacci_rekursiv(zahl-2);
        }
    }

    

}
