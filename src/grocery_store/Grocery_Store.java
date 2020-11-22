/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grocery_store;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;
import java.awt.Image;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Win-10
 */





public class Grocery_Store {
    public static String quantity[] = new String[20];
    public ArrayList<Integer> Total_Product_Price = new ArrayList<Integer>();
    public static ArrayList<String[]> All_user_order_details = new ArrayList<String[]>();
    static int total =0;
    public static void main(String[] args) {           
        new SignIn().setVisible(true);  
        init();
        allUsersRecords();
    }

    public static void init(){
        for(int i=0;i<20;i++){
            quantity[i] = "0";
        }
    }
    
    
    
    public ArrayList getAllUserOrderDetails(){
        return All_user_order_details;
    }
    
    
    public static void allUsersRecords(){ 
        try{
            FileReader filereader = new FileReader("Buyers.csv");
            CSVReader reader = new CSVReaderBuilder(filereader).build();
            List<String[]> user_records = reader.readAll();
            
            for(String[] records : user_records){
               All_user_order_details.add(records);
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
//        System.out.println("This is basically from ArrayList " );
//        for(int i=0;i<All_user_order_details.size();i++){
//            for(String s: All_user_order_details.get(i)){
//                System.out.print(" " + s);
//            }
//            System.out.println(" ");
//        }
//        
}
    
    
    
//    public void ProductPrice() {
//        try{
//            FileReader filereader = new FileReader("Items.csv");
//            CSVReader reader = new CSVReaderBuilder(filereader).withSkipLines(1).build();
//            List<String[]> products = reader.readAll();
//            for(String[] item:products){
//                Product_price.add(item[3]);
//            }
//        }
//        catch(FileNotFoundException e){
//            e.printStackTrace();
//        }
//        catch(IOException e){
//            e.printStackTrace();
//        }
//        catch(CsvException e){
//            e.printStackTrace();
//        }
//    }
    
    
    static public Checkout_Total_Price checkout_total_price = new Checkout_Total_Price();
    public static String Username;
    public void insertUsername(String user){
        quantity[0] = user;
        Username = user;
    }

    
//    
//    
//    public void updateTotalPrice(int total_cost){
//        int Discount = 50;
//        checkout_total_price.setTotalPrice(String.valueOf(total_cost));
//        checkout_total_price.setFinalPrice(String.valueOf(total_cost - Discount));
//        checkout_total_price.setDiscountPrice(String.valueOf(Discount));
//    }
    
    public void Array_records(int id , int c) {         

        quantity[id+1] = Integer.toString(c);
        
        quantity[0] = Username;
        
        try{
            CSVWriter writer = new CSVWriter(new FileWriter("Buy.csv",false));
            List<String[]> records = new ArrayList<>();
//            String [] header = new String[]{"Username","1","2","3","4","5","6","7","8","9","10","11","12","13"};
            String[] header = new String[13];
            header[0] = "Username";
            header[1] = "Total_cost";
            for(int i=2;i<13;i++){
                header[i] = String.valueOf(i-1);
            }
            
            records.add(header);
            records.add(quantity);
            writer.writeAll(records);
            writer.flush();
            writer.close();     

        }
        catch(FileNotFoundException e){
                e.printStackTrace();
                
        }
        catch(IOException e){
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }        
    }



//    public void calculateTotal(){
//        int p=0;
//        for(String q:quantity){
//            if(!q.equals("")){
//                if(Integer.valueOf(q)>0){ 
//                    for(int i=0;i<Product_price.size();i++){
//                        if(Integer.valueOf(Product_price.get(i)) == p){
//                            total += ((Integer.valueOf(Product_price.get(i))) * p);
//                        }
//                    }
//                }
//            }              
//            p++;              
//        }
//       
//    }
    
}