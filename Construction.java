package gierkaV2;

import gierkaV2.Buildings.Farma;
import gierkaV2.Buildings.Kamieniolom;
import gierkaV2.Buildings.Tartak;
import java.util.List;
public class Construction {
    Farma farma = new Farma();
    Kamieniolom kamieniolom = new Kamieniolom();
    Tartak tartak = new Tartak();
    CheckIT check  = new CheckIT();
    List building(int build, Sources src) {
        if (build == 1) {
            if(check.checkSources(src.wood, src.stone, farma.woodPrice, farma.stonePrice) == null){
                src.wood -= farma.woodPrice;
                src.stone -= farma.stonePrice;
                List result = farma.build();
                src.addFood(15);
                System.out.println("Gratulacje zbudowales farme");
                return result;}
            else{
                System.out.println(check.checkSources(src.wood, src.stone, farma.woodPrice, farma.stonePrice));
                return null;}
        } else if (build == 2) {
            if(check.checkSources(src.wood, src.stone, kamieniolom.woodPrice, kamieniolom.stonePrice) == null){
                src.wood -= kamieniolom.woodPrice;
                src.stone -= kamieniolom.stonePrice;
                List result = kamieniolom.build();
                src.addStone(15);
                System.out.println("Gratulacje zbudowales kamieniolom");
                return result;}
            else{
                System.out.println(check.checkSources(src.wood, src.stone, farma.woodPrice, farma.stonePrice));
                return null;}
        } else if (build == 3) {
            if(check.checkSources(src.wood, src.stone, tartak.woodPrice, tartak.stonePrice) == null){
                src.wood -= tartak.woodPrice;
                src.stone -= tartak.stonePrice;
                List result = tartak.build();
                src.addWood(15);
                System.out.println("Gratulacje zbudowales tartak");
                return result;}
            else{
                System.out.println(check.checkSources(src.wood, src.stone, farma.woodPrice, farma.stonePrice));
                return null;}
        } else {
            System.out.println("nie ma takiego budynku");
            return null;
        }
    }void destruction(int bud, Sources src,int lvl){
        if(bud == 1){
            src.foodPT -= 15 * lvl;
            System.out.println("pomyślnie zburzyłeś farmę");
        }else if(bud == 2){
            src.stonePT -= 15 * lvl;
            System.out.println("pomyślnie zburzyłeś kamieniołom");
        }else if(bud == 3){
            src.woodPT -= 15 * lvl;
            System.out.println("pomyślnie zburzyłeś tartak");
        }
    }
}

