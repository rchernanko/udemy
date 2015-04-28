package numericalcasting;

public class Casting_1 {

    public static void main(String[] args) {

        //First useful thing - You can actually find out the minimum and maximum values of something by calling the class variables below:

        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);

        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);

        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);

        //Not sure how to read / understand the minimum and maximum values for Float and Double - find out more

        //And now for the actual tutorial

        byte byteValue = 20;
        short shortValue = 3455;
        int intValue = 73276;
        long longValue = 235365;
        float floatValue = 3.4F;

        //You must put an F on the end of the float value. When you have a decimal point in your value, the compiler (check this)
        //automatically thinks that it is a double. Therefore, this is why you must put an F at the end.

        double doubleValue = 234233.33;

        //So, I've declared my variables above, now to start casting...

        //If I try intValue = longValue; - This will not work and will give me an error (incompatible types)

        //However, if I try the below with a cast...it works

        intValue = (int) longValue;
        System.out.println("The value in the variable intValue is " + intValue);

        //Here I am saying convert the value in the variable longValue to an int (which with these values is possible)
        //And once I've done this, I can then assign longValue to the variable intValue (which is an int, and can
        //therefore only store int values)

        //You can also cast from floating point values to int values (or the other way). For example:

        doubleValue = intValue;
        System.out.println("The value in the variable doubleValue is " + doubleValue);

        //In the above example, you don't even need to add a cast. If I run this java class, the value
        //in doubleValue will be 235365.0
        //So it is clever enough to simple add a decimal point onto the end on the value in intValue

        //UP TO 5 MINS and 9 SECS
    }
}
