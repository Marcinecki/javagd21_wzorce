package creational.Builder;

public class Main {

    public static void main(String[] args) {
        Bohater nowyhero = new Bohater.Builder().setM_hp(23).setM_height(23).
                setM_legacy("something").setM_surname("set").create();
    }
}
