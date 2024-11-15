

import Lms.Animals;
import Lms.Eagle;
import Lms.Shark;
import Lms.Turtle;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animals eagle = new Eagle(10,"eagle");
        Animals shark = new Shark(30,"Shark");
        Animals turtle = new Turtle(15,"Turtle");

        Animals animals = new Animals(15,"Animals");

        Object Turtle = new Turtle(19,"a");
        Object Shark = new Shark(10,"a");
        Object Eagle = new Eagle(1,"a");
        System.out.println(Turtle instanceof Animals);
        System.out.println(Shark instanceof Animals);
        System.out.println(Eagle instanceof Animals);

        Animals [] animals1 = new Animals[]{eagle,shark,turtle};
        Class<?> cls = animals1.getClass();
        System.out.println(cls);
//        for (Animals animals2 : animals1) {
//            System.out.println(animals2.toString());
//        }
    }
}