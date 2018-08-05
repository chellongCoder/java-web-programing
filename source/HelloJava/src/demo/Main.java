/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.HashMap;

/**
 *
 * @author pc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        HashMap<String, String> myMap = new HashMap<>();
        
        myMap.put("book", "Quyen sach");
        myMap.put("one", "mot");
        
        for (String key : myMap.keySet()) {
            System.out.println(key + " - " + myMap.get(key));
        }
    }
    
}
