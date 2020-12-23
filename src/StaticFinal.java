/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 23-12-2020
 *   Time: 15:48
 *   File: StaticFinal.java
 */

public class StaticFinal {
    static final int FEES;
    static{       //SIB
        FEES=50;
    }

    public static void main(String[] args) {
        System.out.println(StaticFinal.FEES);
        System.out.println(FEES);
    }
}
