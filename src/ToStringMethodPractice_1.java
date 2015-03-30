public class ToStringMethodPractice_1 {

    public String toString(){
        return "hello there";
    }

    public static void main(String[] args) {

        ToStringMethodPractice_1 test = new ToStringMethodPractice_1();

        System.out.println(test);

    }
}

// why doesn't a toString() method print out a hashcode on a String or StringBuilder object???