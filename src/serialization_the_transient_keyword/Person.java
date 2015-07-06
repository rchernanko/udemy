/*

The transient keyword is one which is used when you serialize objects.

FYI - Prior to writing any comments in the three classes within this package, I've created a basic Person object (as
per its structure within the 'serialization' package, and have written some code within WriteObjects and ReadObjects.

 */

package serialization_the_transient_keyword;

import java.io.Serializable;

    public class Person implements Serializable {

        //1)
        //At present (without using any transient keywords), when we run the main method within WriteObjects, we are
        //writing the instance variables 'id' and 'name' to a .bin file.
        //Similarly, when we run the main method within ReadObjects, we are able to read 'id' and 'name' (because this
        //is what was written to the file)

        //But when you serialize objects, there might be some instance variables that you don't care about / need, and
        //so in order to be efficient you would not want to write these to files (when WriteObjects' main method is
        //run)

        //UP TO 14 mins 30 secs

        private int id;
        private String name;

        public Person(int id, String name){
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
