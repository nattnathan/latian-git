/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latiangit;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sweje
 */
public class Tes1 {
        
    /**
     * @param args the command line arguments
     */
    static String intToRoman(String number)  
    {  
        try {
            int num = Integer.parseInt(number);
            return intToRoman(num);
        } catch (Exception e) {
            return e.getLocalizedMessage();
        }
        
    } 
    static String intToRoman(int num)  
    {  
//        int num = Integer.parseInt(number);
        // storing roman values of digits from 0-9  
        // when placed at different places 
        String m[] = {"", "M", "MM", "MMM"}; 
        String c[] = {"", "C", "CC", "CCC", "CD", "D",  
                            "DC", "DCC", "DCCC", "CM"}; 
        String x[] = {"", "X", "XX", "XXX", "XL", "L",  
                            "LX", "LXX", "LXXX", "XC"}; 
        String i[] = {"", "I", "II", "III", "IV", "V",  
                            "VI", "VII", "VIII", "IX"}; 
              
        // Converting to roman 
        String thousands = m[num/1000]; 
        String hundereds = c[(num%1000)/100]; 
        String tens = x[(num%100)/10]; 
        String ones = i[num%10]; 
              
        String ans = thousands + hundereds + tens + ones; 
              
        return ans; 
    }
    
    public static void main(String[] args) {
        int count = 2500000;
        System.out.println(intToRoman("tujuh puluh enam"));
        System.out.println(generateInvoice(count));
    }
    
    static String generateInvoice(int count){
        String date = new SimpleDateFormat("yyyyMMdd").format(new Date());
        String monthString=date.substring(4,6);
        String yearString=date.substring(2,4);
        return "INV/" + date+ "/" +intToRoman(monthString)+"/" 
                +intToRoman(yearString)+ "/" + ++count;
    }
    
}
