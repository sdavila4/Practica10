public class Bear extends Datos{
    public Bear (String name, int age, boolean vaccinated){
        super(name, age, vaccinated);
        setType("Bear");
        setWeight(1);
    }
    public void run() {
        System.out.println(name + " corre rapidamente con sus patas");
    }
    public void eat(){
        System.out.println(name + " cazo a su presa para comer");
    }

}