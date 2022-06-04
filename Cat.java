
public class Cat extends Animal{

    public Cat (String name, String breed, int age){
        super(name, age);
    }

    public void eat () {
        System.out.println(name + " es un gato y esta comiendo pescado");
    }
    public void sleep () {
        System.out.println(name + " es un gato y esta durmiendo");
    }
    public void meow () {
        System.out.println(name + " es un gato y maulló!");
    }
}