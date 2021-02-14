package K2dz1.model;

import K2dz1.model.service.ObstacleCourse;

public class Robot {
    private int maxRun;
    private int maxJump;
    private String name;

    public Robot(int maxRun, int maxJump, String name) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxJump() {
        return maxJump;
    }

    @Override
    public String toString(){
        return this.name;
    }
}
