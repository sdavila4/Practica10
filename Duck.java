public class Duck extends Datos{
    public Duck (String name, int age, boolean vaccinated){
        super(name, age, vaccinated);
        setType("Duck");
        setWeight(1);
    }
    public void run(){
        System.out.println(name + " nada lentamente");
    }
    public void eat(){
        System.out.println(name + " come con su pico");
    }

}