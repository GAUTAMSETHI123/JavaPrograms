/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 31-12-2020
 *   Time: 16:18
 *   File: NestedAgain.java
 */

public class NestedAgain {

    static class Inner{
        public static void main(String[] args){
            System.out.println(" i am static nested class main");
        }
    }

    public static void main(String[] args) {
        System.out.println("i am outer class main");
    }
}
