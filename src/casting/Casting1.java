package casting;

public class Casting1 {

    public static void main(String[] args)
    {

        int intvalue = 10;
        long longvalue;
        double doublevalue;

        longvalue = intvalue; // int -> long
        System.out.println("longValue = " + longvalue);

        doublevalue = intvalue; // int -> double
        System.out.println("doubleValue = " + doublevalue);

        doublevalue = 20L; // long -> double
        System.out.println("doubleValue2 = " + doublevalue);


    }
}
