package generics_and_wildcards_2;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        ArrayList<Machine> machine = new ArrayList<>();

        machine.add(new Machine());
        machine.add(new Machine());
        machine.add(new Machine());

        ArrayList<Camera> camera = new ArrayList<>();

        camera.add(new Camera());
        camera.add(new Camera());
        camera.add(new Camera());

        showList(machine);

    }

    public static void showList(ArrayList<Machine> machine) {
        for (Machine things : machine) {
            System.out.println(things);
        }
    }

    //HOWEVER, what is important to know here is that in the showList method, I cannot pass an ArrayList of Cameras
    //The method showList above only excepts an ArrayList of Machines
    //So it doesn't matter that Camera extends Machine

    //So if I were to write 'showList(camera);' in the 'App' class above, this would not compile

    //UP TO 8 MINS
}