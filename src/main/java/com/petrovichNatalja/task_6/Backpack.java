package main.java.com.petrovichNatalja.task_6;

import java.util.ArrayList;

public class Backpack {
    private int maxWeight;
    private ArrayList<Item> items;
    private int bestCost;
    private ArrayList<Item> bestCombination;


    public Backpack(int maxWeight, ArrayList<Item> items) {
        this.maxWeight = maxWeight;
        this.items = items;
    }


    private int calcWeigth(ArrayList<Item> items) {
        int sumWeight = 0;
        for (int i = 0; i < items.size(); i++) {
            sumWeight += items.get(i).getWeight();
        }
        return sumWeight;
    }


    private int calcCost(ArrayList<Item> items) {
        int sumCost = 0;
        for (int i = 0; i < items.size(); i++) {
            sumCost += items.get(i).getCost();
        }
        return sumCost;
    }

    private void checkSet(ArrayList<Item> items) {
        if (bestCombination == null) {
            if (calcWeigth(items) <= maxWeight) {
                bestCombination = items;
                bestCost = calcCost(items);
            }
        } else {
            if (calcWeigth(items) <= maxWeight && calcCost(items) > bestCost) {
                bestCombination = items;
                bestCost = calcCost(items);
            }
        }
    }

    private void makeAllSets(ArrayList<Item> items) {
        if (items.size() > 0) {
            checkSet(items);
        }
        for (int i = 0; i < items.size(); i++) {
            ArrayList<Item> newSet = new ArrayList<>();
            newSet.addAll(items);
            newSet.remove(i);
            makeAllSets(newSet);
        }
    }

    public void showBestCombination() {
        makeAllSets(items);
        System.out.println(bestCombination);
    }
}