/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuniversity;

import java.util.ArrayList;

/**
 *
 * @author swall
 */
public class SimUniversity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        ArrayList objects = new ArrayList();
        Student stu1 = new Student("student", "one", "freshman");
        Student stu2 = new Student("student", "two", "sophmore");
        Student stu3 = new Student("student", "three", "junior");
        Student stu4 = new Student("student", "four", "senior");
               
        Staff staff1 = new Staff("Staff", "one", "custodian");
        Staff staff2 = new Staff("Staff", "two", "IT");
        Staff staff3 = new Staff("Staff", "three", "librarian");
        
        Faculty fac1 = new Faculty("Faculty", "one", "associate professor");
        Faculty fac2 = new Faculty("Faculty", "two", "assistant professor");
        Faculty fac3 = new Faculty("Faculty", "three", "professor");
        
        //add to array list
        objects.add(stu1);
        objects.add(stu2);
        objects.add(stu3);
        //added to do 1 student of each class status
        objects.add(stu4);
       
        objects.add(staff1);
        objects.add(staff2);
        objects.add(staff3);
        
        objects.add(fac1);
        objects.add(fac2);
        objects.add(fac3);
        
        // print to string
        for (int i = 0; i < objects.size(); i++)
        {
            System.out.println(objects.get(i).toString());
        }
    }
    
}
