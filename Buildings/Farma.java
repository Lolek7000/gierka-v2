package gierkaV2.Buildings;

import gierkaV2.Sources;

import java.util.ArrayList;
import java.util.List;

public class Farma {
    public int woodPrice = 200;
    public int stonePrice = 200;
    public List build(){
        List<Integer>result = new ArrayList<>();
        result.add(1);
        result.add(1);
        woodPrice += 40;
        stonePrice += 40;
        return result;
    }
    public void upgrade(List<Integer>lvl){
        int up = lvl.get(1) + 1;
        lvl.remove(1);
        lvl.add(up);
        woodPrice += 40;
        stonePrice += 40;
        }
    }

