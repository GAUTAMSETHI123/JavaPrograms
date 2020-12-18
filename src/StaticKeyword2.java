/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 16-12-2020
 *   Time: 15:56
 *   File: StaticKeyword2.java
 */

public class StaticKeyword2 {
    static int a =10; //1

    public static void main(String[] args) { //3
        System.out.println("hello world");

    StaticKeyword2.a = 12;
        System.out.println(a);
    }

    static{  //2
        System.out.println("the value of A is " + a);
        System.out.println("the block is invoked");
        System.out.println();
    }




}

// nos here denote the execution of the block of code.