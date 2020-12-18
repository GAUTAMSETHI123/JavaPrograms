/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 14-12-2020
 *   Time: 15:37
 *   File: Java3.java
 */

public class Java3 {
    public static void main(int a)
    {
        System.out.println(a);
    }

    public static void main(String []args) {
        System.out.println("I am in first function");
        main(30);
        Java3 java = new Java3();
        Java3.main(34);
    }
}
