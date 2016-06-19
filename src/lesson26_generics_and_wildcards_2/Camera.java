package lesson26_generics_and_wildcards_2;

public class Camera extends Machine {

    @Override
    public String toString() {
        return "I am a camera";
    }

    public void snap(){
        System.out.println("Photo taken");
    }
}
