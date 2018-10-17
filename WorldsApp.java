package gierka;
import gierka.Buildings.Farma;
import gierka.Buildings.Kamieniolom;
import gierka.Buildings.Tartak;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WorldsApp {
    public static void main(String[] args) {
        Map<String, List<Integer>> buildings = new HashMap<>();
        CheckIT checker = new CheckIT();
        Farma farma = new Farma();
        Kamieniolom kamieniolom = new Kamieniolom();
        Tartak tartak  = new Tartak();
        GameMap map = new GameMap();
        List<String> a = map.createMap();
        while (true) {
            while (true) {
                Choice choice = new Choice();
                String field = choice.selectField();
                if(a.indexOf(field) >= 0 && buildings.containsKey(field) == false){
                    int action = choice.actions();
                    if(action == 1){
                       int build  = choice.selectBuilding();
                       if(build == 1){
                           List result = farma.build();
                           buildings.put(field, result);
                           System.out.println(buildings);
                       }else if(build == 2){
                           List result = kamieniolom.build();
                           buildings.put(field, result);
                           System.out.println(buildings);
                       }else if(build == 3){
                           List result = tartak.build();
                           buildings.put(field, result);
                           System.out.println(buildings);
                       }
                       else{
                           System.out.println("nie ma takiego budynku");
                           break;
                       }
                    }else{
                        break;
                    }
                }else{
                    if(buildings.containsKey(field) == true){
                        Integer status = buildings.get(field).get(0);
                        checker.checkBuild(status);
                       int action = choice.secondActions();
                    }else {
                        System.out.println("pole po za mapą");
                    }
                    }
                    }
                }
                }
                }




