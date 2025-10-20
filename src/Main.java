import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*//Exception Example:
        int a, b;
        try {
            a = 0;
            b = 10 / a;
            System.out.println("Это сообщение не будет выведено в консоль");
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        } catch (Exception e) {
            System.out.println("Some exception");
        } finally {
            System.out.println("Завершение работы");
        }
*/
        //Задача:
        //Даны классы Apple и Orange;

        //Класс Basket, в который можно складывать фрукты. Корзины условно сортируются по типу фрукта, поэтому в одну корзину
        //нельзя сложить и яблоки, и апельсины. Есть возможность создавать смешанные корзины, куда можно складывать любые фрукты;

        //Для хранения фруктов внутри корзины можно использовать ArrayList;

        //Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
        // вес яблока – 1.0, апельсина – 1.5;

        //Внутри класса Basket сделать методы:
        //  - add() для добавления фруктов
        //  - compare(), который позволяет сравнить текущую корзину с той, которую подадут в compare() в качестве параметра.
        // Можно сравнивать корзины с разными фруктами;

        // * Написать метод, который позволяет пересыпать фрукты из текущей корзины в другую.
        // Помним про сортировку фруктов: нельзя яблоки высыпать в корзину для апельсинов, только в корзину для яблок или же смешанную.
        // Соответственно, в текущей корзине фруктов не остается, а в другую перекидываются объекты, которые были в первой;


        Basket<Orange> orangeBasket = new Basket<>();
        orangeBasket.add(new Orange());
        orangeBasket.add(new Orange());
        orangeBasket.add(new Orange());
        System.out.println("Orange basket weight is: " + orangeBasket.getBasketWeight());

        Basket<Apple> appleBasket = new Basket<>();
        appleBasket.add(new Apple());
        System.out.println("Apple basket weight is: " + appleBasket.getBasketWeight());

        Basket<Fruit> fruitBasket = new Basket<>();
        fruitBasket.add(new Orange());
        fruitBasket.add(new Apple());
        System.out.println("Fruit basket weight is: " + fruitBasket.getBasketWeight());


        System.out.println(orangeBasket.compare(appleBasket));
        System.out.println(appleBasket.compare(appleBasket));
        System.out.println(appleBasket.compare(orangeBasket));

        Basket<Orange> orangeBasket2 = new Basket<>();
        orangeBasket2.add(new Orange());

        System.out.println("First case");
        Basket.transfer(orangeBasket, orangeBasket2);
        System.out.println("Orange basket2 weight is: " + orangeBasket2.getBasketWeight());
        System.out.println("Orange basket weight is: " + orangeBasket.getBasketWeight());

        System.out.println("Second case");
        //Basket.transfer(appleBasket, orangeBasket2);
        System.out.println("Orange basket2 weight is: " + orangeBasket2.getBasketWeight());
        System.out.println("Orange basket weight is: " + appleBasket.getBasketWeight());

        System.out.println("Third case");
        Basket.transfer(appleBasket, fruitBasket);
        System.out.println("Fruit basket weight is: " + fruitBasket.getBasketWeight());
        System.out.println("Apple basket weight is: " + appleBasket.getBasketWeight());
    }


}

