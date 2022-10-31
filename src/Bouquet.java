public class Bouquet {
    public Flower[] flowers;
    public Bouquet(Flower[]flowers) {
        this.flowers = flowers;
    }


    public double getCost() {
        double sum = 0;
        for (Flower nameflower : flowers) {
            if (nameflower != null) {
                sum += nameflower.getCost();
            }
        }
        return sum + sum * 0.1f;
    }

    public int getLifeSpan() {
        int minLifeSpan = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flowers != null && flower.getLifeSpan() < minLifeSpan) {
                minLifeSpan = flower.getLifeSpan();
            }
        }
        return minLifeSpan;
    }
}
