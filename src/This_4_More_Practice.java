public class This_4_More_Practice {

    public static void main(String[] args) {

        This_3_More_Practice item1 = new This_3_More_Practice();

        item1.setItem("Shirt");
        System.out.println(item1.getItem());

        item1.setColour("Blue");
        System.out.println(item1.getColour());

        item1.setSize('S');
        System.out.println(item1.getSize());

        item1.setPrice(15.50);
        System.out.println(item1.getPrice());

        System.out.println("The customer says : I would like this " + item1.getItem() + " in " + item1.getColour() + ", in " + item1.getSize() + ", preferably around £" + item1.getPrice());
    }

}
