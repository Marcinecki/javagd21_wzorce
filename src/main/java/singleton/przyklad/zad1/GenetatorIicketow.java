package singleton.przyklad.zad1;

public class GenetatorIicketow {
    private static GenetatorIicketow ourInstance = new GenetatorIicketow();

    public static GenetatorIicketow getInstance() {
        return ourInstance;
    }

    private GenetatorIicketow() {
    }

    public int numerek = 1;

    public int pobierznastepnyNumerek(){
        return numerek++;

    }
}
