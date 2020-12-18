/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 16-12-2020
 *   Time: 15:43
 *   File: StaticKeyword.java
 */

class StaticKeyword {
 String name;
 int age;
 static String cname = "informatics"; //class variable.
  void display(){
      System.out.println("name is " + name);
      System.out.println("age is " + age);
      System.out.println("place is " + cname);

  }

}
class sir{
    public static void main(String[] args) {
        StaticKeyword st = new StaticKeyword();
        st.name="gautam";
        st.age = 20;

        StaticKeyword st1 = new StaticKeyword();
        st1.age = 19;
        st1.name = "sethi";

        st1.display();
        st.display();
    }
}
