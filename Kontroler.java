package gierka;

import java.util.List;
import java.util.Map;

public class Kontroler {
    Budynki bild = new Budynki();
    String coTuJest(String pole, List bld) {
        if(bld.indexOf(pole+1) >= 0){
            return "tu stoi farma!!!";
        }
        else if(bld.indexOf(pole+3) >= 0){
            return "tu stoi tartak!!!";
        }
        else if(bld.indexOf(pole+2) >= 0){
            return "tu stoi kamieniolom!!!";
        }
        else{
            return "Pole wolne";
        }



    }

}
