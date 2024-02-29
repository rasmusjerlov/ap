import java.util.ArrayList;

public class BogTitel implements Subject{
    private String titel;
    private int antal;
    private ArrayList<Kunde> kunder = new ArrayList<>();
    private ArrayList<Observer> observers = new ArrayList<>();
    public BogTitel(String titel, int antal) {
        this.titel = titel;
        this.antal = antal;
    }


    public void indkoebTilLager(int antal) {
        this.antal += antal;
        notifyObservers();
    }
    public void etKoeb(Kunde kunde) {
        kunde.addBogTitel(this);
        this.addKunde(kunde);
        this.antal--;
        notifyObservers();
    }
    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
    public void addKunde(Kunde kunde) {
        if (!kunder.contains(kunde)) {
            kunder.add(kunde);
            kunde.addBogTitel(this);
        }
    }
    public void removeKunde(Kunde kunde) {
        if (kunder.contains(kunde)) {
            kunder.remove(kunde);
            kunde.removeBogTitel(this);
        }
    }

    public String getTitel() {
        return titel;
    }

    public int getAntal() {
        return antal;
    }

    public ArrayList<Kunde> getKunder() {
        return kunder;
    }

    public ArrayList<Observer> getObservers() {
        return observers;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}
