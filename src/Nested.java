/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 31-12-2020
 *   Time: 16:09
 *   File: Nested.java
 */

public class Nested {

    int x = 10;
    static int y =13;

    static class NestedClass3{
        static void display(){
            System.out.println(y);
        }

        void show(){
            System.out.println("hello");
        }
    }

    public static void main(String[] args) {
        System.out.println(y);
        NestedClass3 nest = new NestedClass3();
        NestedClass3.display();
        nest.show();
    }
}
