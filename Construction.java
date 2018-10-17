package gierkaV2;

import gierkaV2.Buildings.Farma;
import gierkaV2.Buildings.Kamieniolom;
import gierkaV2.Buildings.Tartak;

import java.util.List;

public class Construction {
    Farma farma = new Farma();
    Kamieniolom kamieniolom = new Kamieniolom();
    Tartak tartak = new Tartak();

    List building(int build) {
        if (build == 1) {
            List result = farma.build();
            System.out.println("Gratulacje zbudowales farme");
            return result;
        } else if (build == 2) {
            List result = kamieniolom.build();
            System.out.println("Gratulacje zbudowales kamieniolom");
            return result;
        } else if (build == 3) {
            List result = tartak.build();
            System.out.println("Gratulacje zbudowales tartak");
            return result;
        } else {
            System.out.println("nie ma takiego budynku");
            return null;
        }
    }
}

