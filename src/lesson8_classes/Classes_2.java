package lesson8_classes;

public class Classes_2 {

    public static void main(String[] args) {

        //Don't forget the main method!!!

        Classes_1 person1 = new Classes_1();
        Classes_1 person2 = new Classes_1();
        Classes_1 person3 = new Classes_1();

        person1.firstName = "Richard";
        person1.middleName = 'J';
        person1.lastName = "Chernanko";
        person1.fullName = (person1.firstName + " " + person1.middleName + " " + person1.lastName);
        person1.age = 28;
        person1.height = 5.11;


        person2.firstName = "Rory";
        person2.middleName = 'I';
        person2.lastName = "Holland";
        person2.fullName = (person2.firstName + " " + person2.middleName + " " + person2.lastName);
        person2.age = 28;
        person2.height = 5.10;

        person3.firstName = "Anne";
        person3.middleName = 'C';
        person3.lastName = "Blunck";
        person3.fullName = (person3.firstName + " " + person3.middleName + " " + person3.lastName);
        person3.age = 26;
        person3.height = 5.7;

        System.out.println("Person one's full name is " + person1.fullName);
        System.out.println("Person two's full name is " + person2.fullName);
        System.out.println("Person three's full name is " + person3.fullName);
        System.out.println(person1.firstName + " is " + person1.height + " tall and is " + person1.age + " years old");
        System.out.println(person2.firstName + " is " + person2.height + " tall and is " + person2.age + " years old");
        System.out.println(person3.firstName + " is " + person3.height + " tall and is " + person3.age + " years old");
        //When i print the above line, rather than printing 5.10, it only prints 5.1.
        //Read up on this on stack overflow, must be a reason why the 0 is getting cut off.

    }
}
