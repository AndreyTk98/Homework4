package animals.models;

public class Dog extends Animals {


    public Dog(double run, double swim, String name) {
        super(run, swim, name);
    }
    public String Run(double run, String name) {
        String massage;
        if (run <= 500) {
            massage = name + " пробежал: " + run + "м";
        } else {
            massage =name + " устал!";
        }
        return massage;
    }

    public String Swim(double swim, String name){
        String massage;
        if (swim <= 10){
            massage =name + " проплыл: " + swim + "м";
        } else {
            massage = "Далековато плыть, ты же не хочешь что бы твой " + name + " утонул?";
        }
        return massage;
    }
}
