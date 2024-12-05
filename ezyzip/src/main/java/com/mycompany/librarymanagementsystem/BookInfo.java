/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagementsystem;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 88015
 */
public class BookInfo {
    protected static Map<String,Integer> mp = new HashMap<>();
    
    static {
        mp.put("Discrete Mathematics and its Applications", 0);
        mp.put("C Programming Absolute Beginner's Guide", 5);
        mp.put("Introduction to Algorithms", 5);
    }

   
    public static void printBookInfo() {
        System.out.println("<== Book Information ==>");
        for (Map.Entry<String, Integer> entry : mp.entrySet()) {
            System.out.printf("Title: %s | Quantity: %d\n", entry.getKey(), entry.getValue());
        }
    }
}
