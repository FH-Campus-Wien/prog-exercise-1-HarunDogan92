package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld() {
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        System.out.println("0123456789012345678901" + System.lineSeparator() +
                "         __" + System.lineSeparator() +
                " _(\\    |@@|" + System.lineSeparator() +
                "(__/\\__ \\--/ __" + System.lineSeparator() +
                "   \\___|----|  |   __" + System.lineSeparator() +
                "       \\ }{ /\\ )_ / _\\" + System.lineSeparator() +
                "       /\\__/\\ \\__O (__" + System.lineSeparator() +
                "      (--/\\--)    \\__/" + System.lineSeparator() +
                "      _)(  )(_" + System.lineSeparator() +
                "     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        int in = 'Z';
        int in1 = 0xface;
        float fl = 5.5f;
        int in2 = 012;
        double d1 = 80L;
        float fl2 =  44e-1f;
        double dou1 = 8.88e1;
        double dou2 = 99.9;

        int sum = in + in1 + (int) fl + in2 + (int) d1 + (int) fl2 + (int) dou1 + (int) dou2;
        System.out.println(sum);
    }

    //todo Task 4
    public void addTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();
        System.out.println(input1 + input2);

    }

    //todo Task 5
    public void swapTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Before Swap:\r\nx: ");
        int input1 = scanner.nextInt();
        System.out.print("y: ");
        int input2 = scanner.nextInt();

        System.out.println("After Swap:\r\nx: " + input2 + "\r\ny: " + input1);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("n1: ");
        int input1 = scanner.nextInt();
        System.out.print("n2: ");
        int input2 = scanner.nextInt();
        if (input2 == input1) {
            System.out.println("n1 == n2");
        } else if (input1 > input2) {
            System.out.println("n1 > n2");
        } else {
            System.out.println("n2 > n1");
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter annual Revenue: ");
        int input = scanner.nextInt();

        if (input < 0 || input >= 100000) {
            System.out.println("Invalid Revenue");
        } else if(input < 20001) {
            System.out.println("Poor Sales Revenue");
        } else if(input < 50001) {
            System.out.println("Average Sales Revenue");
        } else if(input < 80001) {
            System.out.println("Good Sales Revenue");
        } else {
            System.out.println("Excellent Sales Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter CommissionClass: ");
        int input = scanner.nextInt();
        double provision;
        switch (input){
            case 1:
                provision = 0.01;
                break;
            case 2:
                provision = 0.02;
                break;
            case 3:
                provision = 0.03;
                break;
            case 4:
                provision = 0.04;
                break;
            default:
                provision = 0.0;
        }
        System.out.println("Your Commission Rate was set to " + provision);
    }

    //todo Task 9
    public void leapyear(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Year: ");
        int input = scanner.nextInt();
        if (input % 4 == 0 && input % 400 == 0) {
            System.out.println("Leapyear");
        } else {
            System.out.println("Not a Leapyear");
        }
    }

    //todo Task 10
    public void transposedNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int input = scanner.nextInt();
        int int1, int2, int3;

        int1 = input / 100;
        int2 = (input / 10) % 10;
        int3 = input % 10;
        System.out.println(int3 + "" + int2  + int1);
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}