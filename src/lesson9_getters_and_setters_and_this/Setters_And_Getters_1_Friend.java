package lesson9_getters_and_setters_and_this;

public class Setters_And_Getters_1_Friend {

    private String name;
    private int age;
    private double height;

    public void setName(String friendName){
        name = friendName;
    }

    public String getName(){
        return name;
    }

    public void setAge(int friendAge){
        age = friendAge;
    }

    public int getAge(){
        return age;
    }

    public void setHeight(double friendHeight){
        height = friendHeight;
    }

    public double getHeight(){
        return height;
    }

}

class Friends{

    public static void main(String[] args) {

        Setters_And_Getters_1_Friend friend1 = new Setters_And_Getters_1_Friend();
        Setters_And_Getters_1_Friend friend2 = new Setters_And_Getters_1_Friend();

        friend1.setName("Richard");
        System.out.println(friend1.getName());

        friend1.setAge(27);
        System.out.println(friend1.getAge());

        friend1.setHeight(5.11);
        System.out.println(friend1.getHeight());

        friend2.setName("Tom");
        friend2.setAge(23);
        friend2.setHeight(5.9);

        System.out.println("My second friend is called " + friend2.getName() + " and he is " + friend2.getAge() + " years old.");
        System.out.println(friend2.getName() + " is " + friend2.getHeight() + " foot tall.");
    }




}