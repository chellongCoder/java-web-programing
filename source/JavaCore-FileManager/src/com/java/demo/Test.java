/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 *
 * @author pc
 */
public class Test {
   
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("/Users/pc/Desktop/test.txt");    
            OutputStreamWriter osw = new OutputStreamWriter(fos, "Shift_JIS");
            BufferedWriter fp = new BufferedWriter(osw);

            fp.write("日本語");
            fp.newLine();

            fp.flush();
            fp.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        
    }
}
