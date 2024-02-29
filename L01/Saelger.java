import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Saelger implements Observer{
    private String navn;
    private Set<BogTitel> bogtitler = new HashSet<>();
    public Saelger(String navn) {
        this.navn = navn;
    }

    @Override
    public void update(Subject subject) {
        Set<Kunde> kundeSet = new HashSet<>();
        if (subject instanceof BogTitel) {
            BogTitel bogTitel = (BogTitel) subject;
            bogtitler.add(bogTitel);
        }
    }

    public String getNavn() {
        return navn;
    }
}
