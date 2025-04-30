import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal(25, 70));
        animals.add(new Animal(3, 4.55));
        animals.add(new Monkey(7, 39.5, "Banana"));
        animals.add(new Donkey(12, 69, "Donny"));
        animals.add(new Monkey(18, 75, "Bamboo"));
        animals.add(new Donkey(2, 32.2, "Little"));

        Zoo zoo = new Zoo("Georgia", animals);
        zoo.printAnimals();
        zoo.feedAnimals();

        List<Animal> filteredAnimals = AnimalsFilter.filterByAge(animals, 10);
        Zoo filteredZoo = new Zoo("City of grown-up animals", filteredAnimals);
        filteredZoo.printAnimals();

        List<Zoo> zoos = new ArrayList<>();
        zoos.add(zoo);
        zoos.add(filteredZoo);

        System.out.println("\nPractice with lambda");
        zoos.stream().filter(z -> z.getCity().contains("grown-up")).forEach(Zoo::printAnimals);
    }
}
