

import java.util.ArrayList;
public class Zoo {
    public static void main(String[] args){
        Veterinarian vet = new Veterinarian("Roberto", 0114);
        ArrayList<Datos> animals= new ArrayList<Datos>(1);
        Datos bear = new Bear("Will", 5, true);
        Datos tiger = new Tiger("Rambo", 2, true);
        Datos duck = new Duck("Ruben", 1, false);
        addAnimal(bear, animals);
        addAnimal(tiger, animals);
        addAnimal(duck, animals);
        showAnimals(animals);
        vet.vaccinate(bear);
        vet.vaccinate(tiger);
        vet.vaccinate(duck);

    }
    public static void addAnimal(Datos animal, ArrayList<Datos>animals){
        animals.add(animal);
    }

    public static void showAnimals(ArrayList<Datos> animals){
        for(int i=0; i<animals.size(); i++){
            System.out.printf(" Tipo: %s\n", animals.get(i).getType());
            System.out.printf(" Nombre: %s\n", animals.get(i).getName());
            System.out.printf(" Edad:  %d\n            Resultados:          \n",
                    animals.get(i).getAge());
        }
    }
}