/*

The transient keyword is one which is used when you serialize objects.

FYI - Prior to writing any comments in the three classes within this package, I've created a basic Person object (as
per its structure within the 'lesson40_serialization' package, and have written some code within WriteObjects and ReadObjects.

 */

package lesson41_serialization_the_transient_keyword;

import java.io.Serializable;

    public class Person implements Serializable {

        //1)
        //At present (without using any transient keywords), when we run the main method within WriteObjects, we are
        //writing the instance variables 'id' and 'name' to a .bin file.
        //Similarly, when we run the main method within ReadObjects, we are able to read 'id' and 'name' (because this
        //is what was written to the file)

        //But you might not want or need to serialize every field within your object. There may be some instance
        //variables that you don't want to serialize
        //Of course, in order to be the most efficient, you should only serialize fields that you want to serialize, and
        //serialize the ones that make sense to serialize (when the WriteObjects main method is run).

        //Similarly there are some variables that you simply cannot serialize (e.g. static variables)...

        //2)
        //You can prevent fields from being serialized by giving them the transient keyword.
        //Let's say we didn't want 'id' to be serialized - let's add the transient keyword to it

        private transient int id;
        private String name;

        //Now we've given 'id' the transient keyword, let's run the main method within WriteObjects + then run the main
        //method within ReadObjects...

        //3) When we do the above, the following is printed out to the console:

        /*

        Reading objects...
        Person{id=0, name='richard'}

         */

        //So you'll see in the above that the id is not 7 anymore, id has instead been initialised to the int default
        //value of 0
        //In other words, the id has not been serialized - and this is because of the transient keyword

        //4) Let's now look at transient with static variables. Let's add a static variable 'count':

        private static int count;

        //And scroll down to point 5 to see that I'm adding some getters and setters to count too

        public Person(int id, String name){
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "id=" + id +
                    ", name='" + name +
                    ", count='" + count +
                    '\'' +
                    '}';
        }

        //5)
        //I'm now adding some getters and setters to access the static variable 'count'.
        //Notice that the methods are static as well:

        public static void setCount(int count) {
            Person.count = count;
        }

        public static int getCount() {
            return count;
        }

        //So remember, because 'count' is a static variable, there is only 1 of it. A new 'count' variable is not going
        //to be created with every Person instance. Instead the count variable is shared by all object instances, it
        //belongs to the class blueprint, not any instances. All Person instances see the same 'count' field.

        //And if you think about it, it wouldn't make sense to serialize the static field 'count'...

        //So to demonstrate this, let's go to the WriteObjects class, to point 6, and try to serialize the variable
        //'count' to our .bin file

        }
