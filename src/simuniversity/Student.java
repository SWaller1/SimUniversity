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
public class Student extends Person implements Changeable {
     
public String STATUS = "";

public Student()
{
    STATUS = "";
}
public Student (String fName, String lName, String rank)
{
    firstName = fName;
    lastName = lName;
    STATUS = rank;
}

public String getStatus()
{
    return STATUS;         
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
    return "Class: Student, Name: " + getFirstName() + " " + getLastName() + ", Class Status: " + getStatus();
}

}
