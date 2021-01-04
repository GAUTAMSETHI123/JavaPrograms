/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 04-01-2021
 *   Time: 15:26
 *   File: Outer.java
 */

public class Outer {
    static int data =30;
    static class Inner{
        static void msg(){
            System.out.println("data is " + data);
        }
        void show(){
            System.out.println("i am non static show");
        }
    }
}

class Demo2 extends Outer.Inner{
    public static void main(String[] args) {
        msg(); // can call this method in this way because it is static method.
        Demo2 obj = new Demo2();
        obj.show();
    }
}
