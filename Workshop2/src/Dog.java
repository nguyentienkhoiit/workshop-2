public class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public void bark() {
        System.out.println(getName()+" say Woof!");
    }

    public void fetch() {
        System.out.println(getName()+" is fetching");
    }
}
