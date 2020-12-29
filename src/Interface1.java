public interface Interface1 {
    public static final int FEES = 2000;
    public abstract void display();
}

class Tester1 implements Interface1{
    public void display(){
        System.out.println("i am available now");
    }

    public static void main(String[] args) {
        System.out.println("the fees is "+ FEES);
        Tester1 tester = new Tester1();
        tester.display();

        Interface1 inter = new Tester1();  // upcasting
        inter.display();

      // CTE becoz object of interface cant be created..  Interface1 inter2 = new Interface1() {
      //  inter2.display();

       // }
    }
}


// class can implements more than one interface
// interface can extends more than one interface
