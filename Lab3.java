import java.util.Scanner;

public class Lab3 {

    public static void main(String[] args) {

        // Part 1: TwoDimArray
        TwoDimArray td = new TwoDimArray();
        td.generate3X5();

        // Part 2: Dice Simulation
        Dice dice1, dice2;
        int rollCount;

        dice1 = new Dice();
        dice2 = new Dice();
        rollCount = 0;

        System.out.println("\n--- (문제3-2) 4장 Mini Project - 주사위 클래스 ---");
        do {
            dice1.roll();
            dice2.roll();
            System.out.println("주사위1= " + dice1.getValue() + " 주사위2= " + dice2.getValue());
            rollCount++;
        } while ((dice1.getValue() + dice2.getValue()) != 2);

        System.out.println("(1, 1)이 나오는데 걸린 횟수= " + rollCount);

        // Part 3: Dog Class
        System.out.println("\n--- (문제3-3) Dog 클래스 만들기 ---");
        String name, breed;
        int age;
        Scanner sc = new Scanner(System.in);

        System.out.print("강아지 이름, 종류, 나이: ");
        name = sc.next();
        breed = sc.next();
        age = sc.nextInt();
        Dog dog1 = new Dog(name, breed, age);
        System.out.println(dog1);
        dog1.barking();

        sc.close(); // Close the scanner to prevent resource leaks
    }
}
