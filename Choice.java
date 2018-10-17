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
            catch(java.util.InputMismatchException b){System.out.println("nie możesz wybrać takiego budynku");}
            return building; }

    int actions(){
        System.out.println("Co zrobic?: 1 - buduj; 2 - zmien pole");
        int action = 0;
        try{
        action = scan.nextInt(); }
        catch(java.util.InputMismatchException a){System.out.println("nie możesz wykonać tej operacji");}
        return action;
    }
    int secondActions(){
        System.out.println("Co zrobic?: 1 - ulepsz;2 - zburz 3 - zmien pole");
        int action = 0;
        try{
            action = scan.nextInt(); }
        catch(java.util.InputMismatchException a){System.out.println("nie możesz wykonać tej operacji");}
        return action;
    }
}
