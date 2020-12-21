/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 21-12-2020
 *   Time: 15:28
 *   File: Covariant.java
 */

public class Covariant {
}

class B extends Covariant{
}
class C{
}
class Parent{
    public Covariant disp(){  //co-variant return type
        System.out.println("hi");
        return new Covariant();
    }
}

class Child extends Parent{

    public B disp(){
        System.out.println("hello");
        return new B();
    }
    public static void main(String[] args) {
        Child obj = new Child();
        obj.disp();

    }
}
