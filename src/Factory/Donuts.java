package Factory;

public class Donuts implements IItem {
    private final int Price = 2;

    public Donuts() {
    }

    @Override
    public int getPrice() {
        return Price;
    }

    @Override
    public String getProductName() {
        return "Donut";
    }

    @Override
    public double getUnitPrice() {
        return Price;
    }

}
