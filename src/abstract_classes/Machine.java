/*

So the first thing I have done is to create three classes.
The parent class is Machine and both Camera + Car are subclasses of Machine

In the 'make-believe' program I'm about to build, the Camera and Car classes have several things in common, for example, they both have Ids.
And because they both extend from Machine, I can add a variable to Machine (plus some getters and setters) + therefore Camera and Car will inherit

Next comment is after "car1.setId(7);" in the App.java class

*/

package abstract_classes;

public class Machine {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
