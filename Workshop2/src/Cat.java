public class Cat extends Animal{
    public Cat() {
    }

    public Cat(String name, int age, double weight, String color) {
        super(name, age, weight, color);
    }

    public void scratch() {
        System.out.println(getName() +" have "+getColor()+" color.");
    }
}
