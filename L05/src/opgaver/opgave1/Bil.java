package opgaver.opgave1;

import java.util.Objects;

public class Bil {
    private String regnr, mærke, model, farve;

    public Bil(String regnr, String maerke, String model, String farve) {
        this.regnr = regnr;
        this.mærke = maerke;
        this.model = model;
        this.farve = farve;
    }

    public String getRegnr() {
        return regnr;
    }

    public void setRegnr(String regnr) {
        this.regnr = regnr;
    }

    public String getMærke() {
        return mærke;
    }

    public void setMærke(String mærke) {
        this.mærke = mærke;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFarve() {
        return farve;
    }

    public void setFarve(String farve) {
        this.farve = farve;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Bil) {
            Bil b = (Bil) obj;
            return b.mærke.equals(this.mærke) && b.regnr.equals(this.regnr);

        }
        return false;
    }
    @Override
    public int hashCode() {
        return Objects.hash(regnr, mærke);
    }


    @Override
    public String toString() {
        return "Bil: " +
                "\n\t regnr = " + regnr +
                "\n\t mærke = " + mærke +
                "\n\t model = " + model +
                "\n\t farve = " + farve +
                "\n";
    }
}
