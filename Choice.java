package gierka;

import java.util.List;
import java.util.Scanner;
// razem moĹĽe siÄ…dziemy do tego ;)
// nazwy metod na ENG ;)
public class Choice {
    Scanner scan = new Scanner(System.in);

    String selectField() {
        System.out.println("wybierz 1-5 i a-e");
        String field = scan.nextLine();
        return field;
    }
    int selectBuilding(){
        System.out.println("co chcesz zbudowac?");
        System.out.println(" 1 - farma; 2 - kamieniolom ; 3 - tartak");
        int building = 0;
        try{
            building += scan.nextInt();}
            catch(java.util.InputMismatchException b){System.out.println("nie możesz wykonać tej operacji, ponieważ:");}
        if(building < 4 && building > 0){
            return building; }
        else{
            System.out.println("nie ma takiego budynku");
        return 5;}
    }
    int actions(){
        System.out.println("Co zrobic?: 1 - buduj; 2 - zmien pole");
        int action = 0;
        try{
        action = scan.nextInt(); }
        catch(java.util.InputMismatchException a){System.out.println("nie możesz wykonać tej operacji");}
        return action;
    }

}
