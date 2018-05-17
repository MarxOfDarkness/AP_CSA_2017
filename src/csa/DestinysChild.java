package csa;

import java.util.ArrayList;

public class DestinysChild {
    public static void main(String[] args) {
        ArrayList band = new ArrayList();

        band.add("Michelle");
        band.add("Kelly");
        band.add("Beyonce");
        band.add("Farrah");

        System.out.println(band);

        int location = band.indexOf("Farrah");
        band.remove(location);

        System.out.println(band);
        System.out.println("At index 1: " + band.get(1));

        System.out.println(band);
        System.out.println("Size of the band: " + band.size());
    }
}
