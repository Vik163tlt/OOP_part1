public class Main {
    public static void main(String[] args) {

        System.out.println("Класс Human:\n");

        Human maxim = new Human ("Максим","Минск", 35, "бренд-менеджер");
        Human anna = new Human ("Анна", "Москва", 29,"методист образовательных программ");
        Human kate = new Human ("Катя", "Калининград", 28, "продакт-менеджер");
        Human artem = new Human ("Артем","Москва",-27, "директор по развитию бизнеса");

        maxim.hallo();
        anna.hallo();
        kate.hallo();
        artem.hallo();

        System.out.println("\nКласс Car:\n");

        Car ladaGranta = new Car ("Lada","Granta",1.7,"желтый",2015,"Россия");
        Car audi_A8 = new Car ("Audi","A8 50L TDI quattro,",3.0,"черный",2020,"Германия");
        Car bmw_Z8 = new Car ("BMW","Z8",3.0,"черный",2021,"Германия");
        Car kiaSportage_4 = new Car ("Kia","Sportage 4-го поколения",2.4,"красный",2018,"Южная Корея");
        Car hyundaiAvante  = new Car ("Hyundai","Avante",1.6 ,"оранжевый",2016,"Южная Корея");

        ladaGranta.description();
        audi_A8.description();
        bmw_Z8.description();
        kiaSportage_4.description();
        hyundaiAvante.description();

    }
}