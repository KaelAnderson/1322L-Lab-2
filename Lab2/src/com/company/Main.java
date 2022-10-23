package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Random rand1 = new Random();

        int random1 = rand1.nextInt(1000);
        int random2 = rand1.nextInt(1000);
        while(random2 == random1){
            random2 = rand1.nextInt(1000);
        }

        StockItem milk = new StockItem("1 Gallon of Milk",random1, (float) 3.6, 15);
        StockItem bread = new StockItem("1 Loaf of Bread",random2, (float) 1.98, 30);

        boolean exit = false;
        do {
            exit = false;
            System.out.println("1. Sold One Milk\n" +
                    "2. Sold One Bread\n" +
                    "3. Change price of Milk\n" +
                    "4. Change price of Bread\n" +
                    "5. Add Milk to Inventory\n" +
                    "6. Add Bread to Inventory\n" +
                    "7. See Inventory\n" +
                    "8. Quit");
            Scanner scan = new Scanner(System.in);
            int input = scan.nextInt();
            switch (input){
                case 1:
                    milk.LowerQuantity(milk);
                    break;
                case 2:
                    bread.LowerQuantity(bread);
                    break;
                case 3:
                    System.out.println("What is the new price for Milk?");
                    milk.SetPrice(scan.nextFloat(),milk);
                    break;
                case 4:
                    System.out.println("What is the new price for Bread?");
                    bread.SetPrice(scan.nextFloat(),bread);
                    break;
                case 5:
                    System.out.println("How many milk did we get?");
                    milk.RaiseQuantity(scan.nextInt(),milk);
                    break;
                case 6:
                    System.out.println("How many bread did we get?");
                    bread.RaiseQuantity(scan.nextInt(),bread);
                    break;
                case 7:
                    bread.ToString(milk);
                    bread.ToString(bread);
                    break;
                case 8:
                    exit = true;
                    break;
            }
        } while (!exit);
    }
}
