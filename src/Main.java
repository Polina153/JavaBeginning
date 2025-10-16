import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("Denis");
        myArrayList.add("Masha");
        myArrayList.add("Rita");
        myArrayList.add("Oleg");
        myArrayList.add("Kate");
        for (int i = 0; i < myArrayList.getSize(); i++) {
            System.out.println(myArrayList.get(i));
        }
        System.out.println(myArrayList.getSize());
        myArrayList.remove("Denis");
        System.out.println();
        for (int i = 0; i < myArrayList.getSize(); i++) {
            System.out.println(myArrayList.get(i));
        }
        System.out.println(myArrayList.getSize());


    }


}

