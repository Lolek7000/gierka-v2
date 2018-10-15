package gierka;

import java.util.ArrayList;
import java.util.List;

public class GameMap {

    String[] wysokosc = {"1", "2", "3", "4", "5"};
    String[] dlugosc = {"a", "b", "c", "d", "e"};
    List<String> gameField = new ArrayList<>();

    List createMap(){
        for (String i : wysokosc) {
            for (String j : dlugosc) {
                gameField.add(i + j);
            }
        }
        return gameField;
    }

}