/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 15-12-2020
 *   Time: 15:54
 *   File: AnonymousBlock.java
 */

public class AnonymousBlock {
    AnonymousBlock(){
        System.out.println("non param constructor is invoked");
    }

    AnonymousBlock(int num){
        System.out.println("param constructor is invoked");
    }

    {
        System.out.println("I am anonymous block");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("6");
    }

    public static void main(String[] args) {
        AnonymousBlock ab = new AnonymousBlock();
        AnonymousBlock ab1 = new AnonymousBlock(10);

    }


}
