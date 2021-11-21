package entity;

import java.util.Objects;

public record Point(double x, double y, double z) {
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Point otherPoint)){
            return false;
        }
        return otherPoint.x() == x && otherPoint.y()==y && otherPoint.z() == z;
    }
    @Override
    public String toString() {
        return "x: "+x+" y: " + y+" z: "+z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x,y,z);
    }
}
