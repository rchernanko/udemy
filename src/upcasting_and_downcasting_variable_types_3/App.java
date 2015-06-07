package upcasting_and_downcasting_variable_types_3;

public class App {

    public static void main(String[] args) {

        Laptop laptop1 = new Laptop();
        Mac mac1 = new Mac();

        laptop1.startLaptop();
        mac1.startLaptop();
        mac1.shutdownMac();

        // *** UPCASTING EXAMPLE ***

        Mac mac2 = new Mac();

        Laptop laptop2 = mac2;

        //(The above is also the same as doing... Laptop laptop3 = new Mac();), but just using upcasting

        //I am upcasting mac2 from a Mac variable type to a Laptop variable type (but both mac2 to laptop2 will still
        //point to a Mac object)

        laptop2.startLaptop();

        // *** DOWNCASTING EXAMPLE ***

        Laptop laptop3 = new Mac();

        laptop3.startLaptop();

        //But I would like to access the shutdownMac method within the Mac object.
        //I will have to downcast in order to do this...

        Mac mac3 = (Mac) laptop3;

        mac3.shutdownMac();

    }

}
