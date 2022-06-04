
public class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void eat () {
        System.out.println("   -------------------------");
        System.out.println("  | Bienvenido al zoologico |");
        System.out.println("   -------------------------\n");
        System.out.println(" El animal esta comiendo");
    }
    public void sleep () {
        System.out.println(" El animal esta durmiendo");
    }
    public void play () {
        System.out.println(" El animal esta mordiendo unas plantas");
    }
}
