/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositeexample;

import java.util.ArrayList;

/**
 *
 * @author Jorge
 */
public class FruitStore implements Fair {
    
    private ArrayList<Fair> fruitsPurchase = new ArrayList<>();

    @Override
    public double getPrice() {
        double totalPurchase = 0;
        for (int j = 0; j < fruitsPurchase.size(); j++) {
            totalPurchase += fruitsPurchase.get(j).getPrice();
        }
        return totalPurchase;
    }

    @Override
    public void addFruit(Fair r) {
        fruitsPurchase.add(r);
    }

    @Override
    public void removeFruit(Fair r) {
        fruitsPurchase.remove(r);
    }
    
}
