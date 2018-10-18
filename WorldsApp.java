package gierkaV2;
import gierkaV2.Buildings.Farma;
import gierkaV2.Buildings.Kamieniolom;
import gierkaV2.Buildings.Tartak;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;

public class WorldsApp {
    public static void main(String[] args) {
        Map<String, List<Integer>> buildings = new HashMap<>();
        Sources src = new Sources();
        src.food = 200;
        src.stone = 700;
        src.wood = 700;
        CheckIT checker = new CheckIT();
        Construction con = new Construction();
        Farma farma = new Farma();
        Kamieniolom kamieniolom = new Kamieniolom();
        Tartak tartak = new Tartak();
        GameMap map = new GameMap();
        List<String> a = map.createMap();
        Timer timer = new Timer();
        timer.schedule(src,0,6000);
        while (true){
            while(true){
                src.sourcesStatic(src);
                Choice choice = new Choice();
                String field = choice.selectField();
                if (a.indexOf(field) >= 0 && buildings.containsKey(field) == false) {
                    int action = choice.actions();
                    if (action == 1) {
                        int build = choice.selectBuilding();
                        List result = con.building(build, src);
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
                            con.upgrade(lvl, src);
                            }
                        else if(action == 2){
                            int bud = buildings.get(field).get(0);
                            int lvl = buildings.get(field).get(1);
                            con.destruction(bud, src, lvl);
                            buildings.remove(field);
                        }
                        } else {
                            System.out.println("pole po za mapą");
                        }
                    }
                }
            }
        }
    }








