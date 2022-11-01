public class Flower {
    private String nameflower;
    private String color;
    private String country;
    private double cost;
    public int lifeSpan;

    public Flower (String nameflower, String color, String country, double cost, int lifeSpan) {
        this.nameflower = nameflower;
        setColor(color);
        setCost(cost);
        setCountry(country);
        setLifeSpan(lifeSpan);
    }

        public String getColor () {
            return color;
    }

        public Flower setColor (String color){
        this.color = color == null || color.isEmpty() ? "белый" : color;
            return this;
        }

        public String getCountry () {
            return country;
        }

        public Flower setCountry (String country){
        this.country = country != null && !country.isEmpty() ? country : "Россия";
            return this;
        }

        public double getCost () {
            return cost;
        }

        public Flower setCost ( double cost){
        this.cost = cost <= 0 ? 1 : cost;
            return this;
        }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public Flower setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan <= 0 ? 3 : lifeSpan;
        return this;
    }

    void printFlower () {
            System.out.printf("%s цвет: %s, страна: %s, цена: %.2f, срок хранения: %d\n",nameflower,color,country,cost,lifeSpan);
        }

}

