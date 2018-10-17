package gierkaV2.Buildings;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Farma {
    public List build(){
        List<Integer>result = new ArrayList<>();
        result.add(1);
        result.add(1);
        return result;
    }
    public void upgrade(List<Integer>lvl){
        int up = lvl.get(1) + 1;
        lvl.remove(1);
        lvl.add(up);
        }
    }

