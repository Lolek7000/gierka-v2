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

        }
