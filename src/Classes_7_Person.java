public class Classes_7_Person {

    String name;
    int age;

    public void speak() {
        System.out.println("My name is " + name);
    }

    public void calculateYearsLeftToRetirement() {

        int yearsLeft = 65 - age;
        System.out.println(name + " has " + yearsLeft + " years left until he retires");
    }

    //The below method returns an int value
    int calculateDaysOld(){

        int totalDaysOld = age * 365;

        return totalDaysOld;
    }

    //The below method also returns an int value
    int getAge(){
        return age;
    }

    //The below method returns a String value
    String getName(){
        return name;
    }
}