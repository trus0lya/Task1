package entity;
import generator.IdGenerator;

import java.util.Objects;

public class Ball {
    private final int id;
    private final Point center;
    private final double radius;

    public Ball(double x, double y, double z, double radius)  {
        this.id = IdGenerator.generateId();
        this.center=new Point(x,y,z);
        this.radius =radius;
    }

    public Point getCenter(){
        return center;
    }
    public double getRadius(){
        return radius;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Ball otherBall)){
            return false;
        }
        return otherBall.getCenter().equals(center) && otherBall.getRadius() == radius;
    }

    @Override
    public String toString() {
        return "entity.Ball{" +
               // "id=" + id +
                ", center=" + center +
                ", radius=" + radius +
                '}';
    }

    @Override
    public int hashCode(){
        return Objects.hash(center,radius);
    }
}
