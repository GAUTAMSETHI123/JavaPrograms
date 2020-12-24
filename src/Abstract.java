/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 24-12-2020
 *   Time: 15:22
 *   File: Abstract.java
 */

abstract class Abstract {
    public void display(){
        System.out.println("hello everyone");
    }
    public abstract void foodHabit();
}

class Abstract2 extends Abstract{
    public void foodHabit(){
        System.out.println("i am a foodie");
    }

    public static void main(String[] args) {
        Abstract2 ab = new Abstract2();
        ab.display();
        ab.foodHabit();

        Abstract ab2 = new Abstract2();
        ab2.display();
        ab.foodHabit();
    }
}
