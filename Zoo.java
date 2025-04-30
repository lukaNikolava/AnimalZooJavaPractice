import java.util.List;

public class Zoo {
    private String city;
    private List<Animal> animals;

    public Zoo(String city, List<Animal> animals) {
        this.city = city;
        this.animals = animals;
    }

    public void printAnimals() {
        System.out.println("In " + city + " zoo we have animals:");
        for (Animal animal : animals) {
            animal.printInfo();
        }
    }

    public void feedAnimals() {
        System.out.println("Let's feed animals in " + city + " Zoo!");
        int i = 0;
        while (i < animals.size()) {
            animals.get(i).eatFood();
            i++;
        }
    }

    public String getCity() {
        return city;
    }
}