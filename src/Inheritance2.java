/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 17-12-2020
 *   Time: 15:54
 *   File: Inheritance2.java
 */

public class Inheritance2 {
    String fname,lname;  //instance variable

    public void display(){
        System.out.println("first name is " + fname);
        System.out.println("last name is "+ lname);
        System.out.println();

    }
}

class FullTimeEmployee extends Inheritance2{
    int monthlySalary;
}

class PartTimeEmployee extends Inheritance2{
    int hourlySalary;
}
class Tester{
    public static void main(String[] args) {
        FullTimeEmployee ft = new FullTimeEmployee();
        PartTimeEmployee ft1 = new PartTimeEmployee();
        ft.fname = "gautam";
        ft.lname = "sethi";
        ft.monthlySalary = 2000;
        ft.display();

        ft1.fname = "gagan";
        ft1.lname = "sethi";
        ft1.hourlySalary = 2999;
        ft1.display();


    }


}
