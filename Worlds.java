package gierka;


import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Worlds {
    public static void main(String[] args) {
        Mapa mapa = new Mapa();
        List a = mapa.tworzmape();
        Kontroler kon = new Kontroler();
        Budynki build = new Budynki();
        List wynik = new ArrayList();
        while (true) {
            Wybor wbp = new Wybor();
            String pole = wbp.wybierzPole();
            if (a.indexOf(pole) >= 0){
                int bud = wbp.wybierzBudynek();
                wynik = build.Buduj(pole, bud);
                a.remove(pole);

            }
            else {
                System.out.println(kon.coTuJest(pole,wynik));






                    }

                }

            }
        }






