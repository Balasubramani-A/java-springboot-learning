//Annotations are used to indicate to compier on what we are trying to do
class A{
    public void show(){
        System.out.println("In A show...");
    }
}
class B extends A{
    @Override
    public void show(){
        System.out.println("In B show.....");
    }
}

public class annotations {
    public static void main(String args[]){
        B obj = new B();
        obj.show();
    }
}
