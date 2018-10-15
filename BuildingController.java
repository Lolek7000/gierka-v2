package gierka;

import java.util.List;


public class BuildingController {
        String checkField(String field, List buildings) {
        if(buildings.indexOf(field+1) >= 0){
            return "tu stoi farma!!!";
        }
        else if(buildings.indexOf(field+3) >= 0){
            return "tu stoi tartak!!!";
        }
        else if(buildings.indexOf(field+2) >= 0){
            return "tu stoi kamieniolom!!!";
        }
        else{
            return null;
        }
    }
}
