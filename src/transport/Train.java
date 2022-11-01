package transport;

public class Train extends Transport {
    private float price;
    private int time;
    private String beginStation;
    private String endStation;
    private int carriageNumber;

    public Train(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed, float price,int time,String beginStation,String endStation,int carriageNumber) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        setPrice(price);
        setTime(time);
        setBeginStation(beginStation);
        setEndStation(endStation);
        setCarriageNumber(carriageNumber);
    }
    public void refill(){
        System.out.println("Необходим заправлять дизелем.");

    }

    public float getPrice() {
        return price;
    }

    public Train setPrice(float price) {
        this.price = Math.max(price, 0);
        return this;
    }

    public int getTime() {
        return time;
    }

    public Train setTime(int time) {
        this.time =  time <=0 ? 30 : time;
        return this;
    }

    public String getBeginStation() {
        return beginStation;
    }

    public Train setBeginStation(String beginStation) {
        this.beginStation = validOrDefult.validOrDefult(beginStation, "defult");
        return this;
    }

    public String getEndStation() {
        return endStation;
    }

    public Train setEndStation(String endStation) {
        this.endStation = validOrDefult.validOrDefult(endStation, "defult");
        return this;
    }

    public int getCarriageNumber() {
        return carriageNumber;
    }

    public Train setCarriageNumber(int carriageNumber) {
        this.carriageNumber = Math.max(carriageNumber, 1);
        return this;
    }

    public String toString() {
        return "Поезд: " + getBrand() + " " + getModel() + ", " +
                "цена поездки: " + price +
                ", время в пути: " + time +
                ", станция отправления: " + beginStation +
                ", станция прибывания: " + endStation +
                ", количество вагонов: " + carriageNumber;
    }
}
