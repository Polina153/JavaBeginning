import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//Создать метод, который принимает кол-во секунд от пользователя,
// потом выводит в консоль сколько это дней, часов, минут и секунд
        /*byte a = 127;
        a += 10;
        short b, c, d;
        Byte as = a;
        b = 400;
        c = 500;
        d = 600;
        int age = 50;
        age -= 30;
        age += 1;// аналогично age++;
        age --;
        char symbol = 36;
        System.out.println("Hello" + " world! " + symbol);
        System.out.println(symbol + 1);
        boolean logicType = true;
        System.out.println(a);
        System.out.println(age);
        System.out.println();
        System.out.println(c);*/
        /*int i = 1000;
        while (i == 0) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i--;
        }
        System.out.println("Цикл завершен");

        int a = 0;
        do {
            System.out.println("Hello!");
        } while (a > 0);*/
      /*  int summ = 0;
        for (int a = 0; a <= 100; a++) {
            summ += a;
        }

        System.out.println("Сумма всех чисел от 1 до 100 (включительно) равна " + summ);*/
        //calculateSecondsFromUser();
        //switchMethod();
        //ifMethod();
        //conditioning();

        Cat cat = new Cat();
        Cat cat1 = new Cat("Musya", 2, 4, false);
        cat.voice();
        cat.printInfo();
        cat1.voice();
        cat1.printInfo();
        Dog dog = new Dog("Tobik", 10, 4, true);
        dog.voice();
        dog.printInfo();
        dog.swim();
        System.out.println();

        /*System.out.println(animal1.name);
        System.out.println(animal1.age);
        System.out.println(animal1.legs);*/


    }

    private static void conditioning() {
        boolean isHot = false;
        if (isHot) {
            System.out.println("Conditioner is cooling");
        } else {
            System.out.println("Conditioner is off");
        }
    }

    private static void ifMethod() {
        System.out.println("Enter number from 1 to 5: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 1) {
            System.out.println("1");
        } else if (number == 2) {
            System.out.println("2");
        } else if (number == 3) {
            System.out.println("3");
        } else if (number == 4) {
            System.out.println("4");
        } else if (number == 5) {
            System.out.println("5");
        } else {
            System.out.println("введено число НЕ от 1 до 5!");
        }
    }

    private static void switchMethod() {
        System.out.println("Enter number from 1 to 5: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
            default:
                System.out.println("введено число НЕ от 1 до 5!");
        }
    }

    private static void calculateSecondsFromUser() {
        System.out.println("Enter amount of seconds: ");
        Scanner sc = new Scanner(System.in);
        int secondsFromUser = sc.nextInt();
        int days = (secondsFromUser / 60 / 60 / 24);
        int hours = (secondsFromUser / 60 / 60) % 24;
        int minutes = (secondsFromUser / 60) % 60;
        int seconds = secondsFromUser % minutes;
        System.out.println("There are " + days + " days");
        System.out.println("There are " + hours + " hours");
        System.out.println("There are " + minutes + " minutes");
        System.out.println("There are " + seconds + " seconds");
    }
}

