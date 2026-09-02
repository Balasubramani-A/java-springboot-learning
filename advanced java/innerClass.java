// package advanced java;

class A{
    public void show(){
        System.out.println("In show ...");
    }
    
    static class B{
        public void config(){
            System.out.println("In config ...");
        }
    }
}

public class innerClass {
    public static void main(String args[]){
        A obj = new A();
        obj.show();

        A.B obj1 =  new A.B();
        obj1.config();
    }
}
