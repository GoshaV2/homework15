import transport.Car;

import java.util.concurrent.Flow;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        humanTask();
        flowerTask();
        carTask();
    }

    private static void humanTask() {
        Human vladimir = new Human(21, "Владир", "Казань", "нигде не работает");
        vladimir.greet();
    }

    private static void flowerTask() {
        Flower roza = new Flower("Роза", "Голландия", 35.59);
        Flower xrizantema = new Flower("Хризантема", 15, 5);
        Flower pion = new Flower("Пион ", "Англия", 69.9, 1);
        Flower gipsofila = new Flower("Гипсофила", "Турция", 19.5, 10);
        roza.printInfo();
        xrizantema.printInfo();
        pion.printInfo();
        gipsofila.printInfo();
        printInfoOfBouquet(new Flower[]{roza, xrizantema, pion, gipsofila});
    }

    private static void printInfoOfBouquet(Flower flowers[]) {
        double cost = 0;
        int lifeSpan = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (lifeSpan >= flower.getLifeSpan()) {
                lifeSpan = flower.getLifeSpan();
            }
            cost += flower.getCost();
        }
        System.out.println("Стоимость букета: " + cost + ", срок жизни: " + lifeSpan);
    }

    private static void carTask() {
        Car bmw = new Car("bmw", "amg", 2000, "German", "", 4);
        bmw.setRegNumber("t100yy123");
        Car.Key key = new Car.Key(true, true);
        Car.Insurance insurance = new Car.Insurance(2025, 2332, "123456789");
        insurance.checkYearOfEnding(2023);
        insurance.checkYearOfEnding(2027);
        System.out.println(bmw);
        System.out.println(key);
        System.out.println(insurance);
    }
}