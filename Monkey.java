public class Monkey extends Animal {
    private String foodType;

    public Monkey(int age, double weight, String foodType) {
        super(age, weight);
        this.foodType = foodType;
    }

    @Override
    public void eatFood() {
        System.out.println("This monkey loves " + foodType);
    }

    @Override
    public void printInfo() {
        System.out.println("Monkey: My age is " + age + ", my weight is " + weight + ", I love eating " + foodType);
    }
}