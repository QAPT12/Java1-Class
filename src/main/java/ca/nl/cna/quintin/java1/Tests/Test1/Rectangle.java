package ca.nl.cna.quintin.java1.Tests.Test1;

/**
 * Class to represent a rectangle.
 *
 * @author quintin.tuck
 */
public class Rectangle {

    private double length;
    private double width;

    /**
     * Constructor for the rectangle. takes in width and height.
     * @param length Length of the rectangle. Must be greater than 0 or is set to 1.
     * @param width Width of the rectangle. Must be greater than 0 or is set to 1.
     */
    public Rectangle(double length, double width) {
        if(length > 0){
        this.length = length;
        } else {this.length = 1;}

        if(width > 0){
        this.width = width;
        } else {this.width = 1;}
    }

    /**
     * get length.
     * @return length.
     */
    public double getLength() {
        return length;
    }

    /**
     * set length.
     * @param length Length of the rectangle. Must be greater than 0 or length is not changed.
     */
    public void setLength(double length) {
        if(length > 0) {
            this.length = length;
        }
    }

    /**
     * get width.
     * @return width.
     */
    public double getWidth() {
        return width;
    }

    /**
     * set width.
     * @param width Width of the rectangle. Must be greater than 0 or width is not changed.
     */
    public void setWidth(double width) {
        if(width > 0) {
            this.width = width;
        }
    }

    /**
     * area.
     * @return The calculated area of the rectangle. (height * width).
     */
    public double area(){
        return this.getLength() * this.getLength();
    }

    /**
     * perimeter.
     * @return The calculated perimeter of the rectangle. (2 * height + 2 * width).
     */
    public double perimeter(){
        return (2 * this.getWidth()) + (2 * this.getLength());
    }

    /**
     * is square.
     * @return True if the rectangle is a square (height = width), False if not.
     */
    public boolean isSquare(){
        return(this.getLength() == this.getWidth());
    }

}
