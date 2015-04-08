public class ToStringMethodPractice_1 {

//    public String toString(){
//        return "hello there";
//    }

    public static void main(String[] args) {

        ToStringMethodPractice_1 test = new ToStringMethodPractice_1();

        System.out.println(test);

        StringBuilder sentence3 = new StringBuilder();

        System.out.println(sentence3);

        String richard = new String();

        System.out.println(richard);

    }
}

// why doesn't a toString() method print out a hashcode on a String or StringBuilder object???
//Also have a look at the String Builder_1 class for a toString. Ask Jay why we need it there?