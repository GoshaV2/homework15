import java.text.DecimalFormat;

public class Flower {
    private String flowerColor;
    private String country;
    private double cost;
    private int lifeSpan;

    public Flower() {
        flowerColor = "white";
        country = "Russia";
        cost = 1;
        lifeSpan = 3;
    }

    public Flower(String flowerColor, double cost, int lifeSpan) {
        this.flowerColor = flowerColor;
        this.cost = cost;
        this.lifeSpan = lifeSpan;
    }

    public Flower(String flowerColor, String country, double cost) {
        this.flowerColor = flowerColor;
        this.country = country;
        this.cost = trueCost(cost);
        lifeSpan = 3;
    }

    public Flower(String flowerColor, String country, double cost, int lifeSpan) {
        this.flowerColor = flowerColor;
        this.country = country;
        this.cost = trueCost(cost);
        this.lifeSpan = lifeSpan;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = trueCost(cost);
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = trueLifeSpan(lifeSpan);
    }

    private double trueCost(double cost) {
        if (cost > 0) {
            return cost;
        } else {
            return 1;
        }
    }

    private int trueLifeSpan(int lifeSpan) {
        return lifeSpan > 0 ? lifeSpan : 3;
    }

    public void printInfo() {
        System.out.printf(flowerColor + " обыкновенная из " + country + ", стоимость штуки – " + "%.2f" + " рублей \n", cost);
    }
}
