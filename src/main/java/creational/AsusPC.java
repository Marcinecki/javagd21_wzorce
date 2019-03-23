package creational;

public class AsusPC extends AbstractPC {
    public AsusPC(String name, int power, double gpuPower, boolean overclocked){
        super(name, ComputerBrand.ASUS, power, gpuPower, overclocked);
    }

    public static AsusPC createAsusN53(){
        return new AsusPC("N53", 100, 100, false);
    }
}
