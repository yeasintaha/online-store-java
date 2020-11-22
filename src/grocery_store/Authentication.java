/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grocery_store;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;
import java.io.FileNotFoundException;
import java.util.List;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Authentication {

    public int File_csv(String username ,String password){
        boolean flag=false;
        try{
           FileReader filereader = new FileReader("user_information.csv");
           CSVReader reader = new CSVReaderBuilder(filereader).withSkipLines(1).build();       
           List<String[]> Users = reader.readAll();
           for(String[] user:Users){
                if(user[0].toLowerCase().equals(username.toLowerCase().trim()) && user[5].equals(password.trim())){
                    flag=true;                  
                    break;
                }
            }
        }
        catch(IOException e){
            e.printStackTrace(); 
        }
        catch(CsvException e){
            e.printStackTrace();
        }
        if(flag==true) return 1;
        else  return 0;
        
      
    }
    
}
