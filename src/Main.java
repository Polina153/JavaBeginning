import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//Создать метод, который принимает кол-во секунд от пользователя,
// потом выводит в консоль сколько это дней, часов, минут и секунд
        calculateSecondsFromUser();

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

