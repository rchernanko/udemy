import java.lang.reflect.Method;

public class Method_Parameters_1_Candidates {

    public void printCandidateDetails (String name, int age){
        System.out.println("The candidate is called " + name + " and they are " + age + " years old.");
    }

    public void printCandidateSuitability (String suitability){
        System.out.println("The candidate is " + suitability + " for this role");
    }

    public void printRequiredSalary (int salary, int bonus){
        System.out.println("The candidate is expecting £" + salary + " for their annual salary, plus a bonus of £" + bonus);
    }
}

class Candidates{

    public static void main(String[] args) {

        Method_Parameters_1_Candidates johnDavis = new Method_Parameters_1_Candidates();
        Method_Parameters_1_Candidates richardJones = new Method_Parameters_1_Candidates();
        Method_Parameters_1_Candidates jennyShort = new Method_Parameters_1_Candidates();
        Method_Parameters_1_Candidates sarahLauren = new Method_Parameters_1_Candidates();
        Method_Parameters_1_Candidates jimmyBullard = new Method_Parameters_1_Candidates();

        String message = "Sarah on weekends, James in the week";
        String message2 = "incredibly experienced and therefore perfectly suited";
        int requestedSalary = 50000;
        int requestedBonus = 10000;

        sarahLauren.printCandidateDetails(message, 28);
        sarahLauren.printCandidateSuitability(message2);
        // So I can pass variables of the right type into the method parameter
        sarahLauren.printRequiredSalary(30000, 2000);
        System.out.println();

        jimmyBullard.printCandidateDetails("Jimmy Bullard", 33);
        jimmyBullard.printCandidateSuitability("absolutely not suitable");
        jimmyBullard.printRequiredSalary(requestedSalary, requestedBonus);
        // So I can pass variables of the right type into the method parameter
        System.out.println();

        johnDavis.printCandidateDetails("John Davis", 27);
        johnDavis.printCandidateSuitability("very suitable");
        johnDavis.printRequiredSalary(25000, 2000);
        System.out.println();

        richardJones.printCandidateDetails("Richard Jones", 32);
        richardJones.printCandidateSuitability("not very suitable");
        richardJones.printRequiredSalary(28000, 1500);
        System.out.println();

        jennyShort.printCandidateDetails("Jenny Short", 31);
        jennyShort.printCandidateSuitability("potentially suitable");
        jennyShort.printRequiredSalary(23000, 3000);
        System.out.println();
    }
}
