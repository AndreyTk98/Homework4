package animals.models;

public class Cat extends Animals {

    public Cat(double run, double swim, String name) {
        super(run, swim, name);
    }

    public String Run(double run, String name) {
        String massage;
        if (run <= 200) {
            massage = name + " пробежал: " + run + "м";
        } else {
            massage = name + " устал!";
        }
        return massage;
    }

    public String Swim(double swim, String name){
        String massage = null;
        if (swim >= 0){
            massage = name + " боится воды!";
        }
        return massage;
    }
}
