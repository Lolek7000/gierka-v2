package gierka;

import java.util.ArrayList;
import java.util.List;

public class Budynki {
    List bld = new ArrayList();

    List Buduj(String pole, int bud){
        if (bud == 1) {
            bld.add(pole + 1);
            System.out.println("gratulacje zbudowales farme");
            return bld;
        } else if (bud == 2) {
            bld.add(pole + 2);
            System.out.println("gratulacje zbudowales kamieniolom");
            return bld;
        } else if (bud == 3) {
            bld.add(pole + 3);
            System.out.println("gratulacje zbudowales tartak");
            return bld;
        }
        else{
            return bld;
        }

    }
}


