package com.company;

import java.util.Random;

public class StockItem {
    private String description;
    private int id;
    private float price;
    private int quantity;
    Random rand = new Random();

    StockItem(){
        description = "nothing";
        id = 1;
        price = 0;
        quantity = 0;
    }
    StockItem(String inputdescription, int randint, float inputprice, int inputquantity){
        description = inputdescription;
        id = randint;
        price = inputprice;
        quantity = inputquantity;
    }
    void ToString(StockItem inputStockItem){
    System.out.println("Item description: " + inputStockItem.description + "\nID#: " + inputStockItem.id + "\nPrice: " + inputStockItem.price + "\nStock: " + inputStockItem.quantity);
    }
    String GetDescription(StockItem inputStockItem){
        return inputStockItem.description;
    }
    int GetID(StockItem inputStockItem){
        return inputStockItem.id;
    }
    float GetPrice(StockItem inputStockItem){
        return inputStockItem.price;
    }
    int GetQuantity(StockItem inputStockItem){
        return inputStockItem.quantity;
    }
    /*void SetDescription(String inputDescription, StockItem inputStockItem){
    inputStockItem.description = inputDescription;
    }*/
    void SetPrice(float inputPrice, StockItem inputStockItem){
        if(inputPrice >= 0){
            inputStockItem.price = inputPrice;
        }else{
            System.out.println("ERROR: Price cannot be negative.");
        }

    }
    void RaiseQuantity(int inputQuantity, StockItem inputStockItem){
        inputStockItem.quantity = inputQuantity + inputStockItem.quantity;
    }
    void LowerQuantity(StockItem inputStockItem){
        inputStockItem.quantity = inputStockItem.quantity - 1;
    }
}
