package animals.animals_test;

import animals.models.Animals;
import animals.models.Cat;
import animals.models.Dog;

public class Controls {

    private final Dog dog;
    private final Cat cat;
    private final Input input;
    private final Animals animals;

    public Controls(Dog dog, Cat cat, Input input, Animals animals) {
        this.dog = dog;
        this.cat = cat;
        this.input = input;
        this.animals = animals;
    }

    public void competitions(){
        String massage;
        input.inputAnimals();
        massage = cat.Run(cat.getRun(), cat.getName());
        System.out.println(massage);
        massage =  dog.Run(dog.getRun(), dog.getName());
        System.out.println(massage);
        massage =  cat.Swim(cat.getSwim(), cat.getName());
        System.out.println(massage);
        massage = dog.Swim(dog.getSwim(), dog.getName());
        System.out.println(massage);
        System.out.println("Количество животных принявших участие: " + animals.getAnimalCount());
    }
}
