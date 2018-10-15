package gierka;
import java.util.ArrayList;
import java.util.List;


public class WorldsApp {
    public static void main(String[] args) {
        GameMap map = new GameMap();
        List a = map.createMap();
        BuildingController con = new BuildingController();
        Building build = new Building();
        List score = new ArrayList();
        while (true) {
            while (true) {
                Choice choice = new Choice();
                String field = choice.selectField();
                String whatIs = con.checkField(field, score);
                if(whatIs != null){
                    System.out.println(whatIs);}
                else{
                    if (a.indexOf(field) >= 0) {
                        int action = choice.actions();
                        if (action == 1) {
                            int building = choice.selectBuilding();
                            if (building != 5) {
                                score = build.build(field, building);
                                a.remove(field);
                            } else {
                                break; }
                        } else if (action == 2) {
                        break;
                    }
                }
                else{System.out.println("pole poza mapą");}
            }
        }
    }
    }
}












