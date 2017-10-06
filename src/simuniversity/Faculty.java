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
public class Faculty extends Employee implements Changeable{
    
    String rank = "";

public Faculty()
{
    rank = "";
}

public Faculty (String fName, String lName, String rank)
{
    firstName = fName;
    lastName = lName;
    this.rank = rank;
}
   public void setRank()
{
    this.rank = rank; 
}

public String getRank()
{
    return rank;
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
    return "Class: Faculty, Name: " + getFirstName() + " " + getLastName() + ", Rank: " + getRank();
}

}

