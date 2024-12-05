
package com.mycompany.librarymanagementsystem;

public class Issue_Book extends BookInfo {
    
    public static void issue_book(String bookname)
    {
        
        if(mp.containsKey(bookname)==true)
        {
            if(mp.put(bookname,mp.get(bookname))==0)
            {
               System.out.println("Book Is Not Available Right Now"); 
            }
            else
            {
            mp.put(bookname,mp.get(bookname) - 1);
            }
        }  
      else
      {
          System.out.println("Book Is Not Available Right Now");
      }
    }
}
