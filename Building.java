package gierka;

import java.util.ArrayList;
import java.util.List;
public class Building {
    List<String> buildings = new ArrayList<>();
    List<String> build(String field, int building){
        if (building == 1) {
            buildings.add(field + 1);
            System.out.println("gratulacje zbudowales farme");
            return buildings;
        } else if (building == 2) {
            buildings.add(field + 2);
            System.out.println("gratulacje zbudowales kamieniolom");
            return buildings;
        } else if (building == 3) {
            buildings.add(field+ 3);
            System.out.println("gratulacje zbudowales tartak");
            return buildings;
            //tu niĹĽej else moĹĽe byÄ‡ w tej samej linii i spacja po else
        } else{

            // TODO uĹĽytkownik moĹĽe wpisaÄ‡ "a" zamiast liczby i co wtedy? :D
            // leci bĹ‚Ä…d, sytuacje brzegowe trzeba jakoĹ› obsĹ‚uĹĽyÄ‡ ;)
            // np sprawdziÄ‡ czy to coĹ› innego niĹĽ cyfra i napisaÄ‡, ĹĽe dozwolone tylko podane liczby
            return buildings;
        }

    }
}


