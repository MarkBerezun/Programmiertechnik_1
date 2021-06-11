import java.util.function.ToDoubleBiFunction;

public class Main {

    public static void main(String[] args) {

        int testInt = 31/7;
        float testFloat = 31/7;
        double testDouble = 31/7;

        System.out.println(testInt);
        System.out.println(testFloat);
        System.out.println(testDouble);

        System.out.println();

        int testIntI = 31/7;
        float testFloatF = 31f/7f;
        double testDoubleD = 31d/7d;

        System.out.println(testIntI);
        System.out.println(testFloatF);
        System.out.println(testDoubleD);

        System.out.println();
        System.out.println();
        System.out.println();


        // TODO: 6/10/2021 bis unten
        int x=1, y=2, z=3;
        System.out.println(x--);
        System.out.println(++x - x);
        System.out.println(x);

        if(x++ == 0){
            System.out.println(x);
        }
        System.out.println(x);

        if((y==2) || (x++ > 0)){
            System.out.println(x);
        }

        System.out.println(x);
        x += y;
        System.out.println(x);

        if((y==2) | (x++>0)){
            System.out.println(x);
            z-=y;
        }
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        System.out.println();
        System.out.println();

        // bei statements if(char > char) werden char als ASCII behandelt
        char a = 'A';
        char b = 'B';
        if (a == --b) {
            System.out.println ("1");
        }
        if ((a == b) || (a++ > b)) {
            System.out.println("2");
        }
        System.out.println(a);

    }
}

/*
Operation     Meaning                       Note
---------     -------                       ----
   a && b     logical AND                    short-circuiting
   a || b     logical OR                     short-circuiting
   a &  b     boolean logical AND            not short-circuiting
   a |  b     boolean logical OR             not short-circuiting
   a ^  b     boolean logical exclusive OR
  !a          logical NOT
* */