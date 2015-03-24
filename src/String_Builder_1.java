public class String_Builder_1 {

    public static void main(String[] args) {

        String sentence = "";

        sentence += "Hello my name is Richard";
        sentence += "";
        sentence += ", and I am learning java";

        System.out.println(sentence);

        //But the above is inefficient. Each time I do the +=, I am not simply appending onto the end of the String 'sentence'.
        //But I am actually creating a new String on the heap, and moving my 'sentence' reference to point to it.
        //So above, I've actually created 4 String objects.
        //An inefficient way to do this as I am taking up memory and potentially slowing things down.

        StringBuilder sentence2 = new StringBuilder();

        sentence2.append("This is a much more");
        sentence2.append(" memory efficient way to add to a String object. ");
        sentence2.append("I am basically adding to the same String object, I'm not creating a new one each time I do an append");

        System.out.println(sentence2.toString());
        //Look at the java doc for a more detailed understanding of toString

        //I can also chain methods with a StringBuilder append, an example below:

        StringBuilder sentence3 = new StringBuilder();

        sentence3.append("This is another way").append(" to append strings to ").append("each other");

        System.out.println(sentence3.toString());

    }

    //Got up to 7 mins

}
