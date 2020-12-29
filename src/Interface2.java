public interface Interface2 {
    void print();
}
interface Interface3{
    void print();
}

class Inter implements Interface2, Interface3{
    public void print(){
        System.out.println("hello");
    }


    public static void main(String[] args) {
        Inter inter = new Inter();
        inter.print();
    }
}

// inheritance first and then interface----this is the order.