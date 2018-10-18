package gierkaV2.Buildings;
import java.util.ArrayList;
import java.util.List;

public class Kamieniolom  {
    public int woodPrice = 200;
    public int stonePrice = 150;
    public List build(){
        List<Integer>result = new ArrayList<>();
        result.add(2);
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


