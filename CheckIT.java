package gierkaV2;

public class CheckIT {
    void checkBuild(int status) {
        if (status == 1) {
            System.out.println("farma");
        } else if (status == 2) {
            System.out.println( "kamieniolom");
        }else if (status == 3){
            System.out.println("tartak");
        }
    }
    String checkSources(int wood, int stone, int woodPrice, int stonePrice){
        if (wood >= woodPrice && stone >= stonePrice){
            return null;
        }else if (wood < woodPrice && stone >= stonePrice){
            return "Za mało drewna";
        }else if(wood >= woodPrice && stone < stonePrice){
            return "za mało kamienia";
        }else{return "za mało zasobów";}
    }
}
