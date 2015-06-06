package classes;

public class Classes_7A_People {

    public static void main(String[] args) {

        Classes_7_Person john = new Classes_7_Person();
        Classes_7_Person richard = new Classes_7_Person();

        john.name = "John";
        john.age = 25;
        richard.name = "Richard";
        richard.age = 27;
        int johnDaysOld = john.calculateDaysOld();
        int richardDaysOld = richard.calculateDaysOld();

        john.speak();
        john.calculateYearsLeftToRetirement();
        System.out.println(john.name + " is " + johnDaysOld + " days old");
        System.out.println();

        richard.speak();
        richard.calculateYearsLeftToRetirement();
        System.out.println(richard.name + " is " + richardDaysOld + " days old");
        System.out.println();

        int age = john.getAge();
        System.out.println("My getAge method populates the variable 'age' with the value " + age);
        System.out.println();

        int age1 = richard.getAge();
        System.out.println("My getAge method populates the variable 'age1' with the value " + age1);
        System.out.println();

        String name = john.getName();
        System.out.println("My getName method populates the variable 'name' with the value " + name);
        System.out.println();

        String name1 = richard.getName();
        System.out.println("My getName method populates the variable 'name1' with the value " + name1);
        System.out.println();
    }
}
