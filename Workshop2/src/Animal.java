import java.util.Scanner;

public class Animal {
    private String name;
    private int age;
    private double weight;
    private String color;

    public Animal() {
    }

    public Animal(String name, int age, double weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public Animal(String name, double weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        name = name.toLowerCase().trim();
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        color = color.trim();
        if(color.length() > 3) {
            return color.substring(0, 3).toUpperCase();
        }
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + getName() + '\'' +
                ", color=" + getColor() +
                ", age=" + age +
                ", weight='" + weight + '\'' +
                '}';
    }

    public void eat() {
        System.out.println(getName()+" is eating");
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine().trim();
        System.out.print("Enter age: ");
        age = Integer.parseInt(sc.nextLine().trim());
        System.out.print("Enter color: ");
        color = sc.nextLine().trim();
        System.out.print("Enter weight: ");
        weight = Double.parseDouble(sc.nextLine());
    }
}
