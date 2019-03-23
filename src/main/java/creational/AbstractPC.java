package creational;

public class AbstractPC {
    private String name;
    private ComputerBrand computerBrand;
    private int power;
    private double gpuPower;
    private boolean overclocked;

    public AbstractPC(String name, ComputerBrand computerBrand, int power, double gpuPower, boolean overclocked) {
        this.name = name;
        this.computerBrand = computerBrand;
        this.power = power;
        this.gpuPower = gpuPower;
        this.overclocked = overclocked;
    }
}
