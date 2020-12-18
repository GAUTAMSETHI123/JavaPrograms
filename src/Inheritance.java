/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 17-12-2020
 *   Time: 15:34
 *   File: Inheritance.java
 */

public class Inheritance {
    void display(){
        System.out.println("i provide black and white pic");
    }
} // parent class ends

class Inherited extends Inheritance
{
    void honk(){
        System.out.println("Beep Beep");

    }

    public static void main(String[] args) {
        Inherited in = new Inherited();
        in.honk();
        in.display();
    }
}