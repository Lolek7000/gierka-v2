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
        src.stone = 1000;
        src.wood = 1000;
        CheckIT checker = new CheckIT();
        Construction con = new Construction();
        Farma farma = new Farma();
        Kamieniolom kamieniolom = new Kamieniolom();
        Tartak tartak = new Tartak();
        GameMap map = new GameMap();
        List<String> a = map.createMap();
        Timer timer = new Timer();
        timer.schedule(src,0,3000);
        while (true){
            while(true){
                System.out.println("jedzenie w magazynie: " + src.food);
                System.out.println("kamien w magazynie: " + src.stone);
                System.out.println("drewno w magazynie: " + src.wood);
                System.out.println("jedzenie na godzinę" + src.foodPT);
                System.out.println("kamień na godzinę" + src.stonePT);
                System.out.println("drewno na godzinę" + src.woodPT);
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
                            if (lvl.get(0) == 1) {
                                farma.upgrade(lvl);
                                src.addFood(15);
                            }else if(lvl.get(0) == 2){
                                kamieniolom.upgrade(lvl);
                                src.addStone(15);
                            }else if(lvl.get(0) == 3){
                                tartak.upgrade(lvl);
                                src.addWood(15);
                            }
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








