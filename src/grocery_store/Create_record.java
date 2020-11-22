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
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Win-10
 */
public class Create_record {
    public int Record(String Username , String First, String Last, String Email, String Mobile, String Password){
        int flag=2;
        try{
            CSVWriter writer = new CSVWriter(new FileWriter("user_information.csv",true));
            List<String[]> records = new ArrayList<>();
 
            
            String []record = new String[]{Username ,First,Last,Email,Mobile,Password};
            records.add(record);      
       
            FileReader filereader = new FileReader("user_information.csv");
            CSVReader reader = new CSVReaderBuilder(filereader).withSkipLines(1).build();       
            List<String[]> Users = reader.readAll();
            for(String[] user:Users){
                if(user[0].toLowerCase().equals(Username.toLowerCase().trim())){
                     flag=0;
                     break;
                }
                if(user[3].toLowerCase().equals(Email)){
                     flag=1;
                     break;
                }                     
            }
            if(flag==2){   
                writer.writeAll(records);
                writer.flush();
                writer.close();
            }
            
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        catch(CsvException e){
            e.printStackTrace();
        }
        return flag;
    }
}
