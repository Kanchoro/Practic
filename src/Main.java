

import Lms.Animals;
import Lms.Eagle;
import Lms.Shark;
import Lms.Turtle;


public class Main {
    public static void main(String[] args) {

        Animals[] animals = new Animals[3];
        animals[0] = new Shark();
        animals[1] = new Turtle();
        animals[2] = new Eagle();

        for (Animals animal : animals) {
            if (animal instanceof Shark) {
                ((Shark) animal).attack();
            } else if (animal instanceof Turtle) {
                ((Turtle) animal).swim();
            } else if (animal instanceof Eagle) {
                ((Eagle) animal).fly();
            } else {
                System.out.println("Unknown animal type: " + animal.getClass().getName());
            }
        }

        Shark[] sharks = new Shark[1];
        Turtle[] turtles = new Turtle[1];
        Eagle[] eagles = new Eagle[1];

        int sharkIndex = 0, turtleIndex = 0, eagleIndex = 0;

        for (Animals animal : animals) {
            if (animal instanceof Shark) {
                sharks[sharkIndex++] = (Shark) animal;
            } else if (animal instanceof Turtle) {
                turtles[turtleIndex++] = (Turtle) animal;
            } else if (animal instanceof Eagle) {
                eagles[eagleIndex++] = (Eagle) animal;
            }
        }

        System.out.println("Sharks: " + sharks.length);
        System.out.println("Turtles: " + turtles.length);
        System.out.println("Eagles: " + eagles.length);


    }
}