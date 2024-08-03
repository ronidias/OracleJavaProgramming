package main;

import java.util.ArrayList;
import java.util.List;

public class ImutableClass {

        //Generic Propoerties
        private final String SCIENTIFIC_NAME;
        private final String POPULAR_NAME;
        private final int AGE;
        private final double MASSA;
        private final List<String> HABITAT;

        //Constructor

        public ImutableClass(String SCIENTIFIC_NAME, String POPULAR_NAME, int AGE, double MASSA, List<String> HABITAT) {
            this.SCIENTIFIC_NAME = SCIENTIFIC_NAME;
            this.POPULAR_NAME = POPULAR_NAME;
            this.AGE = AGE;
            this.MASSA = MASSA;
            this.HABITAT = new ArrayList<>(HABITAT);

        }

        //Bahaviors
        public String getSCIENTIFIC_NAME() {
            return SCIENTIFIC_NAME;
        }

        public String getPOPULAR_NAME() {
            return POPULAR_NAME;
        }

        public int getAGE() {
            return AGE;
        }

        public double getMASSA() {
            return MASSA;
        }
        public List<String> getHABITAT() {
            return HABITAT;
        }

        @Override
        public String toString() {
            return  "Nome Científico = " + SCIENTIFIC_NAME + '\n' +
                    "Nome Popular = " + POPULAR_NAME + '\n' +
                    "Idade = " + AGE + '\n' +
                    "Massa = " + MASSA + '\n' +
                    "Habitat = " + HABITAT;
        }
}

