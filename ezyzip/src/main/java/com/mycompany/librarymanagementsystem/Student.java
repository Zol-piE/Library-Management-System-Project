
package com.mycompany.librarymanagementsystem;
class Student{
    String UniqueID;
    Student(String UniqueID)
    {
        this.UniqueID=UniqueID;
    }
    Boolean cheack(String UniqueID)
    {
        if(this.UniqueID.equals(UniqueID)) return true;
        return false;
    }
}