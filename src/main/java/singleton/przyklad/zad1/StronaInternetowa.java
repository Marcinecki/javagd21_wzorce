package singleton.przyklad.zad1;

public class StronaInternetowa implements IGeneratorTicketow{

    @Override
    public int generujTicket() {
        return GenetatorIicketow.getInstance().pobierznastepnyNumerek();
    }
}
