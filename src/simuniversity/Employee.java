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
public class Employee extends Person{
    int officeNumber = 0;
    String officePhoneNumber = "";
    String dateOfEmployment = "";
    
   public void setOfficeNumber()
{
    this.officeNumber = officeNumber; 
}

public int getOfficeNumber()
{
    return officeNumber;
}    

   public void setOfficePhoneNumber()
{
    this.officePhoneNumber = officePhoneNumber; 
}

public String getOfficePhoneNumber()
{
    return officePhoneNumber;
}

   public void setDateOfEmployment()
{
    this.dateOfEmployment = dateOfEmployment; 
}

public String getDateOfEmployment()
{
    return dateOfEmployment;
}

}

