package reading_files_with_try_with_resources;

public class Temp implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("The close method is automatically being called");
    }
}

class Test {

    public static void main(String[] args) {

        try (Temp temp = new Temp()) {
            System.out.println("Hello there");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

//In the above, when I instantiate a new Temp object USING the "try with resource" feature, the close method within
//Temp is automatically called. Brilliant!!!
