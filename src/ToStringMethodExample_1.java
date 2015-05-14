public class ToStringMethodExample_1 {

        int rollno;
        String name;
        String city;

        ToStringMethodExample_1(int rollno, String name, String city){
            this.rollno=rollno;
            this.name=name;
            this.city=city;
        }

//    public String toString(){//overriding the toString() method
//        return rollno+" "+name+" "+city;
//    }

    //With the above, because there is a + (and they are string values), every time you use the +, you are creating a new version of the object
    //see stringbuilder practice for more information. concatenating strings. every time you have a + between 2 strings, you're creating 2 string objects.
    //bad from a memory management perspective
    //there is instead another way to do the above, which is more efficient - see below:


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(rollno).append(" ").append(name).append(" ").append(city);
        return sb.toString();
    }

    public static void main(String args[]){
            ToStringMethodExample_1 s1=new ToStringMethodExample_1(101,"Raj","lucknow");
            ToStringMethodExample_1 s2=new ToStringMethodExample_1(102,"Vijay","ghaziabad");

            System.out.println(s1);//if i don't have the overriding toString() method, here the compiler writes here s1.toString()
            System.out.println(s2);//if i don't have the overriding toString() method, here the compiler writes here s2.toString()
        }
    }