public class Inheritance_Person {

    public String name;
    public String eyeColour;
    public int waistSize;

    public static void main(String[] args) {
    }

    public void wakeUp(){
        System.out.println(this.name + " is waking up");
    }

    public void lookAtEyesInMirror(){
        System.out.println(this.name + "'s eyes are " + this.eyeColour);
    }

    public void measureWaist(){
        System.out.println(this.name + "'s waist size is " + this.waistSize);
    }
    public void goToSleep(){
        System.out.println(this.name + " is tired and is going to sleep");
    }
}
