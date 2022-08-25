/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ss;

import java.util.Scanner;


public class Ss
{


    
    public static void main(String[] args) 
    {
        employee e[]=new employee[2];
        for(int i=0;i<e.length;i++)
        {
            e[i]=new employee();
        }
        for(int i=0;i<e.length;i++)
        {
            e[i].getdata();
        }
        for(int i=0;i<e.length;i++)
        {
            e[i].display();
        }
        for(int i=0;i<e.length;i++)
        {
            e[i].display1();
        }
    }
    
}
class employee
{
    
        String name;
        int id;
        int age;
         String desig;
        String dept;
        double salary;
    
    void getdata()
    {   System.out.println("enter employee details:");
        Scanner o=new Scanner(System.in);
        System.out.println("name:");
        name=o.next();
        System.out.println("id:");
        id=o.nextInt();
        System.out.println("age:");
        age=o.nextInt();
        System.out.println("designation:");
        desig=o.next();
        System.out.println("department:");
        dept=o.next();
        System.out.println("salary:");
        salary=o.nextDouble();
        
    }
    void display()
    {
        if(desig.equals("cse"));
        {
        System.out.println("name:"+name);
        System.out.println("designation:"+desig);
        }
    }
    void display1()
    {
        if(salary>10000)
        {
            System.out.println("name:"+name);
         System.out.println("designation:"+desig);
        }
    }
}

    
    

