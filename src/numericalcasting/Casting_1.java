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

        //Not sure how to read / understand the minimum and maximum values for Float and Double - spoke with Marc
        //Don't worry too much about this now - worry about it when you need to (and use Stack Overflow!)

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

        //If I try 'intValue = longValue;' - This will not work and will give me an error (incompatible types)

        //However, if I try the below with a cast...it works

        intValue = (int) longValue;
        System.out.println("The value in the variable intValue is " + intValue);

        //Here I am saying convert the value in the variable longValue to an int
        //And once I've done this, I can then assign longValue to the variable intValue (which is an int, and can
        //therefore only store int values)

        //You can also cast from floating point (float / double) values to int values. For example:

        doubleValue = intValue;
        System.out.println("The value in the variable doubleValue is " + doubleValue);

        //In the above example, you don't even need to add a cast because you're not changing the value + you're not
        //chopping anything off. If I run this java class, the value in doubleValue will be 235365.0
        //The value in intValue simply converts to a double + a decimal point is added onto the end on the value in intValue

        //And you can also convert from a double to an int...

        double doubleValue1 = 3456.45;
        int intValue1;

        intValue1 = (int) doubleValue1;
        System.out.println("The value in the variable intValue1 is " + intValue1);

        //Here, I have converted the doubleValue1 to an int, and in doing so I have 'chopped off' the .45 (the stuff
        //that comes after the decimal point. In this instance, the cast chops off anything after the decimal point.

        //HOWEVER be very careful when trying to squeeze ('cast') a large value into a small value type, as you will
        //lose information, precision + your results might not be as you expect or want. See the example below...

        //For reference, the largest value a byte can hold is 127. 128 is too big a value to hold in a byte

        byteValue = (byte) 128;

        System.out.println(byteValue);

        //Look at the printout of the above...the value is printing as -128........

        //When using casting, you have to think very very VERY carefully about memory + whether you will actually get
        //the results you are expecting / want

    }
}
