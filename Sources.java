package gierkaV2;

import java.util.TimerTask;

public class Sources extends TimerTask {
    int wood;
    int stone;
    int food;
    int foodPT;
    int woodPT;
    int stonePT;

    @Override
    public void run() {
        wood += woodPT;
        food += foodPT;
        stone += stonePT;
    }

    public void addFood(int x) {
        foodPT += x;
    }

    void addStone(int x) {
        stonePT += x;
    }

    void addWood(int x) {
        woodPT += x;}
        void sourcesStatic(Sources src){
            System.out.println("jedzenie w magazynie: " + src.food);
            System.out.println("kamien w magazynie: " + src.stone);
            System.out.println("drewno w magazynie: " + src.wood);
            System.out.println("jedzenie na godzinę" + src.foodPT);
            System.out.println("kamień na godzinę" + src.stonePT);
            System.out.println("drewno na godzinę" + src.woodPT);
        }
        }
