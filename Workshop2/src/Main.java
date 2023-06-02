import java.util.Scanner;

public class Main {
    private static Scanner sc;
    private static int numberCat;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Animal animal = new Animal();
        while (true) {
            menu();
            System.out.print("Enter a number: ");
            int number = Integer.parseInt(sc.nextLine());
            switch (number) {
                case 1:
                    animal = new Dog();
                    animal.input();
                    boolean flagDog = true;
                    while (flagDog) {
                        menuDog();
                        System.out.print("Enter a number: ");
                        int numberDog = Integer.parseInt(sc.nextLine());
                        switch (numberDog) {
                            case 1:
                                System.out.println(animal);
                                break;
                            case 2:
                                ((Dog) animal).bark();
                                break;
                            case 3:
                                ((Dog) animal).fetch();
                                break;
                            default:
                                flagDog = false;
                                break;
                        }
                    }
                    break;
                case 2:
                    animal = new Cat();
                    animal.input();
                    boolean flagCat = true;
                    while (flagCat) {
                        menuCat();
                        System.out.print("Enter a number: ");
                        int numberCat = Integer.parseInt(sc.nextLine());
                        switch (numberCat) {
                            case 1:
                                System.out.println(animal);
                                break;
                            case 2:
                                ((Cat) animal).scratch();
                                break;
                            default:
                                flagCat = false;
                                break;
                        }
                    }

                    break;
                default:
                    System.out.println("Exit program");
                    System.exit(0);
            }
        }
    }

    public static void menu() {
        System.out.println("======== MENU ========");
        System.out.println("1. Test Dog");
        System.out.println("2. Test Cat");
        System.out.println("0. Exit");
    }

    public static void menuCat() {
        System.out.println("======== Test Cat ========");
        System.out.println("1. Test Constructor");
        System.out.println("2. Test scratching() method");
        System.out.println("0. Exit");
    }

    public static void menuDog() {
        System.out.println("======== Test Dog ========");
        System.out.println("1. Test Constructor");
        System.out.println("2. Test bark() method");
        System.out.println("3. Test fetch() method");
        System.out.println("0. Exit");
    }
}