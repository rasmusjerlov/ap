public class Indkoeber implements Observer{
    private String navn;

    public Indkoeber(String navn) {
        this.navn = navn;
    }

    @Override
    public void update(Subject subject) {
        if (subject instanceof BogTitel) {
            BogTitel bogTitel = (BogTitel) subject;
            if (bogTitel.getAntal() < 6) {
                System.out.println("Der er færre end 6 stk. af: " + bogTitel.getTitel());
                bogTitel.indkoebTilLager(10);
            }

        }
    }

    public String getNavn() {
        return navn;
    }
}
