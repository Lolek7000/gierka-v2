package gierka;

import java.util.Scanner;

public class Wybor {
    Scanner odt = new Scanner(System.in);
    String wybierzPole(){
        System.out.println("wybierz 1-5 i a-e");
        String pole = odt.nextLine();
            return pole;
    }
    int wybierzBudynek(){
        System.out.println("co chcesz zbudowac?");
        System.out.println(" 1 - farma; 2 - kamieniolom ; 3 - tartak");
        int wbud = odt.nextInt();
        return wbud;
    }
}
