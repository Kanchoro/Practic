package Lms;

public class Eagle extends Animals {
    public Eagle(int age, String name) {
        super(age, name);
        System.out.printf("""
                age: %d
                name: %s
                """,age,name);
    }

    @Override
    public void method (){
        System.out.println("Fly");
    }
    public void fly(){
        System.out.println("Fly");
    }

    @Override
    public String toString() {
        return "Eagle{}";
    }
}
