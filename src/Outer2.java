/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 04-01-2021
 *   Time: 15:36
 *   File: Outer2.java
 */

public class Outer2 {
    int x = 10;
    static int y = 20;

    class Inner2{
        void show(){
            System.out.println(x);
            System.out.println(y);
        }
    }

    public static void main(String[] args) {
        Outer2 o =  new Outer2();
        System.out.println(o.x);

        Outer2.Inner2 i = new Outer2().new Inner2();
        i.show();
    }
}
