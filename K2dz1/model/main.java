package K2dz1.model;

import K2dz1.model.service.ObstacleCourse;

public class main {
    public static void main(String[] args) {
        StartApp();
    }
    public static void StartApp(){
        //Wall wall = new Wall(19,3);
        //Treadmill treadmill = new Treadmill(200);
        //Cat cat = new Cat(220,20, "vasya");
       // ObstacleCourse adc = new ObstacleCourse(treadmill,wall,cat);
       // System.out.println(adc.run());

        Wall wall1 = new Wall(54,3);
        Treadmill treadmill2 = new Treadmill(150);
        Object[] objects = new Object[3];
        objects[0] = new Cat(20,55,"cat");
        objects[1] = new Robot(500,100,"robot");
        objects[2] = new Man(200,50,"Man");
        ObstacleCourse abc = new ObstacleCourse(treadmill2,wall1,objects);
        System.out.println(abc.run());
    }

}
