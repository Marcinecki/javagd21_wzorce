package singleton.przyklad.zad1;

public class Poczta {
    private Automat automat;
    private  Rejestracja rejestracja;
    private StronaInternetowa stronaInternetowa;

    public  Poczta(){
        this.automat = new Automat();
        this.rejestracja = new Rejestracja();
        this.stronaInternetowa = new StronaInternetowa();
    }

    public int pobierzTicketZAutomau(){
        return automat.generujTicket();
    }

    public int pobierzTicketZRejestracji(){
        return rejestracja.generujTicket();
    }

    public int pobierzTicketZeStronyInternetowej(){
        return stronaInternetowa.generujTicket();
    }
}
