# Hash_basic_java
A simple phone book program that uses a HashMap/Dictionary to store names and phone numbers. It supports adding entries and querying names, printing name=phoneNumber if found, or Not found otherwise. (This is a practice question from HackerRank.)
//Complete this code or write your own from scratch

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        
        HashMap<String,Integer>namNo=new HashMap<>();
        
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            namNo.put(name, phone);
            // Write code here
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(namNo.containsKey(s)){
            System.out.println(s +"="+namNo.get(s));  
          }else{
            System.out.println("Not found");
        }
        }
        in.close();
    }
}
