/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagementsystem;

public class addbook extends BookInfo {
    public static void AddBook(String book)
    {
        if(mp.containsKey(book)==true)
        {
            mp.put(book,mp.get(book) + 1);
        }
        else{
            mp.put(book,1);
        }
        
    }
    
}
