//Roberto Francsico Sanchez Davila - Practia 10 poliformismo
public class Main{
    public static void main(String[] args) {
        Animal Animal = new Animal(" Animal", 7);
        Dog dog = new Dog(" Travis", "Pug", 4);
        Cat cat = new Cat(" Pancha", "Pekin", 1);
        Animal.eat();
        Animal.sleep();
        Animal.play();


        System.out.print("\n");
        dog.eat();
        dog.sleep();

        System.out.print("\n");
        cat.eat();
        cat.sleep();

        System.out.print("\n    Información de los animales:      \n\n");
        Animal AnimalD= new Dog(" Dog","Pastor Aleman", 5);

        AnimalD.play();
        AnimalD.eat();


        System.out.print("\n    Información de los animales:      \n\n");
        Animal [] animalArray = new Animal[3];
        animalArray[0] = new Dog(" Cleopatra", "Chihuahua", 2);
        animalArray[1] = new Cat(" Claudio", "Ragdoll", 3);
        animalArray[2] = new Cat(" Roberta", "Pekin", 1);

        for(Animal animal: animalArray) {
            animal.eat();
            if(animal instanceof Dog){
                ((Dog) animal).bark();
            }
            if(animal instanceof Cat){
                ((Cat) animal).meow();
            }

        }
    }
}