
public class Veterinarian {
    String name;
    int id;
    public Veterinarian (String name, int id) {
        this.name = name;
        this.id = id;
    }
    public void vaccinate (Datos animal){
        if(!animal.getVaccinated()){
            animal.setVaccinated (true);
            System.out.println(animal.getName() + "\n" + "   esta vacunado.");
        }else{
            System.out.println(animal.getName() + "\n" + "   no esta vacunado.");
        }
    }
}