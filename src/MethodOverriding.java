/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 18-12-2020
 *   Time: 15:36
 *   File: MethodOverriding.java
 */

public class MethodOverriding {
    String fname,lname;
    public void display(){
        System.out.println(" first name is " + fname);
        System.out.println(" last name is" + lname);
    }
}

class MethodOverriding2 extends MethodOverriding{
    int monthlySalary;
    public void display(){
        super.display();
        System.out.println("monthly salary is "+ monthlySalary);
    }

    public static void main(String[] args) {
        MethodOverriding2 mt = new MethodOverriding2();
        mt.fname = "gautam";
        mt.lname = "sethi";
        mt.monthlySalary = 2000;
        mt.display();
    }
}


