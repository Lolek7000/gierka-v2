package gierkaV2;
import gierkaV2.Buildings.Farma;
import gierkaV2.Buildings.Kamieniolom;
import gierkaV2.Buildings.Tartak;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WorldsApp {
    public static void main(String[] args) {
        Map<String, List<Integer>> buildings = new HashMap<>();
        CheckIT checker = new CheckIT();
        Construction con = new Construction();
        Farma farma = new Farma();
        Kamieniolom kamieniolom = new Kamieniolom();
        Tartak tartak = new Tartak();
        GameMap map = new GameMap();
        List<String> a = map.createMap();
        while (true) {
            while (true) {
                Choice choice = new Choice();
                String field = choice.selectField();
                if (a.indexOf(field) >= 0 && buildings.containsKey(field) == false) {
                    int action = choice.actions();
                    if (action == 1) {
                        int build = choice.selectBuilding();
                        List result = con.building(build);
                        if (result != null) {
                            buildings.put(field, result);
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    if (buildings.containsKey(field) == true) {
                        Integer status = buildings.get(field).get(0);
                        checker.checkBuild(status);
                        int action = choice.secondActions();
                        if (action == 1) {
                            List<Integer> lvl = buildings.get(field);
                            if (lvl.get(0) == 1) {
                                farma.upgrade(lvl);
                            }else if(lvl.get(0) == 2){
                                kamieniolom.upgrade(lvl);
                            }else if(lvl.get(0) == 3){
                                tartak.upgrade(lvl);
                            }
                        }
                        } else {
                            System.out.println("pole po za mapą");
                        }
                    }
                }
            }
        }
    }








