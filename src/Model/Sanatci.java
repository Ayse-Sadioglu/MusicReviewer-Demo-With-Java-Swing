package Model;

import java.io.Serializable;

public class Sanatci implements Serializable {
    String sanatci_ismi;
    String sanatci_id;

    public Sanatci(String id, String isim) {
        sanatci_ismi = isim;
        sanatci_id = id;
    }

    public String getSanatciID() {
        return sanatci_id;
    }

    public String getSanatciIsmi() {
        return sanatci_ismi;
    }

    // id key oldugundan set methodu yoktur

    public void setSanatciIsmi(String isim) {
        sanatci_ismi = isim;
    }
}
