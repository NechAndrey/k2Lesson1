package K2dz1.model;

public class Wall {
    private int height;
    private int countWall;
    private boolean randomHeight;

    public Wall(int height, int countWall) {
        this.height = height;
        this.countWall = countWall;
    }

    public Wall(int height, int countWall, boolean randomHeight) {
        this.height = height;
        this.countWall = countWall;
        this.randomHeight = randomHeight;
    }

    public int getHeight() {
        return height;
    }

    public int getCountWall() {
        return countWall;
    }

    public boolean isRandomHeight() {
        return randomHeight;
    }
}

