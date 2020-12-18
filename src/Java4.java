/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 14-12-2020
 *   Time: 15:48
 *   File: Java4.java
 */

public class Java4 {

    void sum(int a, long b)
    {
        System.out.println(a+b);

    }

    void sum(long a , int b)
    {
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        Java4 java = new Java4();
        java.sum(10,20L);
    }
}
