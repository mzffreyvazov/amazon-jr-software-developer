public class Person {
    private String name;
    private int age;
    private double weight;

    Person(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String toString() {
        return String.format("Name: %s, Age: %d, Weight: %.2f", name, age, weight);

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    
}
