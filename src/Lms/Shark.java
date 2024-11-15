package Lms;

public class Shark extends Animals {

    @Override
    public String toString() {
        return "Shark{}";
    }

    public Shark(int age, String name) {
        super(age, name);
        System.out.printf("""
                age: %d
                name: %s
                """,age,name);
    }

    @Override
    public void method (){
        System.out.println("Swim");
    }
    public void swim(){
        System.out.println("Swim");
    }
}
