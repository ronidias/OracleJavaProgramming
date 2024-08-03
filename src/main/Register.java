package main;

import java.util.ArrayList;
import java.util.List;

public record Register(String SCIENTIFIC_NAME, String POPULAR_NAME, int AGE, double MASSA, List<String> HABITAT) {

    public Register {
        HABITAT = new ArrayList<>(HABITAT);
    }

    @Override
    public List<String> HABITAT() {
        return HABITAT;
    }
    @Override
    public String toString() {
        String info = "Nome Científico = " + SCIENTIFIC_NAME + " Nome Popular = " + POPULAR_NAME + " Idade = " + AGE + " Massa = " + MASSA + " Habitat = " + HABITAT;

        return info;
    }


}
