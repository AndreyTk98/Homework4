import animals.animals_test.Controls;
import animals.animals_test.Input;
import animals.models.Animals;
import animals.models.Cat;
import animals.models.Dog;

public class Main {

    static double run;
    static double swim;
    static String name;
    public static void main(String[] args) {
        Animals animals = new Animals(run,swim,name);
        Cat cat = new Cat(run,swim,name);
        Dog dog = new Dog(run,swim,name);
        Input input = new Input(run,swim,name, cat, dog);
        Controls controls = new Controls(dog,cat, input, animals);
        controls.competitions();
    }
}