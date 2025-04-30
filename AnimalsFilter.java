import java.util.List;
import java.util.stream.Collectors;

public class AnimalsFilter {
    public static List<Animal> filterByAge(List<Animal> animals, int minAge) {
        return animals.stream().filter(a -> a.getAge() > minAge).collect(Collectors.toList());
    }
}