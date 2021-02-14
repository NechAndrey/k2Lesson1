package K2dz1.model.service;

import K2dz1.model.*;

public class ObstacleCourse implements ActionObstacleCourse {

    private Treadmill treadmill;
    private Wall wall;
    private Object object;
    private Object[] objects;

    public ObstacleCourse(Treadmill treadmill, Wall wall, Object object) {
        this.treadmill = treadmill;
        this.wall = wall;
        this.object = object;
    }

    public ObstacleCourse(Treadmill treadmill, Wall wall, Object[] objects) {
        this.treadmill = treadmill;
        this.wall = wall;
        this.objects = objects;
    }


    public String run() {
        int countWall = this.wall.getCountWall();
        int heightWall = this.wall.getHeight();
        int distance = this.treadmill.getDistance();
        if (this.objects.length <= 0) {
            if (this.object instanceof Cat) {
                if (((Cat) this.object).getMaxRun() < distance || ((Cat) this.object).getMaxJump() < heightWall) {
                    return "Кот " + ((Cat) this.object).getName() + " не смог проебажать полосу препятсвий";
                } else {
                    return "Кот " + ((Cat) this.object).getName() + " проебажал полосу препятсвий";
                }
            } else if (this.object instanceof Man) {
                if (((Man) this.object).getMaxRun() < distance || ((Man) this.object).getMaxJump() < heightWall) {
                    return "Человек " + ((Man) this.object).getName() + " не смог проебажать полосу препятсвий";
                } else {
                    return "Человек " + ((Man) this.object).getName() + " проебажал полосу препятсвий";
                }
            } else if (this.object instanceof Robot) {
                if (((Robot) this.object).getMaxRun() < distance || ((Robot) this.object).getMaxJump() < heightWall) {
                    return "Робот " + ((Robot) this.object).getName() + " не смог проебажать полосу препятсвий";
                } else {
                    return "Робот " + ((Robot) this.object).getName() + " проебажал полосу препятсвий";
                }
            } else return "Передано значение недопустимого типа, нужен (кот,человек,робот)";
        } else {
            String result = "";
            for (int i = 0; i < objects.length; i++) {
                if (this.objects[i] instanceof Cat) {
                    if (((Cat) this.objects[i]).getMaxRun() < distance || ((Cat) this.objects[i]).getMaxJump() < heightWall) {
                        result = "Кот " + ((Cat) this.objects[i]).getName() + " не смог проебажать полосу препятсвий" + "\n" + result;
                    } else {
                        result = "Кот " + ((Cat) this.objects[i]).getName() + " проебажал полосу препятсвий" + "\n" + result;
                    }
                } else if (this.objects[i] instanceof Man) {
                    if (((Man) this.objects[i]).getMaxRun() < distance || ((Man) this.objects[i]).getMaxJump() < heightWall) {
                        result = "Человек " + ((Man) this.objects[i]).getName() + " не смог проебажать полосу препятсвий" + "\n" + result;
                    } else {
                        result = "Человек " + ((Man) this.objects[i]).getName() + " проебажал полосу препятсвий" + "\n" + result;
                    }
                } else if (this.objects[i] instanceof Robot) {
                    if (((Robot) this.objects[i]).getMaxRun() < distance || ((Robot) this.objects[i]).getMaxJump() < heightWall) {
                        result = "Робот " + ((Robot) this.objects[i]).getName() + " не смог проебажать полосу препятсвий" + "\n" + result;
                    } else {
                        result = "Робот " + ((Robot) this.objects[i]).getName() + " проебажал полосу препятсвий" + "\n" + result;
                    }
                } else result = "Передано значение недопустимого типа, нужен (кот,человек,робот)";
            }
            return result;
        }
    }

}
