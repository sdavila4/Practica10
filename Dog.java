
public class Dog extends Animal{

    public Dog (String name, String breed, int age){
        super(name, age);
    }
    public void eat () {
        System.out.println("    ----Resultados-----\n");
        System.out.println(name + " es un perro y esta comiendo croquetas.");
    }
    public void sleep () {
        System.out.println(name + " es un perro y esta durmiendo");
    }
    public void bark () {
        System.out.println(name + " es un perro y ladro!");
    }
}