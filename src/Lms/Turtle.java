package Lms;

public class Turtle extends Animals{


    @Override
    public String toString() {
        return "Turtle{}";
    }



    public Turtle(int age, String name) {
        super(age, name);
        System.out.printf("""
                age: %d
                name: %s
                """,age,name);
    }

    @Override
    public void method (){
        System.out.println("Turtle");
    }
    public void attack(){
        System.out.println("Attack");
    }
}
