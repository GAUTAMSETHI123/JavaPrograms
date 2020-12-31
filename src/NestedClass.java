/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 31-12-2020
 *   Time: 15:59
 *   File: NestedClass.java
 */

public class NestedClass {
    int x = 10;
    static int y =13;

    static class NestedClass2{
           void display(){
            System.out.println(y);
        }
    }

    public static void main(String[] args) {
        System.out.println(y);
        NestedClass2 nest = new NestedClass2();
        nest.display();
    }
}