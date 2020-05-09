package main.java.com.petrovichNatalja.task_6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Item book = new Item(3, 4);
        Item phone = new Item(1, 100);
        Item toy = new Item(5, 3);
        Item pen = new Item(1, 1);
        ArrayList<Item> items = new ArrayList<>();
        items.add(book);
        items.add(phone);
        items.add(toy);
        items.add(pen);
        Backpack backpack = new Backpack(6, items);
        backpack.showBestCombination();
    }
}
