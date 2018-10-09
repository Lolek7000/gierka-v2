package gierka;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mapa {
    String[] wysokosc = {"1", "2", "3", "4", "5"};
    String[] dlugosc = {"a", "b", "c", "d", "e"};
    List lista = new ArrayList();

    List tworzmape() {
        for (String i : wysokosc) {
            for (String j : dlugosc) {
                lista.add(i + j);
            }
        }
        return lista;
    }

}