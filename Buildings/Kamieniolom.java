package gierkaV2.Buildings;
import java.util.ArrayList;
import java.util.List;

public class Kamieniolom  {
    int wood = 150;
    int stone = 100;
    public List build(){
        List<Integer>result = new ArrayList<>();
        result.add(2);
        result.add(1);
        return result;
    }
    public void upgrade(List<Integer>lvl){
        int up = lvl.get(1) + 1;
        lvl.remove(1);
        lvl.add(up);
    }
    }


