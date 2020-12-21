/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 21-12-2020
 *   Time: 15:42
 *   File: MethodHiding.java
 */

public class MethodHiding {
    public static void classMethod(){
        System.out.println("In parent");
    }
    public void instanceMethod(){
        System.out.println("in parent");
    }
} //class end
 class Child6 extends MethodHiding{
    public static void classMethod(){   //method - hiding
        System.out.println("in child");
    }
    public void instanceMethod(){  // method overriding
        System.out.println("in child");
    }

     public static void main(String[] args) {
         MethodHiding mh = new Child6();
         mh.instanceMethod();  //overridden
         mh.classMethod(); // reference of parent class

         // overridden methods = object call
         // method hiding = reference call
     }
 }