package transport;

import java.time.LocalDate;

public class Car extends Transport {
    private double enginVolume_L;
    private String transmission;
    private final String bodyCar;
    private String regNumber;
    private final int placesCount;
    private boolean winterTires;


    public Car(String brand, String model, double enginVolume_L, String color, int productionYear, String productionCountry, String transmission, String bodyCar, String regNumber, int placesCount, boolean winterTires) {
        super(brand,model,productionYear,color ,productionCountry,productionYear);
        this.bodyCar = validOrDefult(bodyCar, "defult");
        this.placesCount = placesCount;

        setEnginVolume_L(enginVolume_L);
        setRegNumber(regNumber);
        setTransmission(transmission);
        setWinterTires(winterTires);

    }
    public void refill(){
        if (getModel() == "Элктрокар") {
            System.out.println("Заправляется на специальных электропарковках.");}
        else {
            System.out.println("Можно заправлять бензином или дизелем на заправке.");}

    }


    public double getEnginVolume_L() {
        return enginVolume_L;
    }

    public void setEnginVolume_L(double enginVolume_L) {
        this.enginVolume_L = enginVolume_L > 0.0f ? enginVolume_L : 1.5f;
    }

    public void setTransmission(String transmission) {
        this.transmission = validOrDefult(transmission, "defult");
    }

    public String getBodyCar() {
        return bodyCar;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = validOrDefult(regNumber, "defult");
    }

    public int getPlacesCount() {
        return placesCount;
    }

    public boolean isWinterTires() {
        return winterTires;
    }

    public Car setWinterTires(boolean winterTires) {
        this.winterTires = winterTires;
        return this;
    }
/*
    public void setWinterTires(boolean winterTires) {
        boolean winterTires = true; {
        String print = String.format("Зимняя")}
        else {"Летняя"};

    }

    String printWinterTires = winterTires == true? "Зимняя" : "Летняя";
*/

    /*== true ? "Зимняя" : "Летняя";*/
    /*== true ? "Зимняя" : "Летняя";*/

    public void setSeasonTires() {
        int currentMonth = LocalDate.now().getDayOfMonth();
        this.winterTires = currentMonth < 5 || currentMonth > 10;
    }

    public boolean isRegNumberValid() {
        if (this.regNumber.length() != 9) {
            return false;
        }
        char[] regNumberChars = this.regNumber.toCharArray();
        return isNumberLetter(regNumberChars[0])
                && isNumber(regNumberChars[1])
                && isNumber(regNumberChars[2])
                && isNumber(regNumberChars[3])
                && isNumberLetter(regNumberChars[4])
                && isNumberLetter(regNumberChars[5])
                && isNumber(regNumberChars[6])
                && isNumber(regNumberChars[7])
                && isNumber(regNumberChars[8]);
    }
    private boolean isNumber(char symbol) {
        return Character.isDigit(symbol);
    }

    private boolean isNumberLetter(char symbol) {
        String allowedSymbols = "АВЕКМНОРСТУХ";
        return Character.isDigit(symbol);
    }

    private String validOrDefult(String value, String defultValue) {
        return value == null || value.isBlank() ? defultValue : value;
    }
    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean notKeyAccess;

        public Key(boolean remoteEngineStart, boolean notRemoteEngineStart) {
            this.remoteEngineStart = remoteEngineStart;
            this.notKeyAccess = notRemoteEngineStart;
        }
        public boolean getRemoteEngineStart() {
            return remoteEngineStart;
        }
        public boolean getNotKeyAccess() {
            return notKeyAccess;
        }

        public boolean isRemoteEngineStart() {return remoteEngineStart;}
        public boolean isNotKeyAccess() {return notKeyAccess;}

        public String toString() {
            return "Удаленный запуск двигателя: " + (isRemoteEngineStart()== true ? " есть" : "нет" )+ ", Безключевой доступ: " + (isNotKeyAccess()== true ? " есть" : "нет");
        }

    }
    public static class insurance {
        private final LocalDate tern;
        private final float cost;
        private final String number;

        public LocalDate getTern() {
            return tern;
        }
        public float getCost() {
            return cost;
        }
        public String getNumber() {
            return number;
        }

        public insurance(LocalDate tern, int cost, String number) {
            this.tern = tern != null ? tern : LocalDate.now().plusDays(14);
            this.cost = Math.max(cost,1);
            this.number = number == null || number.isBlank() ? "!Номер отсутствует!" : number;
        }
        public boolean isNumberValid() {
            return  number.length() ==9;
        }
        public boolean isInsuranceValid() {
            return LocalDate.now().isBefore(this.tern);
        }

        public String toString() {
            return "Номер: "+ number+  ", Дата: " + tern + ", Стоимость: " + cost;
        }
    }

    public String toString() {
        return brand + " " + model + ", объем двигателя: " + enginVolume_L + ", цвет: " + color + ", год производства: " + productionYear + ", страна сборки: " + productionCountry + ", Коробка передач: " + transmission + ", Тип кузова: " + bodyCar + ", Регистрационный номер: " + regNumber + ", Количество мест: " + placesCount + ", Резина: " + (winterTires == true ? "Зимняя" : "Летняя");
    }
}

