import javax.swing.*;
import java.util.ArrayList;

public class Kunde {
    private String navn;
    private ArrayList<BogTitel> bogTitler = new ArrayList<>();
    public Kunde(String navn) {
        this.navn = navn;
    }
    public void addBogTitel(BogTitel bogTitel) {
        if (!bogTitler.contains(bogTitel)) {
            bogTitler.add(bogTitel);
            bogTitel.addKunde(this);
        }

    }
    public void removeBogTitel(BogTitel bogTitel) {
        if (bogTitler.contains(bogTitel)) {
            bogTitler.remove(bogTitel);
            bogTitel.removeKunde(this);
        }
    }

    public String getNavn() {
        return navn;
    }

    public ArrayList<BogTitel> getBogTitler() {
        return bogTitler;
    }
}
