/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 04-01-2021
 *   Time: 15:46
 *   File: MyOuter.java
 */

public class MyOuter {
    private int x = 5; //instance variable

    public void makeInner() {
        System.out.println(x);
        myInner i = new myInner();
        i.seeOuter();
    }

    class myInner
    {
        public void seeOuter(){
            System.out.println(" Outer x is " + x);
        }
    }// Inner class ends

    public static void main(String[] args) {
        MyOuter my = new MyOuter();
        my.makeInner();

    }
}
