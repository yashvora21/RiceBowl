/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JFrame;
import model.Item;
import view.ConfirmOrder;
import view.HomePage;
import view.Success;

/**
 *
 * @author YASH
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    private static JFrame home;
    private static JFrame confirm;
    private static JFrame success;
    private static String[] selects;
    public static void main(String[] args) {    
        //Initialize the Home page and display for first time use
        HomePage main = new HomePage();
        home = new JFrame(); //ConfirmOrder.getFrame();
        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        home.add(main); // Add JPanel with components to JFrame
        home.setSize(900,900);
        home.setVisible(true);
    }
    
    //This function basically calculates the total bill value based on the user selections from 'HomePage' 
    public static double calculateBill(ArrayList<Item> items){
        double total=0;
        for(Item i:items){
            total+=i.getCost();
        }
        return total;
    }
    
    //This functions basically receives all the selections by the user from the Order Page
    public static String[] selectedValues(ArrayList<Item> items){
        //'selects' is the String array holding values of the selections made on the Home Page
        selects=new String[items.size()+3];
        DecimalFormat df = new DecimalFormat("#.##");
        double total=MainClass.calculateBill(items),tax=Double.parseDouble(df.format(total*0.075));
        
        if(items.get(0).type.equals("white"))
        selects[0]="White Rice :   $"+ items.get(0).getCost();
        else
        selects[0]="Brown Rice :   $"+ items.get(0).getCost();

        if(items.get(1).getCost() > 0)
        selects[1]="Mixed Vegetables (Yes) :    $"+items.get(1).getCost();
        else
        selects[1]="Mixed Vegetables (No) :    $"+items.get(1).getCost();

        if(items.get(2).getType().equals("chicken"))
        selects[2]="Chicken :   $"+ items.get(2).getCost();
        else
        selects[2]="Beef :   $"+ items.get(2).getCost();

        if(items.get(3).type.equals("spicy"))
        selects[3]="Spicy :   $"+ items.get(3).getCost();
        else if(items.get(3).type.equals("sweet"))
        selects[3]="Sweet :   $"+ items.get(3).getCost();
        else
        selects[3]="Both Sauce :   $"+ items.get(3).getCost();

        if(items.get(4).getCost()>0)
        selects[4]="Sour Cream(Yes) :   $"+items.get(4).getCost();
        else
        selects[4]="Sour Cream(No) :   $"+items.get(4).getCost();

        if(items.get(5).getCost()>0)
        selects[5]="Guacamole(Yes) :   $"+ items.get(5).getCost();
        else
        selects[5]="Guacamole(No) :   $"+ items.get(5).getCost();

        selects[6]="Total :   $"+total;
        
        selects[7]="Tax @ 7.5% :   $"+tax;

        selects[8]="Order Total :   $"+ df.format(total+tax);
        
        return selects;
    } 
    
   //Used when navigated from Confirm Order page and user wants to modify the order
    public static void showHomePage(ArrayList<Item> items){
        HomePage main = new HomePage(items);
        home = new JFrame(); //ConfirmOrder.getFrame();
        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        home.add(main); // Add JPanel with components to JFrame
        home.setSize(900,900);
        home.setVisible(true);
    }
    
    public static void showConfirmOrderPage(ArrayList<Item> items){
        ConfirmOrder cnf=new ConfirmOrder(items);
        confirm= new JFrame(); //ConfirmOrder.getFrame();
        confirm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        confirm.add(cnf); // Add JPanel with components to JFrame
        confirm.setSize(900,900);
        confirm.setVisible(true);
   }
     
      public static void showSuccessPage(ArrayList<Item> items){
        Success s=new Success(items);
        success= new JFrame(); //ConfirmOrder.getFrame();
        success.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        success.add(s); // Add JPanel with components to JFrame
        success.setSize(900,900);
        success.setVisible(true);
   }
}
