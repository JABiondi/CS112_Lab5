//Author: James Biondi
//Purpose: Create a vector from an X and Y value.
//Notes:  Contains problem 2 on line 28
import java.lang.Math;
public class Vector {
    private double x;
    private double y;
    private double magnitude;

    public Vector(double x, double y){
        this.x = x;
        this.y = y;
        this.magnitude = Math.sqrt(Math.pow(x,2) + Math.pow(y, 2)); //math to find the magnitude of a vector
    }

    //Getters

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public double getMagnitude() {
        return magnitude;
    }
    //Methods
    public Vector add(Vector newVector){    //Adds the x and y of two vectors together
        return new Vector(newVector.getX() + this.getX(), newVector.getY() + this.getY());
    }
    public Vector add(double xMod, double yMod){    //Problem 2
        return new Vector(getX() + xMod, getY() + yMod); //modifies a vector's x and y by an amount
    }
    public Vector scale(double amt){    //Multiplies the X and Y by an amountx
        return new Vector(getX()*amt, getY()*amt);
    }
}
