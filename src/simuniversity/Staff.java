/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuniversity;

/**
 *
 * @author swall
 */
public class Staff extends Employee implements Changeable{
    public String title = "";

public Staff()
{
    title = "";
}    
public Staff (String fName, String lName, String title)
{
    firstName = fName;
    lastName = lName;
    this.title = title;
}    

public void seTtitle()
{
    this.title = title; 
}

public String getTitle()
{
    return title;
}

@Override
public void changeName(String fName, String lName)
{
    firstName = fName;
    lastName = lName;  
}

@Override 
public String toString()
{
    return "Class: Staff, Name: " + getFirstName() + " " + getLastName() + ", Title: " + getTitle();
}
}
