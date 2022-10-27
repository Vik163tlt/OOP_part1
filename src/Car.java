public class Car {
    public final String brand;
    public final String model;
    public double enginVolume_L;
    public String color;
    public final int productionYear;
    public final String productionCountry;

    Car (String brand, String model, double enginVolume_L, String color, int productionYear, String productionCountry) {
        if (brand == null) {
            this.brand = "default";
        } else {
        this.brand = brand;}
        if (model == null) {
            this.model = "default";
        } else {
        this.model = model;}
        if (enginVolume_L == 0) {
            this.enginVolume_L = 1.5;
        } else {
        this.enginVolume_L = enginVolume_L;}
        if (color == null) {
            this.color = "default";
        } else {
        this.color = color;}
        if (productionYear == 0) {
            this.productionYear = 2000;
        } else {
        this.productionYear = productionYear;}
        if (color == null) {
            this.productionCountry = "default";
        } else {
        this.productionCountry = productionCountry;}
    }
    void description() {
        System.out.println(brand+" "+model+", объем двигателя: "+enginVolume_L+", цвет: "+color+", год производства: "+productionYear+", страна сборки: " +productionCountry);
    }


}

