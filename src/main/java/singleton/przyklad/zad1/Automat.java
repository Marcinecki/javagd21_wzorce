package singleton.przyklad.zad1;

public class Automat implements IGeneratorTicketow {
    public int generujTicket() {
        return  GenetatorIicketow.getInstance().pobierznastepnyNumerek();
    }
}
