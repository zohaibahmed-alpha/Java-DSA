package strings;

import java.util.*;
public class lec11 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Concatenation
        String firstname = "Zohaib";
        String lastname ="Ahmed";
        String fullname = firstname + lastname;
        System.out.println(fullname.length());
        
        //counting charAt
        for(int i=0; i<fullname.length(); i++){
           System.out.print(fullname.charAt(i));
        }
        
        //Compare Strings
        String name1 = "Zohaib";
        String name2 = "Ahmed";
        if(name1.compareTo(name2) == 0){
            System.out.println("String are equal");
        } else{
            System.out.println("Strings are not equal");
        }

        //SubString
        String sentence = "ZohaibAhmed";
        String name = sentence.substring(0, 6);
        System.out.println(name);
        
        

    }
    
}
