/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 18-12-2020
 *   Time: 16:05
 *   File: MethodOverriding3.java
 */

public class MethodOverriding3 {
    int var = 10;  //instance variable

}

class child2 extends MethodOverriding3{
    int var = 12;

    public static void main(String[] args) {
        MethodOverriding3 mt = new child2();
        System.out.println(mt.var);
    }
}


