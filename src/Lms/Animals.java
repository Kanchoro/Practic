package Lms;

public class Animals {
    private String name;
    private int age;

    public Animals(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void method (){
        System.out.println("Animals");
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
