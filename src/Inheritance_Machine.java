public class Inheritance_Machine {

    private String modelName;
    private int modelAge;

    public void setModelName(String modelName){
        this.modelName = modelName;
    }

    public String getModelName(){
        return this.modelName;
    }

    public void setModelAge(int modelAge){
        this.modelAge = modelAge;
    }

    public int getModelAge(){
        return this.modelAge;
    }

    public void machineStarting(){
        System.out.println(this.modelName + "'s machine is starting");
    }

    public void machineStopping(){
        System.out.println(this.modelAge + " is the age of this " + this.modelName);
    }

}
