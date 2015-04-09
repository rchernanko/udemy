public class ToStringMethodExample_1 {

        int rollno;
        String name;
        String city;

        ToStringMethodExample_1(int rollno, String name, String city){
            this.rollno=rollno;
            this.name=name;
            this.city=city;
        }

    public String toString(){//overriding the toString() method
        return rollno+" "+name+" "+city;
    }

    //another way to do the above, which is more efficient, is as below:



    public static void main(String args[]){
            ToStringMethodExample_1 s1=new ToStringMethodExample_1(101,"Raj","lucknow");
            ToStringMethodExample_1 s2=new ToStringMethodExample_1(102,"Vijay","ghaziabad");

            System.out.println(s1);//if i don't have the overriding toString() method, here the compiler writes here s1.toString()
            System.out.println(s2);//if i don't have the overriding toString() method, here the compiler writes here s2.toString()
        }
    }

//The above was taken from StackOverflow
