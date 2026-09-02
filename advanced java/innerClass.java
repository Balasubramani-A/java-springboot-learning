// package advanced java;

class A{
    public void show(){
        System.out.println("In show ...");
    }
    
    class B{
        public void config(){
            System.out.println("In void ...");
        }
    }
}

public class innerClass {
    public static void main(String args[]){
        A obj = new A();
        obj.show();

        A.B obj1 =  obj.new B();
        obj1.config();
    }
}
