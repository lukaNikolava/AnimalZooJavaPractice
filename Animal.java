public class Animal {

    protected int age;
    protected double weight;

    public Animal(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    public void eatFood() {
        System.out.println("Animal is eating food");
    }

    public void printInfo() {
        System.out.println("My age is " + age + ", my weight is " + weight);
    }

    public int getAge() {
        return age;
    }
}
