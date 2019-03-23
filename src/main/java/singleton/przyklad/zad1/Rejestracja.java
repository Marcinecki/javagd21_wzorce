package singleton.przyklad.zad1;

public class Rejestracja implements  IGeneratorTicketow{
    public int generujTicket() {
        return  GenetatorIicketow.getInstance().pobierznastepnyNumerek();
    }
}
