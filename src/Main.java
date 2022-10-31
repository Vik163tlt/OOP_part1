import transport.Bus;
import transport.Car;
import transport.Train;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println("Класс Human:\n");

        Human maxim = new Human ("Максим","Минск", 35, "бренд-менеджер");
        Human anna = new Human ("Анна", "Москва", 29,"методист образовательных программ");
        Human kate = new Human ("Катя", "Калининград", 28, "продакт-менеджер");
        Human artem = new Human ("Артем","Москва",-27, "директор по развитию бизнеса");
        Human vladimir = new Human("Владимир", "Казань", 21, null);

        System.out.println(maxim);
        System.out.println(anna);
        System.out.println(kate);
        System.out.println(artem);
        System.out.println(vladimir);

        System.out.println("\nКласс transport.Car:\n");

        Car ladaGranta = new Car (null,"Granta",1.7,"желтый",2015,"Россия", "автоматическая","седан","x777xx177", 5,true);
        Car audi_A8 = new Car ("Audi","A8 50L TDI quattro,",3.0,"черный",2020,"Германия", "механическая","седан","o505oo177rus", 5,true);
        Car bmw_Z8 = new Car ("BMW","Z8",3.0,"черный",2021,"Германия", "автоматическая","хетчбек","o111oo177rus", 5,false);
        Car kiaSportage_4 = new Car ("Kia","Sportage 4-го поколения",2.4,"красный",2018,"Южная Корея", "автоматическая","седан","x123xx177rus", 5,false);
        Car hyundaiAvante  = new Car("Hyundai","Avante",1.6 ,"оранжевый",2016,"Южная Корея", "механическая","хетчбек","x010xx001", 5,true);

        System.out.println(ladaGranta);
        System.out.println(audi_A8);
        System.out.println(bmw_Z8);
        System.out.println(kiaSportage_4);
        System.out.println(hyundaiAvante);

        System.out.println();


        Car.Key key1 = new Car.Key(true,false);
        Car.Key key2 = new Car.Key(false,true);

        System.out.println(key1);
        System.out.println(key2);

        System.out.println();


        Car.insurance insurance1 = new Car.insurance(LocalDate.now().plusMonths(5),-5420,"124448999");
        Car.insurance insurance2 = new Car.insurance(null,10500,"  ");


        System.out.println(insurance1);
        System.out.println(insurance2);

        System.out.println("\nКласс transport.Train:\n");

        Train train1 = new Train("Ласточка","B-901",2011,"Россия",null,301,3500,0,"Белорусский вокзал","Минск-Пассажирский",11);
        Train train2 = new Train("Ленинград","D-125",2019 ,"Россия",null,270 ,1700 ,0,"Ленинградский вокзал","Ленинград-Пассажирский",8);

        System.out.println(train1);
        System.out.println(train2);

        System.out.println("\nКласс transport.Bus:\n");

        Bus bus1 = new Bus("Газ","B-901",2011,"Россия","зеленый",90);
        Bus bus2 = new Bus("Икарус","D-125",2019 ,"Венгрия",null,70);
        Bus bus3 = new Bus("Ман","А-100",2013 ,"Германия","красный",-100);

        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);

        System.out.println("\nКласс Flower:\n");

        Flower ordinaryRose = new Flower("Роза обыкновенная","","Голландия",35.59,0);
        Flower chrysanthemum = new Flower("Хризантема",null,"",15,5);
        Flower peony = new Flower("Пион",null,"Англия",69.9,1);
        Flower gypsophila = new Flower("Гипсофила",null,"Турция",19.5,10);

        ordinaryRose.printFlower();
        chrysanthemum.printFlower();
        peony.printFlower();
        gypsophila.printFlower();

        Bouquet bouquet = new Bouquet (new Flower[] {ordinaryRose , ordinaryRose , ordinaryRose , chrysanthemum , chrysanthemum , chrysanthemum , chrysanthemum , chrysanthemum , gypsophila});
        System.out.printf("\nЦена букета: %.2f\n" ,bouquet.getCost());
        System.out.println("Стойкость букета: " + bouquet.getLifeSpan() + " дня/дней");

    }
}