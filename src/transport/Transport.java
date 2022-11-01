package transport;

public abstract class Transport {
    protected String brand;
    protected String model;
    protected final int productionYear;
    protected final String productionCountry;
    protected String color;
    protected int maxSpeed;

    public Transport(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {
        this.brand = validOrDefult.validOrDefult(brand, "defult");
        this.model = validOrDefult.validOrDefult(model, "defult");
        this.productionYear = productionYear <= 0 ? 2000 : productionYear;
        this.productionCountry = validOrDefult.validOrDefult(model, "defult");
        setColor(color);
        setMaxSpeed(maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public Transport setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Transport setModel(String model) {
        this.model = model;
        return this;
    }

    public int getProductionYear() {
        return productionYear;
    }


    public String getProductionCountry() {
        return productionCountry;
    }


    public String getColor() {
        return color;
    }

    public Transport setColor(String color) {
        this.color = validOrDefult.validOrDefult(color, "белый");
        return this;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public Transport setMaxSpeed(int maxSpeed) {
        this.maxSpeed = Math.max(maxSpeed, 0);
        return this;
    }
    public abstract void refill();

}

