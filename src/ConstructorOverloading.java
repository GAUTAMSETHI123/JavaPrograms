/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 15-12-2020
 *   Time: 15:31
 *   File: ConstructorOverloading.java
 */
import java.util.Scanner;
public class ConstructorOverloading {
    String name,address;
    int age;
    ConstructorOverloading(String name, int age){
        this("agra"); //current class constructor
        // current class constructor must be the first statement.
        this.name=name;
        this.age=age;

    }

    ConstructorOverloading(String address){
        this.address=address;

    }

    public void display(){
        System.out.println("name is " + name  + "\n" + "age is " + age + "\n" + "address is " + address);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your name");
        String name = scanner.nextLine();

        System.out.println("enter your age");
        int age = scanner.nextInt();

        ConstructorOverloading ct = new ConstructorOverloading(name,age);
        ct.display();
    }
}
